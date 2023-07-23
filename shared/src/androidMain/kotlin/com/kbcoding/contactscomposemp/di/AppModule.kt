package com.kbcoding.contactscomposemp.di

import android.content.Context
import com.kbcoding.contactscomposemp.contacts.data.SqlDelightContactDataSource
import com.kbcoding.contactscomposemp.contacts.domain.source.ContactDataSource
import com.kbcoding.contactscomposemp.core.data.DatabaseDriverFactory
import com.kbcoding.contactscomposemp.database.ContactDatabase

actual class AppModule(
    private val context: Context
) {
    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory(context).create()
            )
        )
    }
}