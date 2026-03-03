#!/bin/bash
# Compilation script for TimeTable Generator

echo "Compiling TimeTable Generator..."
cd src
javac *.java

if [ $? -eq 0 ]; then
    echo "✓ Compilation successful!"
    echo "Run with: java Main"
else
    echo "✗ Compilation failed!"
    exit 1
fi
