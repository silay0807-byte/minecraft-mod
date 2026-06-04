# Changelog

## [1.0.0] - 2026-06-04

### Added
- Initial release of Pancor Jackhammer addon mod for TaCZ
- Full 3D model for Pancor Jackhammer shotgun
- Firing mechanics with 8 pellet spread
- Reload system with sound effects
- Fire mode switching
- Attachment support (scopes, muzzles)
- English language localization
- Build scripts for Windows and Linux
- Comprehensive installation guide
- Development guide

### Features
- **3D Model**: Detailed Blockbench model with barrel, receiver, stock, magazine, and handguard
- **Realistic Ballistics**: 
  - Damage: 18.5 HP
  - Fire Rate: 1.2 shots/second
  - Spread: 8.5°
  - Recoil: 2.8
  - Range: 50 blocks
- **Sound Effects**:
  - Shotgun fire sound
  - Reload start sound
  - Reload chamber sound
  - Fire mode switch sound
- **TaCZ Integration**: Full compatibility with Timeless and Classics Zero
- **Customizable**: Adjustable damage, fire rate, magazine size, reload time

### Configuration
- Gun parameters in `assets/pancor/guns/pancor_jackhammer.json`
- TaCZ data in `data/pancor/tacz/gun/pancor_jackhammer.json`
- 3D model in `assets/pancor/models/gun/pancor_jackhammer.json`

### Technical
- Built with Forge 47.3.0
- Minecraft 1.20.1 compatible
- Java 17+ required
- Gradle build system

### Known Issues
- Texture is placeholder (needs real texture file)
- Sound files are placeholders (need .ogg files)
- No additional fire modes implemented

### Future Plans
- [ ] Custom fire modes (burst fire)
- [ ] Additional attachment types
- [ ] Magazine variants
- [ ] Camo texture options
- [ ] Animation improvements
- [ ] Special ammo types
- [ ] Multiplayer testing
- [ ] Performance optimization

---

**Repository**: https://github.com/silay0807-byte/minecraft-mod
**License**: MIT
