package com.plcoding.image_preview

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable

@Composable
fun showToast(context: Context?, mes: String?) {
    Toast.makeText(context, mes, Toast.LENGTH_SHORT).show()
}