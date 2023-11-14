package com.saad.e_commerceapp.screens.authentication


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.saad.e_commerceapp.R
import com.saad.e_commerceapp.screens.components.EditText
import com.saad.e_commerceapp.screens.components.MainButton
import com.saad.e_commerceapp.screens.components.TitleText

@Composable
fun ForgetPasswordScreen(navController: NavController) {
    Column {
        IconButton(onClick = {
            navController.navigate("login") {
                popUpTo("forgetPass") {
                    inclusive = true
                }
                popUpTo("login") {
                    inclusive = true
                }
            }
        }) {
            Image(imageVector = Icons.Outlined.KeyboardArrowLeft, contentDescription = "")
        }
        TitleText(
            text = stringResource(id = R.string.forgetPass), modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(1f),
            style = TextStyle(
                fontSize = 34.sp,
                fontFamily = FontFamily(Font(R.font.montserratbold))
            )
        )
        GetAccountInfo()
    }
}

@Preview
@Composable
fun GetAccountInfo() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
//            .background(Color.Gray)
            .fillMaxWidth(1f)
            .fillMaxHeight(.3f)
    ) {
        Text(
            text = stringResource(id = R.string.enterEmail),
            modifier = Modifier
                .padding(18.dp, 10.dp)
        )
        EditText(
            title = stringResource(id = R.string.email),
            Modifier
                .fillMaxWidth(1f)
                .padding(15.dp, 0.dp, 15.dp, 0.dp),
        )

    }
    MainButton(
        text = stringResource(id = R.string.send),
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(18.dp, 0.dp, 18.dp, 0.dp),
        textModifies = Modifier
            .padding(0.dp, 10.dp)
    ) {}


}

