package com.simongellis.leia_adapter

import com.leia.android.opengl.LeiaGLSurfaceView

/**
 * Leia LP2 Renderer Adapter v0.1
 * Copyright (c) 2023 Simon Gellis & Jake Downs
 * This work is licensed under a Creative Commons Attribution 4.0 International License.
 * https://creativecommons.org/licenses/by/4.0/
 */

interface LeiaRendererInterface : LeiaGLSurfaceView.Renderer {
    fun onSurfaceCreated()
    fun onSurfaceChanged(width: Int, height: Int)
    fun onDrawFrame()
    fun destroy()
    fun onResume() {}
    fun onModeChanged(enable3d: Boolean) {}
}