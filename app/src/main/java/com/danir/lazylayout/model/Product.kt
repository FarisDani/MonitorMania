package com.danir.lazylayout.model

import android.provider.ContactsContract.CommonDataKinds.Photo

data class Product(
    val id: Int,
    val name: String,
    val price: String,
    val photo: Int,
    val specs: String,
)