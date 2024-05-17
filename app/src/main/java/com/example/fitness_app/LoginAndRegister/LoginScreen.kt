package com.example.fitness_app.LoginAndRegister

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.app.ui.theme.LeagueSpartan
import com.example.app.ui.theme.Poppins
import com.example.fitness_app.ui.theme.Black
import com.example.fitness_app.ui.theme.White

@Composable
fun LoginScreen(navController: NavController){
    val login = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Black)) {
        item {
            Spacer(modifier = Modifier.height(30.dp))
            TopTextLogin(text = "Log In", Back = {})
            Spacer(modifier = Modifier.height(64.dp))
            HeaderText("Welcome")
            Spacer(modifier = Modifier.height(26.dp))
            DescriptionText("To use our app log in using your email and password")
            Spacer(modifier = Modifier.height(71.dp))
            BlockInputField {
                InputFiledLogPas(
                    lable = "Username or email",
                    placeholder = "example@example.com",
                    value = login,
                    keyboardType = KeyboardType.Email,
                    visable = false
                )
                Spacer(modifier = Modifier.height(19.dp))
                InputFiledLogPas(
                    lable = "Password",
                    placeholder = "*************",
                    value = password,
                    keyboardType = KeyboardType.Password,
                    visable = true
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = "Forgot Password?",
                    style = TextStyle(
                        color = Black,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        textAlign = TextAlign.End
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {navController.navigate("ForgottenPassword") })
            }
            Spacer(modifier = Modifier.height(41.dp))
            CastomButtonLog(text = "Log In", width = 178, onClick = {})
            Spacer(modifier = Modifier.height(29.dp))
            Text(
                text = "or sign up with",
                style = TextStyle(
                    color = White,
                    fontFamily = LeagueSpartan,
                    fontWeight = FontWeight.Light,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(19.dp))
            AuthorisationMenuIcon()
            Spacer(modifier = Modifier.height(47.dp))
            BottomText(textOne = "Don’t have an account?", textTwo = " Sign Up"){navController.navigate("RegistrationScreen")}
            Spacer(modifier = Modifier.height(39.dp))
        }
    }
}

@Composable
fun RegistrationScreen(navController: NavController){
    val fullName = remember { mutableStateOf("") }
    val mail = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val passwordConfirm = remember { mutableStateOf("") }
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Black)) {
        item {
            Spacer(modifier = Modifier.height(30.dp))
            TopTextLogin(text = "Create Account", Back = {})
            Spacer(modifier = Modifier.height(64.dp))
            HeaderText("let's start!")
            Spacer(modifier = Modifier.height(35.dp))
            BlockInputField {
                InputFiledLogPas(
                    lable = "Full name",
                    placeholder = "Ivanov Ivan Ivanovich",
                    value = fullName,
                    keyboardType = KeyboardType.Text,
                    visable = false
                )
                Spacer(modifier = Modifier.height(19.dp))
                InputFiledLogPas(
                    lable = "Email or Mobile Number",
                    placeholder = "+123 567 89000",
                    value = mail,
                    keyboardType = KeyboardType.Email,
                    visable = false
                )
                Spacer(modifier = Modifier.height(19.dp))
                InputFiledLogPas(
                    lable = "Password",
                    placeholder = "*************",
                    value = password,
                    keyboardType = KeyboardType.Password,
                    visable = true
                )
                Spacer(modifier = Modifier.height(19.dp))
                InputFiledLogPas(
                    lable = "Confirm Password",
                    placeholder = "*************",
                    value = passwordConfirm,
                    keyboardType = KeyboardType.Password,
                    visable = true
                )
            }
            Spacer(modifier = Modifier.height(26.dp))
            PolicyAndTerms(Terms = {}, Policy = {})
            Spacer(modifier = Modifier.height(20.dp))
            CastomButtonLog(text = "Sign Up", width = 178, onClick = {})
            Spacer(modifier = Modifier.height(29.dp))
            Text(
                text = "or sign up with",
                style = TextStyle(
                    color = White,
                    fontFamily = LeagueSpartan,
                    fontWeight = FontWeight.Light,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(19.dp))
            AuthorisationMenuIcon()
            Spacer(modifier = Modifier.height(47.dp))
            BottomText(textOne = "Already have an account?", textTwo = " Log in"){navController.navigate("LoginScreen")}
            Spacer(modifier = Modifier.height(39.dp))
        }
    }
}

@Composable
fun ForgottenPassword(navController: NavController){
    val mail = remember { mutableStateOf("") }
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Black)) {
        item {
            Spacer(modifier = Modifier.height(30.dp))
            TopTextLogin(text = "Forgotten Password", Back = {navController.navigate("LoginScreen")})
            Spacer(modifier = Modifier.height(107.dp))
            HeaderText("Forgot Password?")
            Spacer(modifier = Modifier.height(25.dp))
            DescriptionText(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ")
            Spacer(modifier = Modifier.height(37.dp))
            BlockInputField {
                InputFiledLogPas(
                    lable = "Enter your email address",
                    placeholder = "example@example.com",
                    value = mail,
                    keyboardType = KeyboardType.Email,
                    visable = false
                )
            }
            Spacer(modifier = Modifier.height(46.dp))
            CastomButtonLog(text = "Continue", width = 178, onClick = {navController.navigate("SetPassword")})
        }
    }
}

@Composable
fun SetPassword(navController: NavController){
    val password = remember { mutableStateOf("") }
    val  passwordConfirm = remember { mutableStateOf("") }
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Black)) {
        item {
            Spacer(modifier = Modifier.height(30.dp))
            TopTextLogin(text = "Set Password", Back = {navController.navigate("LoginScreen")})
            Spacer(modifier = Modifier.height(76.dp))
            DescriptionText(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.")
            Spacer(modifier = Modifier.height(39.dp))
            BlockInputField {
                InputFiledLogPas(
                    lable = "Password",
                    placeholder = "*************",
                    value = password,
                    keyboardType = KeyboardType.Email,
                    visable = true
                )
                Spacer(modifier = Modifier.height(13.dp))
                InputFiledLogPas(
                    lable = "Confirm Password",
                    placeholder = "*************",
                    value = passwordConfirm,
                    keyboardType = KeyboardType.Email,
                    visable = true
                )
            }
            Spacer(modifier = Modifier.height(46.dp))
            CastomButtonLog(text = "Reset Password", width = 240, onClick = {navController.navigate("LoginScreen")})
        }
    }
}