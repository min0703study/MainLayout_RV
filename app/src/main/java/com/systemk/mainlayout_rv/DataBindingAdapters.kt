package com.systemk.mainlayout_rv

import android.net.Uri
import android.widget.ImageView
import androidx.databinding.BindingAdapter

class DataBindingAdapters {

    @BindingAdapter("imageResource")
    fun setImageUri(view: ImageView, imageUri: String?) {
        if (imageUri == null) {
            view.setImageURI(null)
        } else {
            view.setImageURI(Uri.parse(imageUri))
        }
    }
}