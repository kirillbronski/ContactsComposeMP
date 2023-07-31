package com.kbcoding.contactscomposemp.core.presentation

import androidx.compose.runtime.Composable

expect class ImagePicker {

    @Composable
    fun RegisterPicker(onImagePicked: (ByteArray) -> Unit)

    fun pickImage()
}