package com.saad.e_commerceapp.screens.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.saad.e_commerceapp.R
import com.saad.e_commerceapp.screens.components.EditText
import com.saad.e_commerceapp.screens.components.MainButton
import com.saad.e_commerceapp.screens.components.NormalText
import com.saad.e_commerceapp.screens.components.NormalTextImage
import com.saad.e_commerceapp.screens.components.Socials
import com.saad.e_commerceapp.screens.components.TitleText

@Composable
fun LoginScreen(navController: NavController) {
    Column {
        IconButton(onClick = {
            navController.navigate("signup") {
                popUpTo("login") {
                    inclusive = true
                }
            }
        }) {
            Image(imageVector = Icons.Outlined.KeyboardArrowLeft, contentDescription = "")
        }
        TitleText(
            text = stringResource(id = R.string.login), Modifier
                .padding(24.dp)
                .fillMaxWidth(1f),
            style = TextStyle(
                fontSize = 34.sp,
                fontFamily = FontFamily(Font(R.font.montserratbold))
            )
        )
        GetLoginInfo(navController)
        SocialLogin()
    }
}


@Composable
fun GetLoginInfo(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(.6f)
    ) {
        EditText(
            title = stringResource(id = R.string.email), Modifier
                .fillMaxWidth(1f)
                .padding(15.dp, 0.dp, 15.dp, 0.dp)
        )
        EditText(
            title = stringResource(id = R.string.password), Modifier
                .fillMaxWidth(1f)
                .padding(15.dp, 10.dp, 15.dp, 0.dp)
        )
        NormalTextImage(
            text = stringResource(id = R.string.forgetPass),
            id = R.drawable.baseline_arrow_right_alt_24
        ) { navController.navigate("forgetPass") }
        MainButton(
            text = stringResource(id = R.string.login), modifier = Modifier
                .fillMaxWidth(1f)
                .padding(18.dp, 36.dp, 18.dp, 0.dp),
            textModifies = Modifier
                .padding(0.dp, 10.dp)

        ) {
            navController.navigate("homeScreen") {
                popUpTo("login") {
                    inclusive = true
                }
            }
        }
    }
}

@Composable
fun SocialLogin() {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
//            .background(Color.Cyan)
            .padding(0.dp, 0.dp, 0.dp, 30.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NormalText(text = stringResource(id = R.string.orLogin))
        Spacer(modifier = Modifier.padding(10.dp))
        val interactionSourceG = remember { MutableInteractionSource() }
        val interactionSourceF = remember { MutableInteractionSource() }
        Row {

            Socials(interactionSource = interactionSourceG, id = R.drawable.google)
            Spacer(
                modifier = Modifier
                    .padding(12.dp)
            )
            Socials(interactionSource = interactionSourceF, id = R.drawable.facebook)
        }
    }
}