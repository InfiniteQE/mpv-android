package com.simongellis.leia_adapter

/**
 * Leia LP2 Renderer Adapter v0.1
 * Copyright (c) 2023 Simon Gellis & Jake Downs
 * This work is licensed under a Creative Commons Attribution 4.0 International License.
 * https://creativecommons.org/licenses/by/4.0/
 */

import android.content.Context
import android.util.AttributeSet
import com.leia.android.opengl.LeiaGLSurfaceView
import com.leia.sdk.views.InterlacedSurfaceView

interface SurfaceViewAdapterInterface {
    fun setRenderer(renderer: LeiaGLSurfaceView.Renderer)
    fun onPause()
    fun onResume()
}

open class LeiaSurfaceViewAdapter : InterlacedSurfaceView, SurfaceViewAdapterInterface {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    private lateinit var leiaRendererAdapter: LeiaRendererAdapter

    // This setRenderer is called by the InterlacedSurfaceView during construction.
    // it will be called with com.leia.sdk.views.InterlacedSurfaceView.Renderer
    override fun setRenderer(renderer: Renderer) {
        // wrap the InterlacedRenderer instance which the parent class constructed
        leiaRendererAdapter = LeiaRendererAdapter(renderer).also {
            super.setRenderer(it)
            setViewAsset(it.asset)
        }
    }

    // This setRenderer is called by the application.
    // The renderer you pass it should draw a 2x1 stereoscopic image, flipped upside down.
    fun setRenderer(renderer: LeiaRenderCustomized) {
        leiaRendererAdapter.innerRenderer = renderer
    }
}