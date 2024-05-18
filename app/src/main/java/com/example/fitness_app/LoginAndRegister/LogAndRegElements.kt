package com.example.fitness_app.LoginAndRegister

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
import com.example.fitness_app.R
import com.example.fitness_app.ui.theme.Black
import com.example.fitness_app.ui.theme.LightPurple
import com.example.fitness_app.ui.theme.LimeGreen
import com.example.fitness_app.ui.theme.White
import androidx.compose.material3.Text as Text

@Composable
fun TopTextLogin(text: String, Back:()->Unit){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 35.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically){
        Icon(painter = painterResource(id = R.drawable.nexticon), contentDescription = "", modifier = Modifier
            .width(6.dp)
            .height(11.dp)
            .rotate(180f)
            .clickable { Back() }, tint = LimeGreen)
        Text(text = text, style = TextStyle(color = LimeGreen, fontFamily = Poppins, fontWeight = FontWeight.Bold, fontSize = 20.sp, textAlign = TextAlign.Center), modifier = Modifier.clickable { })
        Spacer(modifier = Modifier.width(6.dp))
    }
}

@Composable
fun HeaderText(text: String){
    Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Text(text = text, style = TextStyle(color = White, fontFamily = Poppins, fontWeight = FontWeight.Bold, fontSize = 20.sp, textAlign = TextAlign.Center))
    }
}
@Composable
fun DescriptionText(text: String){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 35.dp), horizontalArrangement = Arrangement.Center) {
        Text(text = text, style = TextStyle(color = White, fontFamily = LeagueSpartan, fontWeight = FontWeight.Light, fontSize = 14.sp, textAlign = TextAlign.Center))
    }
}

@Composable
fun BlockInputField(component: @Composable () -> Unit){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(LightPurple)){
        Column(modifier = Modifier.padding(horizontal = 35.dp, vertical = 25.dp)){
            component()
        }
    }
}

@Composable
fun InputFiledLogPas(lable: String, placeholder: String, value: MutableState<String>,  keyboardType: KeyboardType, visable: Boolean){
    Column (modifier = Modifier
        .fillMaxWidth()){
        Text(text = lable, style = TextStyle(color = Black, fontFamily = LeagueSpartan, fontWeight = FontWeight.Medium, fontSize = 18.sp, textAlign = TextAlign.Center))
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
            textStyle = TextStyle(color = Black, fontFamily = Poppins, fontWeight = FontWeight.Normal, fontSize = 14.sp, textAlign = TextAlign.Start, lineHeight = 14.sp),
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
fun CastomButtonLog(text: String, width: Int, onClick:()->Unit){
    Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
        Button(onClick = { onClick() }, modifier = Modifier
            .width(width.dp)
            .height(44.dp)
            .border(width = 0.5.dp, color = White, shape = RoundedCornerShape(100.dp)),
            colors = ButtonDefaults.buttonColors(containerColor = Color(255,255,255, 25)

            )) {
            Text(text = text, style = TextStyle(color = White, fontFamily = Poppins, fontWeight = FontWeight.Bold, fontSize = 18.sp))
        }
    }
}


@Composable
fun AuthorisationMenuIcon(){
    Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.googleicon), contentDescription = "", modifier = Modifier.size(51.dp))
    }
}

@Composable
fun BottomText(textOne: String, textTwo: String, onClick: () -> Unit){
    Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
        Text(text = textOne, style = TextStyle(color = White, fontFamily = LeagueSpartan, fontWeight = FontWeight.Light, fontSize = 14.sp))
        Text(text = textTwo, style = TextStyle(color = LimeGreen, fontFamily = LeagueSpartan, fontWeight = FontWeight.Light, fontSize = 14.sp), modifier =Modifier.clickable { onClick() })
    }
}

@Composable
fun PolicyAndTerms(Terms: () -> Unit, Policy: ()-> Unit){
Column (modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
    Text(text = "By continuing, you agree to", style = TextStyle(color = White, fontFamily = LeagueSpartan, fontWeight = FontWeight.Light, fontSize = 13.sp))
    Row{
        Text(text = "Terms of Use",style = TextStyle(color = LimeGreen, fontFamily = LeagueSpartan, fontWeight = FontWeight.Light, fontSize = 13.sp), modifier = Modifier.clickable { Terms() })
        Text(text = " and ",style = TextStyle(color = White, fontFamily = LeagueSpartan, fontWeight = FontWeight.Light, fontSize = 13.sp))
        Text(text = "Privacy Policy.",style = TextStyle(color = LimeGreen, fontFamily = LeagueSpartan, fontWeight = FontWeight.Light, fontSize = 13.sp), modifier = Modifier.clickable { Policy() })
    }
}
}

/*@Composable
fun AdvanceButton(text: String,onClick: () -> Unit) {
    val isActive = remember { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxWidth()) {
        Button(
            onClick = {
                isActive.value = !isActive.value
                onClick()
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isActive.value) Color.Yellow else Color.White,
                contentColor = Color.Black
            )
        ) {
            Text(text = text, style = TextStyle(color = Black, fontFamily = LeagueSpartan, fontWeight = FontWeight.Medium, fontSize = 18.sp, textAlign = TextAlign.Center))
        }
    }

}*/