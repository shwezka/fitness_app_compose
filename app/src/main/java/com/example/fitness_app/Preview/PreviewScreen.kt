package com.example.fitness_app.Preview

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.app.ui.theme.Poppins
import com.example.fitness_app.R
import com.example.fitness_app.ui.theme.Black
import com.example.fitness_app.ui.theme.LimeGreen


@Composable
fun LoadingScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Black), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(bitmap = ImageBitmap.imageResource(id = R.drawable.maillogo), contentDescription = "", modifier = Modifier
            .width(135.dp)
            .height(63.dp))
        Spacer(modifier = Modifier.height(11.dp))
        Row {
            Text(text = "FIT", style = TextStyle(color = LimeGreen, fontFamily = Poppins, fontWeight = FontWeight.ExtraBold, fontSize = 54.sp))
            Text(text = "BODY", style = TextStyle(color = LimeGreen, fontFamily = Poppins, fontWeight = FontWeight.Normal, fontSize = 54.sp))
        }
    }

    Handler(Looper.getMainLooper()).postDelayed({
        navController.navigate("PreviewScreen")
    }, 2000)

}
@Composable
fun PreviewScreen(navController: NavController){
    var screen by remember { mutableStateOf(0) }
    if(screen == 0){
        OnBoardingOne(){screen+=1}
    } else if(screen == 1) {
        OnBoardingTwo(imageId = R.drawable.twoimagebackground, display = 1, "Start your journey towards a more active lifestyle", onClick = {screen+=1}){screen=3}
    } else if(screen == 2) {
        OnBoardingTwo(imageId = R.drawable.treeimagebackground, display = 2, "Find nutrition tips that fit your lifestyle", onClick = {screen+=1}){screen=3}
    } else if(screen == 3) {
        OnBoardingTwo(imageId = R.drawable.frooimagebackground, display = 3, "A community for you, challenge yourself", onClick = {navController.navigate("LoginScreen")}){screen=3}
    }
}