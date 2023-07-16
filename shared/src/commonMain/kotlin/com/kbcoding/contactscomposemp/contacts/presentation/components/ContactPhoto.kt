package com.kbcoding.contactscomposemp.contacts.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale.Companion
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kbcoding.contactscomposemp.contacts.domain.model.Contact
import com.kbcoding.contactscomposemp.core.presentation.rememberBitmapFromBytes
import com.kbcoding.contactscomposemp.ui.theme.OnGreenSecondaryContainerLight

@Composable
fun ContactPhoto(
    contact: Contact?,
    modifier: Modifier = Modifier,
    iconSize: Dp = 25.dp
) {
    val bitmap = rememberBitmapFromBytes(contact?.photoBytes)
    val photoModifier = modifier.clip(RoundedCornerShape(35))

    if (bitmap != null) {
        Image(
            bitmap = bitmap,
            contentDescription = contact?.firstName,
            modifier = photoModifier,
            contentScale = Companion.Crop
        )
    } else {
        Box(
            modifier = photoModifier.background(MaterialTheme.colors.secondaryVariant),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Rounded.Person,
                contentDescription = contact?.firstName,
                modifier = Modifier.size(iconSize),
                tint = OnGreenSecondaryContainerLight //
            )
        }
    }
}