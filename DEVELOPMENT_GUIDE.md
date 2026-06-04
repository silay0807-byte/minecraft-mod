# Development Guide

## Project Structure

```
minecraft-mod/
├── build.gradle                 # Gradle build configuration
├── settings.gradle              # Gradle settings
├── gradle.properties            # Gradle properties
├── build.bat                    # Windows build script
├── build.sh                     # Linux/macOS build script
├── README.md                    # Main documentation
├── INSTALLATION_GUIDE.md        # Installation instructions
├── DEVELOPMENT_GUIDE.md         # This file
├── .gitignore                   # Git ignore rules
└── src/
    └── main/
        ├── java/com/pancor/tacz/
        │   └── PancorJackhammer.java    # Main mod class
        └── resources/
            ├── META-INF/
            │   └── mods.toml            # Mod metadata
            ├── assets/pancor/
            │   ├── lang/
            │   │   └── en_us.json       # English translations
            │   ├── guns/
            │   │   └── pancor_jackhammer.json
            │   ├── sounds.json
            │   ├── models/gun/
            │   │   └── pancor_jackhammer.json
            │   ├── textures/gun/
            │   │   └── pancor_jackhammer.png
            │   └── sounds/gun/
            │       ├── fire/
            │       ├── reload/
            │       └── firemode.ogg
            └── data/pancor/tacz/gun/
                └── pancor_jackhammer.json
```

## Setting up Development Environment

### Prerequisites
- Java Development Kit (JDK) 17 or higher
- Git
- IDE (IntelliJ IDEA, Eclipse, or VS Code with Java extensions)

