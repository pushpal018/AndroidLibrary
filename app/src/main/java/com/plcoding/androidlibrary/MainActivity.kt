package com.plcoding.androidlibrary

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.plcoding.androidlibrary.ui.theme.AndroidLibraryTheme
import com.plcoding.image_preview.ImagePreview
import com.plcoding.image_preview.ShowToast

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLibraryTheme {
                Box(modifier = Modifier.fillMaxSize()) {

                }
            }
        }
        ShowToast.Toasty(this,"")

    }
}
