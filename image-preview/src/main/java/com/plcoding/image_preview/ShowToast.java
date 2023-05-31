package com.plcoding.image_preview;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {
    public static void Toasty(Context context,String mes){

        Toast.makeText(context, mes, Toast.LENGTH_SHORT).show();
    }
}
