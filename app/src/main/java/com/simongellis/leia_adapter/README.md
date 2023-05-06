## Leia Surface View Adapter

SimonGellis [https://github.com/SupernaviX](https://github.com/SupernaviX)
JakeDowns [https://github.com/jakedowns](https://github.com/jakedowns)

## Usage

1. Depending on the surface you want to charm with 3D support, either replace SurfaceView in your layout xml with LeiaSurfaceViewAdapter, or, if you have your own extended View, have it extend LeiaSurfaceViewAdapter rather than SurfaceView directly
2. Whatever class you're using to draw to your existing surface view should implement the LeiaRendererInterface
3. make sure your renderer provides an upside-down 2x1 image

### Gotchas
1. make sure to add `leia-cnsdk` dir to your project (contains cnsdk.aar)
1. make sure `include ':leia-cnsdk'` is in your settings.gradle
1. make sure `android.sourceSets.main.jniLibs.srcDirs` contains `./../distribution/leia_sdk/lib` in **build.gradle**
1. make sure to add `<option value="$PROJECT_DIR$/leia-cnsdk" />` to gradle.xml

## TODOS:

- [ ] Implement N-View (Quilt) support with dynamic switching based on face-tracking position
- [ ] Potentially include optional support for novel-view synthesis via Shader to lerp between Quilt views

## License

This work is licensed under a [Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/).
