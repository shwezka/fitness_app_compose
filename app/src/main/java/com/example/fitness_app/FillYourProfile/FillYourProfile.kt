package com.example.fitness_app.FillYourProfile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.app.ui.theme.LeagueSpartan
import com.example.fitness_app.LoginAndRegister.CastomButtonLog
import com.example.fitness_app.LoginAndRegister.DescriptionText
import com.example.fitness_app.LoginAndRegister.InputFiledLogPas
import com.example.fitness_app.R
import com.example.fitness_app.R.drawable
import com.example.fitness_app.SetUp.HeaderText
import com.example.fitness_app.SetUp.TopBackButton
import com.example.fitness_app.ui.theme.Black
import com.example.fitness_app.ui.theme.LightPurple

@Composable
fun FillYourProfile(navController: NavController){
    val fullName = remember { mutableStateOf("") }
    val nickName = remember { mutableStateOf("") }
    val mail = remember { mutableStateOf("") }
    val phone = remember { mutableStateOf("") }
    LazyColumn (modifier = Modifier
        .fillMaxSize()
        .background(Black)
    ){
        item {
            Spacer(modifier = Modifier.height(38.dp))
            TopBackButton({}) //Кнопка возвращения на предыдущее окно
            Spacer(modifier = Modifier.height(36.dp))
            HeaderText("Fill Your Profile") //Заголовок
            Spacer(modifier = Modifier.height(31.dp))

            DescriptionText(text = "Lorem ipsum ") //Текст описания !!ТИМА ИЗМЕНИ!!
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(LightPurple)
                .padding(horizontal = 34.dp, vertical = 18.dp),
                ){
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center
                ){
                    ChangeImageButton(id = R.drawable.woman)
                }
            }
            Spacer(modifier = Modifier.height(42.dp))
            InputFieldsProfile(
                lable = "Full name",
                placeholder = "Madison Smith",
                value = fullName,
                keyboardType = KeyboardType.Text,
                visable = true
            )
            Spacer(modifier = Modifier.height(14.dp))
            InputFieldsProfile(
                lable = "Nickname",
                placeholder = "Madison",
                value = nickName,
                keyboardType = KeyboardType.Text,
                visable = true
            )
            Spacer(modifier = Modifier.height(14.dp))
            InputFieldsProfile(
                lable = "Email",
                placeholder = "madisons@example.com",
                value = mail,
                keyboardType = KeyboardType.Email,
                visable = true
            )
            Spacer(modifier = Modifier.height(14.dp))
            InputFieldsProfile(
                lable = "Mobile Number",
                placeholder = "+123 567 89000",
                value = phone,
                keyboardType = KeyboardType.Number,
                visable = true
            )
            Spacer(modifier = Modifier.height(28.dp))
            CustomButtonStart(text = "Start", width = 173) {navController.navigate("")}

        }
    }

}
