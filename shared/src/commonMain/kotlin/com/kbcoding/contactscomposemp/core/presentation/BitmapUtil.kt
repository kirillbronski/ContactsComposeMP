package com.kbcoding.contactscomposemp.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asComposeImageBitmap
import org.jetbrains.skia.Bitmap
import org.jetbrains.skia.Image

//@Composable
//expect fun rememberBitmapFromBytes(bytes: ByteArray?): ImageBitmap?

@Composable
fun rememberBitmapFromBytes(bytes: ByteArray?): ImageBitmap? {
    return remember(bytes) {
        if (bytes != null) {
            Bitmap.makeFromImage(
                Image.makeFromEncoded(bytes)
            ).asComposeImageBitmap()
        } else {
            null
        }
    }
}