package com.kbcoding.contactscomposemp.di

import com.kbcoding.contactscomposemp.contacts.domain.source.ContactDataSource

expect class AppModule {
    val contactDataSource: ContactDataSource
}