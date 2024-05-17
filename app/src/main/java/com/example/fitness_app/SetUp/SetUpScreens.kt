package com.example.fitness_app.SetUp

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.app.ui.theme.LeagueSpartan
import com.example.app.ui.theme.Poppins
import com.example.fitness_app.LoginAndRegister.CastomButtonLog
import com.example.fitness_app.LoginAndRegister.DescriptionText
import com.example.fitness_app.R
import com.example.fitness_app.ui.theme.Black
import com.example.fitness_app.ui.theme.LightPurple
import com.example.fitness_app.ui.theme.LimeGreen
import com.example.fitness_app.ui.theme.White

@Composable
fun SetupMain(navController: NavController){
    LazyColumn (modifier = Modifier
        .fillMaxSize()
        .background(Black)){
        item {
            Image(painter = painterResource(id = R.drawable.setupmain), contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier
                .fillMaxWidth()
                .height(463.dp))
            Spacer(modifier = Modifier.height(32.dp))
            Text(text= "Consistency Is \n" + "the Key To progress.\n" + "Don't Give Up!", style = TextStyle(color = LimeGreen, fontFamily = Poppins, fontWeight = FontWeight.Medium, fontSize = 30.sp, textAlign = TextAlign.Center, lineHeight = 36.sp), modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp))
            Spacer(modifier = Modifier.height(33.dp))
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(LightPurple)
                .padding(horizontal = 35.dp, vertical = 37.dp)){
                Text(text= "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ", style = TextStyle(color = Black, fontFamily = LeagueSpartan, fontWeight = FontWeight.Light, fontSize = 14.sp, textAlign = TextAlign.Center, lineHeight = 14.sp), modifier = Modifier.fillMaxWidth())
            }
            Spacer(modifier = Modifier.height(42.dp))
            CastomButtonLog(text = "Next", width = 178) {navController.navigate("SetUpGender")}
            Spacer(modifier = Modifier.height(37.dp))
        }
    }
}

@Composable
fun SetUpGender(navController: NavController){
    val gender = remember { mutableStateOf(false) }
    LazyColumn (modifier = Modifier
        .fillMaxSize()
        .background(Black)){
        item {
            Spacer(modifier = Modifier.height(38.dp))
            TopBackButton({})
            Spacer(modifier = Modifier.height(36.dp))
            HeaderText("What’s Your Gender")
            Spacer(modifier = Modifier.height(14.dp))
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(LightPurple)
                .padding(horizontal = 34.dp, vertical = 18.dp)){
                Text(text= "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", style = TextStyle(color = Black, fontFamily = LeagueSpartan, fontWeight = FontWeight.Light, fontSize = 14.sp, textAlign = TextAlign.Center, lineHeight = 14.sp), modifier = Modifier.fillMaxWidth())
            }
            Spacer(modifier = Modifier.height(46.dp))
            GenderButton(genderName = "Male", imageId = R.drawable.mangendericon, enabled = gender.value, onClick = {gender.value = !gender.value})
            Spacer(modifier = Modifier.height(19.dp))
            GenderButton(genderName = "Female", imageId = R.drawable.womangendericon, enabled = !gender.value, onClick = {gender.value = !gender.value})
            Spacer(modifier = Modifier.height(47.dp))
            CastomButtonLog(text = "Continue", width = 178) {navController.navigate("SetUpYearOld")}
            Spacer(modifier = Modifier.height(51.dp))
        }
    }
}

@Composable
fun SetUpYearOld(navController: NavController){
    val yearOld = remember { mutableStateOf(18) }
    LazyColumn (modifier = Modifier
        .fillMaxSize()
        .background(Black)){
        item {
            Spacer(modifier = Modifier.height(38.dp))
            TopBackButton({})
            Spacer(modifier = Modifier.height(36.dp))
            HeaderText("How Old Are You?")
            Spacer(modifier = Modifier.height(31.dp))
            DescriptionText(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.")
            Spacer(modifier = Modifier.height(87.dp))
            Text(text= yearOld.value.toString(), style = TextStyle(color = White, fontFamily = Poppins, fontWeight = FontWeight.Bold, fontSize = 64.sp, textAlign = TextAlign.Center), modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(33.dp))
            Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
                Image(painter = painterResource(id = R.drawable.ponitvalue), contentDescription = "", modifier = Modifier
                    .width(46.dp)
                    .height(32.dp))
            }
            Spacer(modifier = Modifier.height(23.dp))
            LazyRowYearOld(yearOld = yearOld)
            Spacer(modifier = Modifier.height(193.dp))
            CastomButtonLog(text = "Continue", width = 178) {}
            Spacer(modifier = Modifier.height(51.dp))
        }
    }
}

