<!--publish=true-->
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