package com.kbcoding.contactscomposemp.contacts.domain.model

data class Contact(
    val id: Long?,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val photoBytes: ByteArray?
)
