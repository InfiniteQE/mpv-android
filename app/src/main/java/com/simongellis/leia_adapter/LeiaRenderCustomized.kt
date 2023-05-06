package com.simongellis.leia_adapter

abstract class LeiaRenderCustomized() : LeiaRendererInterface {
    private var _pointer = 0L

    init {

    }

    fun finalize() {
        destroy()
    }

    override fun destroy() {
        if (_pointer != 0L) {

        }
    }

    override fun onSurfaceCreated() {

    }

    override fun onSurfaceChanged(width: Int, height: Int) {

    }

    override fun onDrawFrame() {

    }

    override fun onModeChanged(enable3d: Boolean) {
        if (_pointer != 0L) { // leia listener fires after this has "died"

        }
    }
}