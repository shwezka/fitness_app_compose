package com.example.fitness_app.FillYourProfile

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.LeagueSpartan
import com.example.app.ui.theme.Poppins
import com.example.fitness_app.ui.theme.Black
import com.example.fitness_app.ui.theme.LimeGreen
import com.example.fitness_app.ui.theme.Purple
import com.example.fitness_app.ui.theme.White

@Composable
fun InputFieldsProfile(lable: String, placeholder: String, value: MutableState<String>, keyboardType: KeyboardType, visable: Boolean){
    Column (modifier = Modifier
        .fillMaxWidth()){
        Text(text = lable, style = TextStyle(color = Purple, fontFamily = LeagueSpartan, fontWeight = FontWeight.Medium, fontSize = 18.sp, textAlign = TextAlign.Center))
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
            textStyle = TextStyle(color = Black ,fontFamily = Poppins, fontWeight = FontWeight.Normal, fontSize = 14.sp, textAlign = TextAlign.Start, lineHeight = 14.sp),
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            placeholder = { Text(text = placeholder, style = TextStyle(color = Black, fontFamily = Poppins, fontWeight = FontWeight.Normal, fontSize = 14.sp, textAlign = TextAlign.Start, lineHeight = 14.sp), modifier = Modifier.padding(0.dp)) },
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
            Text(text = text, style = TextStyle(color = Black, fontFamily = Poppins, fontWeight = FontWeight.Bold, fontSize = 18.sp))
        }
    }
}