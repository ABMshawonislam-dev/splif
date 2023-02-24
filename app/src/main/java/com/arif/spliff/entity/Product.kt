package com.arif.spliff.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product")
data class Product(

    @PrimaryKey(autoGenerate = false)
    val id : Int,

    val title : String,
    val price : Double,
    val description : String,
    val category : String,
    val image : String
)
