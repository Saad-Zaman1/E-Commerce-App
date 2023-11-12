package com.saad.e_commerceapp.screens.authentication


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.saad.e_commerceapp.R
import com.saad.e_commerceapp.ui.theme.CardClick

@Composable
fun SignUpScreen(navController: NavController) {
    Column {
        IconButton(onClick = {
            navController.navigate("login")
        }) {
            Image(imageVector = Icons.Outlined.KeyboardArrowLeft, contentDescription = "")
        }
        Text(
            text = stringResource(id = R.string.signup),
            style = TextStyle(
                fontSize = 34.sp,
                fontFamily = FontFamily(Font(R.font.montserratbold))
            ),
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(1f)
//                .background(Color.Gray)
        )
        GetSignUpInfo(navController)
        SocialSignUp()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GetSignUpInfo(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
//            .background(Color.Gray)
            .fillMaxWidth(1f)
            .fillMaxHeight(.6f)
    ) {

        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text = stringResource(id = R.string.name)) },
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(15.dp, 0.dp, 15.dp, 0.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                focusedLabelColor = Color.Black,
                disabledLabelColor = Color.Gray,
                errorLabelColor = Color.Red,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text = stringResource(id = R.string.email)) },
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(15.dp, 10.dp, 15.dp, 0.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                focusedLabelColor = Color.Black,
                disabledLabelColor = Color.Gray,
                errorLabelColor = Color.Red,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text = stringResource(id = R.string.password)) },
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(15.dp, 10.dp, 15.dp, 0.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                focusedLabelColor = Color.Black,
                disabledLabelColor = Color.Gray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent


            )
        )
        Row(

            modifier = Modifier
//                .background(Color.Cyan)

                .padding(0.dp, 2.dp, 0.dp, 0.dp)
                .fillMaxWidth(1f),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = stringResource(id = R.string.haveAcc),
                style = TextStyle(
                    fontFamily = FontFamily(Font(R.font.montserratregular))
                ),
                modifier = Modifier
                    .clickable {
                        navController.navigate("login") {
                            popUpTo("signup") {
                                inclusive = true
                            }
                        }
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.baseline_arrow_right_alt_24),
                contentDescription = "",
                modifier = Modifier
                    .padding(0.dp, 0.dp, 10.dp, 0.dp)
            )

        }

        Button(
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.redPrimary)),
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(18.dp, 36.dp, 18.dp, 0.dp),
            onClick = { /*TODO*/ }
        ) {
            Text(
                text = stringResource(id = R.string.signup),
                modifier = Modifier
                    .padding(0.dp, 10.dp)
            )
        }

    }
}

@Composable
fun SocialSignUp() {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
//            .background(Color.Cyan)
            .padding(0.dp, 0.dp, 0.dp, 30.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.orSignup),
            style = TextStyle(
                fontFamily = FontFamily(Font(R.font.montserratregular))
            ),
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Row {
            val interactionSourceG = remember { MutableInteractionSource() }
            val interactionSourceF = remember { MutableInteractionSource() }
            Card(
                modifier = Modifier
                    .size(70.dp)
                    .clickable(
                        onClick = {},
                        interactionSource = interactionSourceG,
                        indication = rememberRipple(color = CardClick)
                    )
            )
            {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White), // Set a background color to see the centering

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(30.dp)
                            .align(Alignment.Center)
                    )
                }
            }
            Spacer(
                modifier = Modifier
                    .padding(12.dp)
            )
            Card(
                modifier = Modifier
                    .size(70.dp)
                    .clickable(
                        onClick = {},
                        interactionSource = interactionSourceF,
                        indication = rememberRipple(color = CardClick)
                    )
            )
            {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White), // Set a background color to see the centering

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.facebook),
                        contentDescription = "",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(30.dp)
                            .align(Alignment.Center)
                    )
                }
            }
        }
    }
}