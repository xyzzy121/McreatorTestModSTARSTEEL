# check_python.ps1

# Check if we are running as administrator
$isAdmin = ([Security.Principal.WindowsPrincipal] [Security.Principal.WindowsIdentity]::GetCurrent()).IsInRole([Security.Principal.WindowsBuiltInRole] "Administrator")
if (-not $isAdmin)
{
    # Relaunch as an admin
    $arguments = "-ExecutionPolicy Bypass -NoProfile -File `"$PSCommandPath`""
    Start-Process powershell -Verb runAs -ArgumentList $arguments
    Break
}

# Function to check if command exists
function command_exists($cmd) {
    $oldPreference = $ErrorActionPreference
    $ErrorActionPreference = 'stop'
    $process = $null
    try {
        if (Get-Command $cmd) {
            return $true
        }
    } catch {
        return $false
    } finally {
        $ErrorActionPreference = $oldPreference
    }
}

# Check for Python
if (command_exists('python')) {
    Write-Host "Python is already installed on your system. Version: $(python --version)"
} else {
    Write-Host "Python is not found on your system."

    # Check for Chocolatey
    if (-not (command_exists('choco'))) {
        Write-Host "Chocolatey, a software management solution, is not installed. We need it to install Python for you."
        Write-Host "Now, we will download and install Chocolatey..."
        Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))
    }

    # Install Python
    Write-Host "Now we will use Chocolatey to install Python..."
    choco install python -y

    Write-Host "Python installation is complete. Version: $(python --version)"
}

# Run Python script
Write-Host "We will now run the Python script..."
$pythonScriptPath = Join-Path $PSScriptRoot "OggFIleTickCount.py"
python $pythonScriptPath

# Uninstall Chocolatey
Write-Host "The Python script has finished running."
$uninstallChoco = Read-Host "If you want, we can uninstall Chocolatey for you. Do you want to do this? (Y/N)"
if ($uninstallChoco -eq 'Y') {
    Write-Host "Uninstalling Chocolatey..."
    Remove-Item -Recurse -Force "$env:ChocolateyInstall"
    [Environment]::SetEnvironmentVariable("ChocolateyInstall", $null, "User")
    Write-Host "Chocolatey has been successfully uninstalled."
}

# Uninstall Python
$uninstallPython = Read-Host "We can also uninstall Python if you don't need it anymore. Do you want to uninstall Python? (Y/N)"
if ($uninstallPython -eq 'Y') {
    Write-Host "Uninstalling Python..."
    choco uninstall python -y
    Write-Host "Python has been successfully uninstalled."
}
# Pause at the end
Read-Host "Press any key to exit."
