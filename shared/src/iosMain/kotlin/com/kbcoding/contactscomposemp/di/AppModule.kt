package com.kbcoding.contactscomposemp.di

import com.kbcoding.contactscomposemp.contacts.data.SqlDelightContactDataSource
import com.kbcoding.contactscomposemp.contacts.domain.source.ContactDataSource
import com.kbcoding.contactscomposemp.core.data.DatabaseDriverFactory
import com.kbcoding.contactscomposemp.database.ContactDatabase

actual class  AppModule {
    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory().create()
            )
        )
    }
}