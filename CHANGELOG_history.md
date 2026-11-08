<a name="1.0.10"></a>
### 1.0.10:
- Revert `1.0.9`'s _(**Dark Oak**) Torch_ loot fix which caused the _Mineshaft Chest_ loot table to fail to load entirely (the fix was not necessary, as the loot table was already valid and working properly)

<h2><sub><sub><sup><ins>Download 1.0.10 + 1.21(.1)</ins>:</sup>&#x200A;
<a title="Download (Modrinth):&#10;More Rail Variants 1.0.10 + 1.21(.1)" href="https://www.modrinth.com/mod/KE9A103T/version/Xd2AcFvQ">
<img width=26 src="https://img.shields.io/badge/-%20-%23032a?style=flat&logo=modrinth"></a>&#x200A;
<a title="Download (Curseforge):&#10;1.0.10 + 1.21(.1) - More Rail Variants" href="https://www.curseforge.com/minecraft/mc-mods/more-rail-variants/files/9518718">
<img width=26 src="https://img.shields.io/badge/--%23302a?style=flat&logo=curseforge"></a>
</sub></sub></h2>

<a name="1.0.9"></a>
### 1.0.9:
- `26.2`: Fix _Mineshaft Minecart Chests_ in _Sulfur Caves_ not being able to contain the _Bounce Music Disc_
- Fix _(**Dark Oak**) Torches_ not spawning in _Mesa Mineshafts_ when <ins>More Torch Variants</ins> (&#x200A;<sub><a title="More Torch Variants&#10;on Modrinth" href="https://modrinth.com/mod/more-torch-variants/"><img width=20 src="https://img.shields.io/badge/-%20-%23032a?style=flat&logo=modrinth"></a></sub><!--SEPARATOR_V:MR--><img width=5 height=8 src="https://raw.githubusercontent.com/pnk2u/resources/main/ModProjects/shared/pres/icon/separator_v.svg"><sub><a title="More Torch Variants&#10;on Curseforge" href="https://www.curseforge.com/minecraft/mc-mods/more-torch-variants/"><img width=20 src="https://img.shields.io/badge/--%23302a?style=flat&logo=curseforge"></a></sub>&#x200A;) is installed 

<h2><sub><sub><sup><ins>Download 1.0.9 + 1.21(.1)</ins>:</sup>&#x200A;
<a title="Download (Modrinth):&#10;More Rail Variants 1.0.9 + 1.21(.1)" href="https://www.modrinth.com/mod/KE9A103T/version/9RquBUhk">
<img width=26 src="https://img.shields.io/badge/-%20-%23032a?style=flat&logo=modrinth"></a>&#x200A;
<a title="Download (Curseforge):&#10;1.0.9 + 1.21(.1) - More Rail Variants" href="https://www.curseforge.com/minecraft/mc-mods/more-rail-variants/files/9511827">
<img width=26 src="https://img.shields.io/badge/--%23302a?style=flat&logo=curseforge"></a>
</sub></sub></h2>

<a name="1.0.8"></a>
### 1.0.8:
- `26.1`: Update to <ins>26.1</ins>

<br></br>
<sub>License update to [`CC-BY-NC-SA-4.0`](https://creativecommons.org/licenses/by-nc-sa/4.0/) (previously [`MIT`](https://choosealicense.com/licenses/mit))</sub>

<h2><sub><sub><sup><ins>Download 1.0.8 + 1.21(.1)</ins>:</sup>&#x200A;
<a title="Download (Modrinth):&#10;More Rail Variants 1.0.8 + 1.21(.1)" href="https://www.modrinth.com/mod/KE9A103T/version/FOKpTt0j">
<img width=26 src="https://img.shields.io/badge/-%20-%23032a?style=flat&logo=modrinth"></a>
<sup><img width=7 height=10 src="https://raw.githubusercontent.com/pnk2u/resources/main/ModProjects/shared/pres/icon/separator_v.svg"></sup>
<a title="Download (Curseforge):&#10;1.0.8 + 1.21(.1) - More Rail Variants" href="https://www.curseforge.com/minecraft/mc-mods/more-rail-variants/files/7887834">
<img width=26 src="https://img.shields.io/badge/--%23302a?style=flat&logo=curseforge"></a>
</sub></sub></h2>

<a name="1.0.7"></a>
### 1.0.7:
- `1.20.1`, `1.21(.1)`: Fix Activator Rail behavior

<h2><sub><sub><sup><ins>Download 1.0.7 + 1.21(.1)</ins>:</sup>&#x200A;
<a title="Download (Modrinth):&#10;More Rail Variants 1.0.7 + 1.21(.1)" href="https://www.modrinth.com/mod/KE9A103T/version/IK8ziYhH">
<img width=26 src="https://img.shields.io/badge/-%20-%23032a?style=flat&logo=modrinth"></a>
<sup><img width=7 height=10 src="https://raw.githubusercontent.com/pnk2u/resources/main/ModProjects/shared/pres/icon/separator_v.svg"></sup>
<a title="Download (Curseforge):&#10;1.0.7 + 1.21(.1) - More Rail Variants" href="https://www.curseforge.com/minecraft/mc-mods/more-rail-variants/files/7731680">
<img width=26 src="https://img.shields.io/badge/--%23302a?style=flat&logo=curseforge"></a>
</sub></sub></h2>

<a name="1.0.6"></a>
### 1.0.6:
- Fix ``powered`` state being transferred between all _Powered Rail_ and _Activator Rail_ variants (incl. _Oak_)
> Previously, _Powered Rails_ and _Activator Rails_ could power each other, which is not how vanilla behaves.  
In vanilla Minecraft:
> - Only _**Powered** Rails_ can power other _**Powered** Rails_.
> - Only _**Activator** Rails_ can power other _**Activator** Rails_.
>
>
> This has been corrected. For this purpose, two new block tags were added:
> - `quad-mstv-mrailv:all_powered_rails`
> - `quad-mstv-mrailv:all_activator_rails`
>
> Only rails within the same tag can now transfer power to each other.

<h2><sub><sub><sup><ins>Download 1.0.6 + 1.21(.1)</ins>:</sup>&#x200A;
<a title="Download (Modrinth):&#10;More Rail Variants 1.0.6 + 1.21(.1)" href="https://www.modrinth.com/mod/KE9A103T/version/yOSZTo2J">
<img width=26 src="https://img.shields.io/badge/-%20-%23032a?style=flat&logo=modrinth"></a>
<sup><img width=7 height=10 src="https://raw.githubusercontent.com/pnk2u/resources/main/ModProjects/shared/pres/icon/separator_v.svg"></sup>
<a title="Download (Curseforge):&#10;More Rail Variants 1.0.6 + 1.21(.1)" href="https://www.curseforge.com/minecraft/mc-mods/more-rail-variants/files/7311125">
<img width=26 src="https://img.shields.io/badge/--%23302a?style=flat&logo=curseforge"></a>
</sub></sub></h2>

<a name="1.0.4"></a>
### 1.0.4:
- Add Ukrainian Translation (Thanks to [Starman](https://modrinth.com/user/StarmanMine142))

  
---
<a name="1.0.3"></a>
### 1.0.3:
- Add Simplified Chinese translation (Thanks to [@Surbenii](https://github.com/Surbenii))

  
---
<a name="1.0.2"></a>
### 1.0.2:
- Fix _Powered Rail_ variants not being able to share their powered state with different connected _Powered Rail_ variants

  
---
<a name="1.0.1"></a>
### 1.0.1:
- Fix _Powered Rail_ variants not properly displaying their sloped model when raised towards North or East
- `1.21.4`: Fix Minecarts not properly interacting with Redstone Rail variants

  
---
