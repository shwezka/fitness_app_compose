package com.example.fitness_app.Physical

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.LeagueSpartan
import com.example.app.ui.theme.Poppins
import com.example.fitness_app.ui.theme.Black
import com.example.fitness_app.ui.theme.LimeGreen
import com.example.fitness_app.ui.theme.Purple
import com.example.fitness_app.ui.theme.White


@Composable
fun ActivityLevelButton(isPressed : Boolean,text : String,onClick:()->Unit){

    Button(
        onClick,
        modifier = Modifier
            .height(64.dp)
            .width(323.dp),
            shape = RoundedCornerShape(100f),


        colors = if(isPressed){ButtonDefaults.buttonColors(containerColor =LimeGreen)}
        else{ButtonDefaults.buttonColors(containerColor = White)}

        ){
        Text(text = text, fontSize = 24.sp,
            fontFamily = LeagueSpartan,
            fontWeight = FontWeight(500),
            color = if(isPressed){ Black}
                    else{Purple})
        }
}
@Composable
fun CustomButtonContinue(isEnabled : Boolean,text: String, width: Int, onClick:()->Unit){
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){
        Button(onClick = { onClick() }, modifier = Modifier
            .width(width.dp)
            .height(44.dp)
            .border(width = 0.5.dp,
                color = White,
                shape = RoundedCornerShape(100.dp)),
            colors = ButtonDefaults.buttonColors(containerColor = Black),
            enabled = isEnabled

            ){
            Text(text = text,
                style = TextStyle(
                color = White,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp))
        }
    }
}
