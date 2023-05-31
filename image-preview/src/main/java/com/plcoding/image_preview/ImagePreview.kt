package com.plcoding.image_preview

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable

@Composable
fun ImagePreview
            (
    context: Context,  mes:String
//    image: Painter,
//    modifier: Modifier = Modifier,
//    description: String = "",
//    contentDescription: String = "",
//    onImageClick: () -> Unit = {}
) {
//    Box(
//        modifier = modifier
//            .aspectRatio(1f)
//            .clip(RoundedCornerShape(10.dp))
//            .shadow(15.dp, RoundedCornerShape(15.dp))
//            .clickable { onImageClick() }
//    ) {
//        Image(
//            painter = image,
//            contentDescription = contentDescription,
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .fillMaxSize()
//        )
//        Text(
//            text = description,
//            style = MaterialTheme.typography.body1,
//            color = Color.White,
//            overflow = TextOverflow.Ellipsis,
//            maxLines = 1,
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(
//                    Brush.verticalGradient(
//                        listOf(
//                            Color.Transparent,
//                            Color.Black
//                        )
//                    )
//                )
//                .align(Alignment.BottomStart)
//                .padding(8.dp)
//        )
//    }


    Toast.makeText(context, mes, Toast.LENGTH_SHORT).show()
}