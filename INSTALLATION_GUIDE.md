# Pancor Jackhammer - Installation Guide

## System Requirements

- **Java**: JDK 17 or higher
- **Minecraft**: 1.20.1
- **Forge**: 47.3.0 or higher
- **TaCZ (Timeless and Classics Zero)**: 1.5.0 or higher
- **RAM**: Minimum 2GB allocated to Minecraft, 4GB recommended

## Option 1: Install Pre-built JAR (Easiest)

### Step 1: Download Minecraft Forge
1. Go to https://files.minecraftforge.net/
2. Select Minecraft 1.20.1
3. Download the **Installer** version
4. Run the installer and select "Install client"
5. Click "OK" and wait for installation to complete

### Step 2: Install TaCZ Mod
1. Download TaCZ 1.5.0 or higher from:
   - CurseForge: https://www.curseforge.com/minecraft/mods/timeless-and-classics-zero
   - Modrinth: https://modrinth.com/mod/timeless-and-classics-zero
2. Place the JAR file in your `.minecraft/mods` folder

### Step 3: Install Pancor Jackhammer Mod
1. Download the latest `PancorJackhammer-1.0.0-universal.jar` from:
   - GitHub Releases: https://github.com/silay0807-byte/minecraft-mod/releases
2. Place the JAR file in your `.minecraft/mods` folder

### Step 4: Launch Minecraft
1. Open the Minecraft Launcher
2. Select the Forge 1.20.1 profile from the dropdown
3. Click "Play"
4. Wait for the game to load (first launch may take longer)
5. Go to Mods menu to confirm both TaCZ and Pancor Jackhammer are loaded

## Option 2: Build from Source

### Prerequisites
- Git: https://git-scm.com/
- Java JDK 17+: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

### Step 1: Clone the Repository
```bash
git clone https://github.com/silay0807-byte/minecraft-mod.git
cd minecraft-mod
```

### Step 2: Build the Project

**On Windows:**
```batch
build.bat
```

**On Linux/macOS:**
```bash
chmod +x build.sh
./build.sh
```

**Or manually:**
```bash
./gradlew build
```

### Step 3: Locate the Built JAR
The compiled mod will be at:
```
build/libs/PancorJackhammer-1.0.0-universal.jar
```

### Step 4: Install the MOD
1. Copy `PancorJackhammer-1.0.0-universal.jar` to your `.minecraft/mods` folder
2. Ensure TaCZ is also in the mods folder
3. Launch Minecraft with Forge 1.20.1 profile

## Finding Your .minecraft Folder

**Windows:**
```
C:\Users\<YourUsername>\AppData\Roaming\.minecraft\mods
```

**macOS:**
```
~/Library/Application Support/minecraft/mods
```

**Linux:**
```
~/.minecraft/mods
```

## Verifying Installation

1. Launch Minecraft Forge 1.20.1
2. Go to "Mods" in the main menu
3. Search for "pancor" or "Pancor Jackhammer"
4. Confirm the mod appears in the list with status "Loaded"
5. Also verify "Timeless and Classics Zero" is present

## Using the Pancor Jackhammer

### Getting the Weapon
- **Survival Mode**: Use `/give @s pancor:pancor_jackhammer` command
- **Creative Mode**: Search for "Pancor Jackhammer" in the creative menu

### Controls
- **Right Click**: Fire the weapon
- **R Key**: Reload (configurable in TaCZ settings)
- **Middle Mouse**: Switch fire modes (if available)
- **Right Mouse + Shift**: Aim down sights

## Troubleshooting

### "Pancor Jackhammer mod failed to load"
**Solution:**
1. Verify Forge version is 47.3.0 or higher
2. Check that TaCZ 1.5.0+ is installed
3. Delete the `.minecraft/crash-reports` folder
4. Relaunch Minecraft

### "No sound effects"
**Solution:**
1. Check that sound files are in `assets/pancor/sounds/` directory
2. Verify Minecraft volume is not muted
3. Ensure sound files are in .ogg format

### "Cannot see the weapon"
**Solution:**
1. Verify the 3D model file exists: `assets/pancor/models/gun/pancor_jackhammer.json`
2. Check texture file exists: `assets/pancor/textures/gun/pancor_jackhammer.png`
3. Ensure JSON syntax is valid

### "Java version error"
**Solution:**
```bash
java -version
```
If version is below 17, download and install Java 17 or higher

### Mod crashes on startup
**Solution:**
1. Check Minecraft logs in `.minecraft/logs/latest.log`
2. Look for error messages related to "pancor"
3. Verify all dependencies are installed
4. Update Forge and TaCZ to latest versions

## Support

For issues or questions:
1. Check GitHub Issues: https://github.com/silay0807-byte/minecraft-mod/issues
2. Read the README.md for more information
3. Check TaCZ documentation: https://github.com/TimelessCZ/TimelessAndClassicsZero/wiki

## Compatibility Notes

✅ **Compatible with:**
- Forge 1.20.1
- TaCZ 1.5.0+
- Most other mods (check mod compatibility lists)

⚠️ **Potential conflicts:**
- Other gun mods (may cause weapon name conflicts)
- Custom resource packs (may override textures)

## Performance Tips

1. Allocate more RAM to Minecraft (4GB+ recommended)
2. Disable fancy graphics if experiencing lag
3. Lower render distance if needed
4. Disable sound if still experiencing issues

---

**Last Updated:** 2026-06-04  
**Version:** 1.0.0
