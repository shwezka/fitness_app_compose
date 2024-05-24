package com.example.fitness_app.FloatingMenu

import android.media.Image
import android.widget.ImageButton
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.LeagueSpartan
import com.example.app.ui.theme.Poppins
import com.example.fitness_app.R
import com.example.fitness_app.ui.theme.LightPurple
import com.example.fitness_app.ui.theme.LimeGreen
import com.example.fitness_app.ui.theme.Purple
import com.example.fitness_app.ui.theme.White

@Composable
fun TopBackButtonMenu(text : String,color : Color ,Back:()->Unit){
    Row (modifier = Modifier

        .clickable { Back() }, horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically){
        Spacer(modifier = Modifier.width(35.dp))
        Icon(painter = painterResource(id = R.drawable.nexticon), contentDescription = "", modifier = Modifier
            .width(6.dp)
            .height(11.dp)
            .rotate(180f), tint = LimeGreen
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = text,
            style = TextStyle(
                color = color,
                fontFamily = LeagueSpartan,
                fontWeight = FontWeight.W700,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            ), modifier = Modifier)
    }

}
@Composable
fun DescriptionText(name: String,mail: String,birthday:String){

    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Text(
            text = name,
            style = TextStyle(
                color = White,
                fontFamily = Poppins,
                fontWeight = FontWeight.W700,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            ), modifier = Modifier.padding(0.dp)
        )

        Text(
            text = mail,
            style = TextStyle(
                color = White,
                fontFamily = Poppins,
                fontWeight = FontWeight.W300,
                fontSize = 13.sp,
                textAlign = TextAlign.Center
            ), modifier = Modifier
        )

        Row(
            modifier = Modifier,

        ){
            Text(
                text = "Birthday: ",
                style = TextStyle(
                    color = White,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.W700,
                    fontSize = 13.sp,
                    textAlign = TextAlign.Center
                ), modifier = Modifier
            )
            Text(text = birthday,
                style = TextStyle(
                    color = White,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.W300,
                    fontSize = 13.sp,
                    textAlign = TextAlign.Center
                ), modifier = Modifier )
        }


    }
}
@Composable

fun ProfileDescription() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(LightPurple)
            .padding(top = 31.dp)
            .height(289.dp)
    ) {
        TopBackButtonMenu(text = "My Profile", color = White, {})

        Column(
            modifier = Modifier
                .padding(top=20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.woman),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(125.dp)
                        .height(125.dp)
                        .clip(CircleShape),
                )

            }
            DescriptionText(
                name = "Madison Smith",
                mail = "madisons@example.com","April 1st"
            )
        }
    }
}

@Composable
fun WeightAgeHeightBar(weight:Int,age: Int,height: Float){

    Box(

            modifier = Modifier
                .height(60.dp)
                .width(323.dp)
                .border(
                    width = 1.dp,
                    color = Purple,
                    shape = RoundedCornerShape(14)
                )
                ,
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.kostyl_button_menu),
                contentDescription ="" )

            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                //Вес
                Column(
                    modifier = Modifier
                        .padding(horizontal = 24.dp)
                ) {

                    Text(
                        text = weight.toString()+" Kg",
                        style = TextStyle(
                            color = White,
                            fontFamily = LeagueSpartan,
                            fontWeight = FontWeight.W600,
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        ), modifier = Modifier
                    )
                    Text(
                        text = "Weigh",
                        style = TextStyle(
                            color = White,
                            fontFamily = LeagueSpartan,
                            fontWeight = FontWeight.W300,
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        ), modifier = Modifier
                    )
                }
                VerticalDivider(modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 9.25.dp, bottom = 9.25.dp)
                )

                //Возраст
                Column(
                    modifier = Modifier
                        .padding(horizontal = 40.dp)
                ) {

                    Text(
                        text = age.toString()+" Age",
                        style = TextStyle(
                            color = White,
                            fontFamily = LeagueSpartan,
                            fontWeight = FontWeight.W600,
                            fontSize = 15.sp,
                            textAlign = TextAlign.Justify
                        ), modifier = Modifier
                    )
                    Spacer(modifier = Modifier.height(0.8.dp))
                    Text(
                        text = "Years Old",
                        style = TextStyle(
                            color = White,
                            fontFamily = LeagueSpartan,
                            fontWeight = FontWeight.W300,
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        ), modifier = Modifier
                    )
                }
                VerticalDivider(modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 9.25.dp, bottom = 9.25.dp)
                )

                //Рост
                Column(
                    modifier = Modifier
                        .padding(horizontal = 18.dp)
                ) {

                    Text(
                        text = height.toString()+" CM",
                        style = TextStyle(
                            color = White,
                            fontFamily = LeagueSpartan,
                            fontWeight = FontWeight.W600,
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        ), modifier = Modifier
                    )
                    Spacer(modifier = Modifier.height(0.8.dp))
                    Text(
                        text = "Height",
                        style = TextStyle(
                            color = White,
                            fontFamily = LeagueSpartan,
                            fontWeight = FontWeight.W300,
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        ), modifier = Modifier
                    )
                }

            }
        }
}

@Composable
fun ProfileIconButton(id : Int,text: String, space: Int){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 35.dp, end = 35.dp)
            .clickable { TODO() },

        verticalAlignment = Alignment.CenterVertically

    ) {
        Image(
            painter = painterResource(id = id),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(40.dp)
                .height(40.dp)
                .clip(CircleShape),
        )
        Spacer(modifier = Modifier.width(23.dp))
        Text(
            text =text ,
            style = TextStyle(
                color = White,
                fontFamily = LeagueSpartan,
                fontWeight = FontWeight.W300,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            ), modifier = Modifier .padding(
                top = 13.dp,
                bottom = 13.dp )
            )

        Spacer(modifier = Modifier.width(space.dp))

        Box(modifier = Modifier

        ){
            Icon(
                painter = painterResource(id = R.drawable.nexticon), contentDescription = "",
                modifier = Modifier
                    .width(6.dp)
                    .height(11.dp),
                tint = LimeGreen
            )
        }

    }

}