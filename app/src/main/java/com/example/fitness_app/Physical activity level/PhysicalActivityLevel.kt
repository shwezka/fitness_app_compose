package com.example.fitness_app.Physical

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.fitness_app.LoginAndRegister.CastomButtonLog
import com.example.fitness_app.LoginAndRegister.DescriptionText
import com.example.fitness_app.SetUp.HeaderText
import com.example.fitness_app.SetUp.TopBackButton
import com.example.fitness_app.ui.theme.Black



@Composable
fun PhysicalActivityLevel (navController: NavController){
    LazyColumn( modifier = Modifier
        .fillMaxSize()
        .background(Black)){
            item {
                Spacer(modifier = Modifier.height(38.dp))
                TopBackButton({}) //Кнопка возвращения на предыдущее окно
                Spacer(modifier = Modifier.height(36.dp))
                HeaderText("Physical Activity Level") //Заголовок
                Spacer(modifier = Modifier.height(31.dp))
                DescriptionText(text = "Lorem ipsum ") //Текст описания !!ТИМА ИЗМЕНИ!!
                CastomButtonLog(text = "Continue", width = 178){navController.navigate("FillYourProfile")}

            }

    }





}
