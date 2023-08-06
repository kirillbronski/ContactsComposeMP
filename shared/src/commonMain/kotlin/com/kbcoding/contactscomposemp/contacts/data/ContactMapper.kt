package com.kbcoding.contactscomposemp.contacts.data

import com.kbcoding.contactscomposemp.contacts.domain.model.Contact
import com.kbcoding.contactscomposemp.core.data.ImageStorage
import database.ContactEntity

suspend fun ContactEntity.toContact(imageStorage: ImageStorage): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phone = phoneNumber,
        photoBytes = imagePath?.let { imageStorage.getImage(it) }
    )
}