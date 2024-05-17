package com.example.fitness_app.SetUp

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.app.ui.theme.LeagueSpartan
import com.example.app.ui.theme.Poppins
import com.example.fitness_app.R
import com.example.fitness_app.ui.theme.Black
import com.example.fitness_app.ui.theme.LightPurple
import com.example.fitness_app.ui.theme.LimeGreen
import com.example.fitness_app.ui.theme.White

@Composable
fun TopBackButton(Back:()->Unit){
    Row (modifier = Modifier

        .clickable { Back() }, horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically){
        Spacer(modifier = Modifier.width(35.dp))
        Icon(painter = painterResource(id = R.drawable.nexticon), contentDescription = "", modifier = Modifier
            .width(6.dp)
            .height(11.dp)
            .rotate(180f), tint = LimeGreen
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "Back", style = TextStyle(color = LimeGreen, fontFamily = LeagueSpartan, fontWeight = FontWeight.SemiBold, fontSize = 15.sp, textAlign = TextAlign.Center), modifier = Modifier)
    }
}

@Composable
fun HeaderText(text: String){
    Text(text = text, style = TextStyle(color = White, fontFamily = LeagueSpartan, fontWeight = FontWeight.SemiBold, fontSize = 25.sp, textAlign = TextAlign.Center), modifier = Modifier.fillMaxWidth())
}

@Composable
fun GenderButton( genderName: String, imageId: Int, enabled: Boolean, onClick: () ->Unit){
    Column (modifier = Modifier.fillMaxWidth(), horizontalAlignment =Alignment.CenterHorizontally) {
        Button(
            onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor =  Color(255, 255, 255, 25),
                contentColor = White,
                disabledContainerColor = LimeGreen,
                disabledContentColor = Black
            ),
            enabled = enabled,
            modifier = Modifier
                .size(163.dp)
                .border(
                    if (enabled) 1.dp else 0.dp,
                    color = if (enabled) White else Color.Transparent,
                    shape = CircleShape
                ),

            ) {
            Icon(painter = painterResource(id = imageId), contentDescription = "",  modifier = Modifier.size(67.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = genderName, style = TextStyle(color = White, fontFamily = Poppins, fontWeight = FontWeight.Bold, fontSize = 20.sp, textAlign = TextAlign.Center), modifier = Modifier)
    }
}


@Composable
fun LazyRowYearOld(yearOld: MutableState<Int>){
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(118.dp)) {
        val listState = rememberLazyListState()
        val centerIndex = remember { derivedStateOf { (listState.firstVisibleItemIndex + listState.layoutInfo.visibleItemsInfo.size / 2) } }
        LazyRow(
            state = listState,
            modifier = Modifier
                .fillMaxWidth()
                .height(99.dp)
                .background(LightPurple)
        ) {
            items(100) { index ->
                val color = if (index == centerIndex.value) {
                    yearOld.value = index
                    White
                } else {
                    Black
                }
                Box(
                    modifier = Modifier
                        .width(68.dp)
                        .padding(horizontal = 7.dp, vertical = 27.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = index.toString(),
                        style = TextStyle(
                            color = color,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Bold,
                            fontSize = 35.sp,
                            textAlign = TextAlign.Center
                        )
                    )
                }
            }
        }

    }
}