package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/*
Data classes ar a type of class that only contain properties, they can provide some utility
methods to work with those properties.  For a list of items that have multiple pieces of types
of data, maybe best to crate a class of properties needed for each single object.
 */
data class Affirmation(
    @StringRes val stringResourceId: Int, //Represents ID for affirmation text in string.xml
    @DrawableRes val imageResourceId: Int //Represents ID for affirmation image in drawable folder
)
