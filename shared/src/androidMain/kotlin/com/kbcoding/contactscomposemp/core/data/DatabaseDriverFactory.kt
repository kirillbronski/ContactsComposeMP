package com.kbcoding.contactscomposemp.core.data

import android.content.Context
import com.kbcoding.contactscomposemp.database.ContactDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(
    private val context: Context
) {
   actual fun create(): SqlDriver {
       return AndroidSqliteDriver(
           ContactDatabase.Schema,
           context,
           "contact.db"
       )
   }
}