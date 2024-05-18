package com.example.fitness_app.Physical

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
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
fun PhysicalActivityLevel(
    navController: NavController
){
    var isPressedBeginner by remember{mutableStateOf(false)}
    var isPressedIntermediate by remember{mutableStateOf(false)}
    var isPressedAdvanced by remember{mutableStateOf(false)}
    var isEnabled by remember{mutableStateOf(false)}



    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
    ){  Spacer(modifier = Modifier.height(38.dp))
        TopBackButton({}) //Кнопка возвращения на предыдущее окно
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(36.dp))
            HeaderText("Physical Activity Level") //Заголовок
            Spacer(modifier = Modifier.height(31.dp))
            DescriptionText(text = "Lorem ipsum ") //Текст описания !!ТИМА ИЗМЕНИ!!
            Spacer(modifier = Modifier.height(114.dp))
            ActivityLevelButton( //Beginner Button
                isPressed = isPressedBeginner,
                text = "Beginner",
                onClick = {
                    isPressedBeginner = true
                    isPressedIntermediate = false
                    isPressedAdvanced = false
                    isEnabled = true

                })
            Spacer(modifier = Modifier.height(36.dp))
            ActivityLevelButton( //Intermediate Button
                isPressed = isPressedIntermediate,
                text = "Intermediate",
                onClick = {
                    isPressedBeginner = false
                    isPressedIntermediate = true
                    isPressedAdvanced = false
                    isEnabled = true
                })
            Spacer(modifier = Modifier.height(36.dp))
            ActivityLevelButton( //Advanced Button
                isPressed = isPressedAdvanced,
                text = "Advanced",
                onClick = {
                    isPressedBeginner = false
                    isPressedIntermediate = false
                    isPressedAdvanced = true
                    isEnabled = true

                })
            Spacer(modifier = Modifier.height(148.dp))
            CustomButtonContinue(
                isEnabled,
                text = "Continue",
                width = 178
            ) { navController.navigate("FillYourProfile") }

        }
    }
}
