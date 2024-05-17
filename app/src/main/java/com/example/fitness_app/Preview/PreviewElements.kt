package com.example.fitness_app.Preview

import android.graphics.RenderEffect.createBlurEffect
import android.os.Build
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.RenderEffect
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.withSave
import com.example.app.ui.theme.LeagueSpartan
import com.example.app.ui.theme.Poppins
import com.example.fitness_app.R
import com.example.fitness_app.ui.theme.LightPurple
import com.example.fitness_app.ui.theme.LimeGreen
import com.example.fitness_app.ui.theme.Purple
import com.example.fitness_app.ui.theme.White


@Composable
fun OnBoardingOne(onClick: () -> Unit){
    Image(bitmap = ImageBitmap.imageResource(id =  R.drawable.oneimagebackground), contentDescription = "", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
    Column(modifier = Modifier
        .fillMaxSize()
        .clickable { onClick() }, verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Welcome to", style = TextStyle(color = LimeGreen, fontFamily = LeagueSpartan, fontWeight = FontWeight.Bold, fontSize = 25.sp))
        Spacer(modifier = Modifier.height(18.dp))
        Image(bitmap = ImageBitmap.imageResource(id = R.drawable.maillogo), contentDescription = "", modifier = Modifier
            .width(182.dp)
            .height(85.dp))
        Row {
            Text(text = "FIT", style = TextStyle(color = LimeGreen, fontFamily = Poppins, fontWeight = FontWeight.ExtraBold, fontSize = 54.sp))
            Text(text = "BODY", style = TextStyle(color = LimeGreen, fontFamily = Poppins, fontWeight = FontWeight.Normal, fontSize = 54.sp))
        }
    }
}

@Composable
fun OnBoardingTwo(imageId: Int, display: Int, text: String, onClick:() -> Unit, Skip:()-> Unit){
    Image(bitmap = ImageBitmap.imageResource(id =  imageId), contentDescription = "", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.height(33.dp))
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(17.dp), horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.CenterVertically){
            Text(text = "Skip", style = TextStyle(color = LimeGreen, fontFamily = LeagueSpartan, fontWeight = FontWeight.Medium, fontSize = 18.sp, textAlign = TextAlign.Center), modifier = Modifier.clickable { Skip() })
            Spacer(modifier = Modifier.width(10.dp).clickable { Skip() })
            Icon(painter = painterResource(id = R.drawable.nexticon), contentDescription = "", modifier = Modifier
                .width(6.dp)
                .height(11.dp).clickable { Skip() }, tint = LimeGreen)
            Spacer(modifier = Modifier.width(29.dp))
        }
        Spacer(modifier = Modifier.height(255.dp))
        Column (modifier = Modifier
            .fillMaxWidth()
            .background(LightPurple), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween){
            Spacer(modifier = Modifier.height(16.dp))
            Icon(painter = painterResource(id = R.drawable.peapleicon), tint = LimeGreen, contentDescription = "", modifier = Modifier
                .width(38.dp)
                .height(43.dp))
            Text(text = text, style = TextStyle(color = White, fontFamily = Poppins, fontWeight = FontWeight.Bold, fontSize = 20.sp, textAlign = TextAlign.Center), modifier = Modifier.width(309.dp))
            Spacer(modifier = Modifier.height(9.dp))
            Row (horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .width(68.dp)
                .height(4.dp)){
                for(it in 1..3){
                    Spacer(modifier = Modifier
                        .width(20.dp)
                        .height(4.dp)
                        .background(if (it == display) White else Purple))
                }
            }
            Spacer(modifier = Modifier.height(28.dp))
        }
        Spacer(modifier = Modifier.height(18.dp))
        Button(onClick = { onClick() }, modifier = Modifier
            .width(211.dp)
            .height(44.dp)
            .border(width = 0.5.dp, color = White, shape = RoundedCornerShape(100.dp)),
            colors = ButtonDefaults.buttonColors(containerColor = Color(255,255,255, 25)

        )) {
            Text(text = if (display != 3) "Next" else "Get Started", style = TextStyle(color = White, fontFamily = Poppins, fontWeight = FontWeight.Bold, fontSize = 18.sp))
            
        }

    }
}