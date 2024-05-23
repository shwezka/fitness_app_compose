package com.example.fitness_app.FloatingMenu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fitness_app.SetUp.HeaderText
import com.example.fitness_app.SetUp.TopBackButton
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.fitness_app.FillYourProfile.ChangeImageButton
import com.example.fitness_app.R
import com.example.fitness_app.ui.theme.Black
import com.example.fitness_app.ui.theme.LightPurple
import com.example.fitness_app.ui.theme.White

@Composable
fun ProfileScreen(navController: NavController){

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Black),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        item{

            Box(
                modifier = Modifier
                    .height(380.dp)
            ){
                ProfileDescription()
            Column(
                modifier = Modifier
                    .padding(top = 289.dp, start = 35.dp , end = 35.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                WeightAgeHeightBar(weight = 75, age = 28, height = 1.65f)
            }

            }


        }
    }
}
