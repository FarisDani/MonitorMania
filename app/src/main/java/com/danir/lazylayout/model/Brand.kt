package com.danir.lazylayout.model

import android.provider.ContactsContract.CommonDataKinds.Nickname

data class Brand(
    val id: Int,
    val name: String,
    val nickname: String,
    val contact: String,
    val photo: Int,
    val description: String
)