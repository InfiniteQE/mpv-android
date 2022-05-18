# mpv for Android w/ LitByLeia Support

This fork is intended to be used with LitByLeia devices such as the Lume Pad and the RED Hydrogen One

By using this build of MPV Player for Android in combination with [JellyFin for Android](https://github.com/jellyfin/jellyfin-android) You can now stream SBS 3D and 4V content from your PC, Mac or Linux device and view it in 3D/4V right on your LitByLeia device without having to transfer any files manually between devices.

How to use:
1. Download/Install APK from the [Releases](https://github.com/jakedowns/mpv-android/releases) page **(NOTE: if you don't like side-loading apps from unknown sources, see: [DIY](#DIY) section below)
2. Install JellyFin Client for Android, Setup JellyFin server on your PC/Mac/Linux machine which will host your video files
3. In JellyFin Client for Android Go To: **Settings > Client Settings > Video Player Type** and set it to **External Player**
4. Then go to **External player app** and select **MPV Player**
5. Select a 3D video and hit play. It should open in MPV Player. Tap the screen once and press the Gear Icon in the top right corner of the screen.
6. Press "Leia3D 2x1" or "Leia3d 2x2" depending on the content you are viewing.

That's it! You should now be seeing your content streaming from your Jelly Media Server in glorious 3D or 4V!

### Donations Greatly Appreciated

If you find this helpful, please consider making a donation here:

Patreon: [https://patreon.com/jakedowns](https://patreon.com/jakedowns)

Paypal: [https://paypal.me/fallaciousimpala](https://paypal.me/fallaciousimpala)

Venmo: [https://venmo.com/jacobdowns3](https://venmo.com/jacobdowns3)

### DIY

1. You build this fork using Android Studio. (Make sure to follow the steps in [/buildscripts/README.md](/buildscripts/README.md))

2. You could also try using the Official MPV Player:

  a. download 
     - [/app/src/main/assets/leia2x2.hook.glsl](/app/src/main/assets/leia2x2.hook.glsl) 
     - [app/src/main/assets/leia2x2.hook.glsl](app/src/main/assets/leia2x2.hook.glsl) 
     - [app/src/main/assets/leia-over-under.hook.glsl](app/src/main/assets/leia-over-under.hook.glsl) 
     to `/mpv` in the "External Storage" area of your Android device

  b. In MPV Player; Go to Advanced > Edit mpv.conf

  c. add `glsl-shader="/storage/emulated/0/mpv/leia.hook.glsl` for 2x1 SBS video 
  
     or `glsl-shader="/storage/emulated/0/mpv/leia2x2.hook.glsl` for 2x2 4V Videos
     
     or `glsl-shader="/storage/emulated/0/mpv/leia-over-under.hook.glsl` for 2x1 OU (Over Under) / TB (Top Bottom) videos

  d. you'd need some other way to toggle the backlight into 3D mode. like the web helper app from leia
     see https://docs.leialoft.com/developer/webgl-sdk/leia-webgl-sdk
