#!/bin/bash

echo "Building Pancor Jackhammer Mod for Minecraft 1.20.1"
echo ""
echo "Cleaning previous builds..."
./gradlew clean

echo ""
echo "Building mod..."
./gradlew build

echo ""
echo "Build complete! JAR file located in: build/libs/PancorJackhammer-1.0.0-universal.jar"
echo ""
echo "Installation:"
echo "1. Copy the JAR file to your .minecraft/mods folder"
echo "2. Make sure you have Forge 47.3.0+ installed"
echo "3. Make sure you have TaCZ 1.5.0+ installed"
echo "4. Launch Minecraft and enjoy!"
echo ""
