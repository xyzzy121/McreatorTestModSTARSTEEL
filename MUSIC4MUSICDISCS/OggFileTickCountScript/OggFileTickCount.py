import os
import subprocess
import sys
import tkinter as tk
from tkinter import filedialog
import pkg_resources

REQUIRED_PACKAGES = ["soundfile", "numpy"]

def check_and_install_packages():
    """Check for required packages and prompt to install if missing."""
    for package in REQUIRED_PACKAGES:
        try:
            dist = pkg_resources.get_distribution(package)
            print("{} ({}) is installed".format(dist.key, dist.version))
        except pkg_resources.DistributionNotFound:
            print("{} is NOT installed".format(package))
            user_input = input("Do you want to install it now? (Y/N): ")
            if user_input.lower() == "y":
                subprocess.check_call([sys.executable, "-m", "pip", "install", package])

def get_audio_file_length(file_path):
    import soundfile as sf  # Import here after checking and installing packages
    """Return audio file length in seconds."""
    data, samplerate = sf.read(file_path)
    return len(data) / samplerate

def get_ticks_in_audio(file_path):
    """Return number of ticks in the audio file."""
    length_in_seconds = get_audio_file_length(file_path)
    return length_in_seconds * 20

def select_and_analyze_audio():
    """Select an audio file and print its tick count."""
    root = tk.Tk()
    root.withdraw()
    file_path = filedialog.askopenfilename(title="Select an Audio File")
    print(f"Number of ticks in the audio file: {get_ticks_in_audio(file_path)}")

if __name__ == "__main__":
    check_and_install_packages()
    select_and_analyze_audio()
