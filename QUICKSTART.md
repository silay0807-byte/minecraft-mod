# ⚡ Quick Start Guide

## 🚀 30-Second Setup

### For Players
```bash
1. Download: Forge 47.3.0 + TaCZ 1.5.0 + This Mod
2. Place JARs in: .minecraft/mods/
3. Launch: Minecraft with Forge profile
4. Get weapon: /give @s pancor:pancor_jackhammer
5. Play!
```

### For Developers
```bash
1. Clone: git clone <repo-url>
2. Build: ./gradlew build
3. Find JAR: build/libs/PancorJackhammer-1.0.0-universal.jar
4. Test: ./gradlew runClient
```

---

## 📋 Essential Commands

### Building
```bash
./gradlew build              # Full build
./gradlew clean build        # Clean rebuild
./gradlew runClient          # Test in game
./gradlew runServer          # Test server
```

### In-Game
```
/give @s pancor:pancor_jackhammer    # Get weapon
F3 + T                               # Reload resources
R                                    # Reload weapon
Right Click                          # Fire
```

---

## 📁 Important Files

| File | Purpose |
|------|---------|
| `build.gradle` | Gradle config |
| `src/main/java/...` | Java code |
| `assets/pancor/guns/` | Gun config |
| `assets/pancor/models/` | 3D model |
| `assets/pancor/textures/` | Textures |
| `assets/pancor/sounds/` | Sound files |

---

## 📚 Full Documentation

| Guide | For |
|-------|-----|
| [README.md](README.md) | Overview & features |
| [INSTALLATION_GUIDE.md](INSTALLATION_GUIDE.md) | Installing the mod |
| [JAR_USAGE_GUIDE.md](JAR_USAGE_GUIDE.md) | Using the JAR file |
| [DEVELOPMENT_GUIDE.md](DEVELOPMENT_GUIDE.md) | Developing/modifying |
| [PROJECT_SUMMARY.md](PROJECT_SUMMARY.md) | Complete info |
| [CONTRIBUTING.md](CONTRIBUTING.md) | Contributing |

---

## ✅ Requirements

- **Minecraft:** 1.20.1
- **Forge:** 47.3.0+
- **TaCZ:** 1.5.0+
- **Java:** 17+
- **RAM:** 2GB+ (4GB recommended)

---

## 🎯 Next Steps

**Just want to use the mod?**
→ Go to [INSTALLATION_GUIDE.md](INSTALLATION_GUIDE.md)

**Want to modify the weapon?**
→ Go to [DEVELOPMENT_GUIDE.md](DEVELOPMENT_GUIDE.md)

**Found a bug?**
→ Open an issue on GitHub

**Want to help?**
→ See [CONTRIBUTING.md](CONTRIBUTING.md)

---

## 🆘 Troubleshooting

**Mod won't load?**
- Check Java 17+: `java -version`
- Verify Forge 47.3.0+
- Ensure TaCZ is installed
- Restart Minecraft

**Weapon doesn't appear?**
- Reload resources: F3 + T
- Check mods are loaded
- Verify creative menu sync

**No sounds?**
- Check system volume
- Verify Minecraft volume in settings
- Check sound files exist

More help: [JAR_USAGE_GUIDE.md](JAR_USAGE_GUIDE.md#troubleshooting-jar-installation)

---

**Version:** 1.0.0  
**License:** MIT  
**Status:** ✅ Stable
