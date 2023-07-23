package com.kbcoding.contactscomposemp.contacts.data

import com.kbcoding.contactscomposemp.contacts.domain.model.Contact
import database.ContactEntity

fun ContactEntity.toContact(): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phone = phoneNumber,
        photoBytes = null
    )
}