### Initial Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/silay0807-byte/minecraft-mod.git
   cd minecraft-mod
   ```

2. **Import into IDE**
   - **IntelliJ IDEA**: File → Open → Select project folder
   - **Eclipse**: File → Import → Gradle → Existing Gradle Project
   - **VS Code**: Open folder and install Java extensions

3. **Configure Gradle**
   ```bash
   ./gradlew clean
   ./gradlew build
   ```

### Run in Development

**Client (with GUI)**
```bash
./gradlew runClient
```

**Server (headless)**
```bash
./gradlew runServer
```

## Code Structure

### Main Mod Class: `PancorJackhammer.java`

This is the entry point for the mod. It:
- Registers the mod with Forge
- Sets up event listeners
- Initializes client setup
- Handles mod lifecycle events

### Registering Components

To add new components to the mod:

1. Create a new class in `com.pancor.tacz` package
2. Annotate with `@Mod.EventBusSubscriber(modid = "pancor")`
3. Use `@SubscribeEvent` for event handlers

Example:
```java
@Mod.EventBusSubscriber(modid = "pancor")
public class MyEventHandler {
    @SubscribeEvent
    public static void onEvent(EntityEvent event) {
        // Handle event
    }
}
```

## JSON Configuration Files

### Gun Configuration: `assets/pancor/guns/pancor_jackhammer.json`

Defines weapon properties:
- Model references
- Damage values
- Fire rate
- Ammo type
- Sound effects
- Attachment slots

### TaCZ Data: `data/pancor/tacz/gun/pancor_jackhammer.json`

TaCZ-specific gun data:
- Gun ID
- Ammo capacity
- Reload time
- Attributes (damage, accuracy, recoil, range, weight)
- Firing mechanics
- Attachment compatibility

### 3D Model: `assets/pancor/models/gun/pancor_jackhammer.json`

Blockbench-style model definition:
- Cube elements (barrel, receiver, stock, magazine, handguard)
- Texture mapping
- Display transformations (first person, third person, GUI, etc.)

### Language File: `assets/pancor/lang/en_us.json`

All in-game text translations:
```json
{
  "gun.pancor.pancor_jackhammer": "Gun Display Name",
  "sound.pancor.gun.fire.jackhammer": "Sound Subtitle"
}
```

### Sounds: `assets/pancor/sounds.json`

Audio event definitions:
- Sound file paths
- Volume and pitch
- Subtitles

## Customizing the Weapon

### Change Damage/Fire Rate

Edit `src/main/resources/data/pancor/tacz/gun/pancor_jackhammer.json`:
```json
"damage": 18.5,
"fire_rate": 1.2
```

### Modify 3D Model

1. Use Blockbench: https://blockbench.net/
2. Import `assets/pancor/models/gun/pancor_jackhammer.json`
3. Edit model elements
4. Export as JSON
5. Replace original file

### Add/Change Textures

1. Replace `assets/pancor/textures/gun/pancor_jackhammer.png` with your texture
2. Update UV coordinates in model JSON if needed
3. Rebuild with `./gradlew build`

### Add Sound Effects

1. Convert your audio to OGG format (Audacity: https://www.audacityteam.org/)
2. Place in appropriate `assets/pancor/sounds/` folder
3. Update `assets/pancor/sounds.json` with correct paths
4. Add translation keys to `en_us.json`

## Building the Mod

### Standard Build
```bash
./gradlew build
```
Output: `build/libs/PancorJackhammer-1.0.0-universal.jar`

### Clean Build
```bash
./gradlew clean build
```

### Build without Tests
```bash
./gradlew build -x test
```

## Debugging

### Enable Debug Mode

Add to `gradle.properties`:
```properties
org.gradle.jvmargs=-Xmx3G -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005
```

### Run Client with Debug Output
```bash
./gradlew runClient --debug
```

### Check Logs
Logs are saved in:
- Windows: `.minecraft/logs/latest.log`
- Linux/macOS: `~/.minecraft/logs/latest.log`

### Common Issues

**Compilation Error: "Cannot find symbol"**
- Solution: Run `./gradlew clean` and rebuild

**JAR File Corrupted**
- Solution: Delete `build/` folder and rebuild

**Gradle Wrapper Issues**
- Solution: Run `./gradlew wrapper --gradle-version 8.0`

## Git Workflow

### Making Changes
```bash
git checkout -b feature/my-feature
git add .
git commit -m "Add my feature"
git push origin feature/my-feature
```

### Create Pull Request
1. Go to GitHub repository
2. Click "New Pull Request"
3. Select your branch
4. Add description
5. Click "Create Pull Request"

## Code Style

### Java Conventions
- Use 4 spaces for indentation
- Use camelCase for variables and methods
- Use PascalCase for class names
- Add Javadoc comments for public methods

### Example:
```java
public class GunHandler {
    /**
     * Fires the gun with specified parameters
     * @param player The player firing
     * @param gun The gun being fired
     */
    public void fireGun(Player player, Gun gun) {
        // Implementation
    }
}
```

## Performance Tips

1. **Cache frequently accessed data**
   ```java
   private static final int DAMAGE = 18;
   ```

2. **Use event subscribers sparingly**
   - Only subscribe to needed events
   - Consider using weak references

3. **Optimize JSON parsing**
   - Load configurations once, not per tick

4. **Profile with JProfiler or YourKit**

## Testing

### Unit Testing (if implemented)
```bash
./gradlew test
```

### Manual Testing Checklist
- [ ] Mod loads without errors
- [ ] Weapon appears in creative menu
- [ ] Weapon can be held in first person
- [ ] Firing sound plays
- [ ] Reload animation plays
- [ ] Damage applies correctly
- [ ] Works with other mods

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make changes
4. Test thoroughly
5. Submit pull request
6. Wait for review

## Resources

- **Forge Documentation**: https://docs.minecraftforge.net/
- **Minecraft Wiki**: https://minecraft.wiki/
- **Blockbench**: https://blockbench.net/
- **TaCZ GitHub**: https://github.com/TimelessCZ/TimelessAndClassicsZero

## Support & Questions

- GitHub Issues: https://github.com/silay0807-byte/minecraft-mod/issues
- GitHub Discussions: https://github.com/silay0807-byte/minecraft-mod/discussions

---

**Last Updated:** 2026-06-04
