package com.example.fitness_app.FillYourProfile

import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.media3.exoplayer.image.ImageDecoder
import com.example.app.ui.theme.LeagueSpartan
import com.example.app.ui.theme.Poppins
import com.example.fitness_app.R
import com.example.fitness_app.ui.theme.Black
import com.example.fitness_app.ui.theme.LimeGreen
import com.example.fitness_app.ui.theme.Purple
import com.example.fitness_app.ui.theme.White

// Here, code praying to the GOD for protecting our project (proj_name) from bugs and other thing.
// This is really crucial step! Be advised to not remove it, even if you don't believer.
//printf("Rahman ve Rahim olan Allah'in adiyla.\n");
@Composable
fun InputFieldsProfile(lable: String, placeholder: String, value: MutableState<String>, keyboardType: KeyboardType, visable: Boolean){
    Column (modifier = Modifier
        .fillMaxWidth()){
        Text(
            text = lable,
            style = TextStyle(
                color = Purple,
                fontFamily = LeagueSpartan,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                textAlign = TextAlign.Center))
        Spacer(modifier = Modifier.height(7.dp))
        OutlinedTextField(
            value = value.value,
            onValueChange = {
                value.value = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .background(White, shape = RoundedCornerShape(15.dp))
                .padding(0.dp),
            textStyle = TextStyle(
                color = Black ,
                fontFamily = Poppins,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                textAlign = TextAlign.Start,
                lineHeight = 14.sp),
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            placeholder = { Text(
                text = placeholder,
                style = TextStyle(color = Black,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Start,
                    lineHeight = 14.sp),
                modifier = Modifier.padding(0.dp)) },
            visualTransformation = if (visable) PasswordVisualTransformation('*') else VisualTransformation.None,
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Black,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
            ),
            maxLines = 1,
        )

    }
}
@Composable
fun CustomButtonStart(text: String, width: Int, onClick:()->Unit){
    Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
        Button(onClick = { onClick() }, modifier = Modifier
            .width(width.dp)
            .height(44.dp)
            .border(width = 0.5.dp, color = Black, shape = RoundedCornerShape(100.dp)),
            colors = ButtonDefaults.buttonColors(containerColor = LimeGreen

            )) {
            Text(
                text = text,
                style = TextStyle(
                    color = Black,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp))
        }
    }
}

@Composable
fun ChangeImageButton(id:Int){
    Box(
        modifier = Modifier


    ){  val bitmap = remember { mutableStateOf<Bitmap?>(null) }
        val context = LocalContext.current
        var imageUri by remember {mutableStateOf<Uri?>(null)}
        val launcher = rememberLauncherForActivityResult(
            contract =
            ActivityResultContracts.GetContent()
        ) { uri: Uri? ->
            imageUri = uri
        }
        TODO("Обработку изображений сюда!")
        /*if (imageUri != null) {
            imageUri?.let {
                if (Build.VERSION.SDK_INT < 28) {
                    bitmap.value =
                        MediaStore.Images.Media.getBitmap(context.contentResolver, it)
                } else {
                    val source = ImageDecoder.createSource(context.contentResolver, it)
                    bitmap.value = ImageDecoder.
                }

                bitmap.value?.let { btm ->
                    Image(
                        bitmap = btm.asImageBitmap(),
                        contentDescription = null,
                        modifier = Modifier.size(151.dp)
                    )
                }
            }
        }
        else{*/
            Image(
                painter = painterResource(id = id),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(125.dp)
                    .height(125.dp)
                    .clip(CircleShape),


                )
        //}

        Image(
            painter = painterResource(
                id = R.drawable.pencil),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(27.dp)
                .height(27.dp)
                .align(Alignment.BottomEnd)
                .clickable { launcher.launch("image/*") }

        )
    }

}