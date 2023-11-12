package com.saad.e_commerceapp.screens.authentication


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saad.e_commerceapp.R

@Composable
fun ForgetPasswordScreen() {
    Column {
        IconButton(onClick = { /*TODO*/ }) {
            Image(imageVector = Icons.Outlined.KeyboardArrowLeft, contentDescription = "")
        }
        Text(
            text = stringResource(id = R.string.forgotPass),
            style = TextStyle(
                fontSize = 34.sp,
                fontFamily = FontFamily(Font(R.font.montserratbold))
            ),
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(1f)
//                .background(Color.Gray)
        )
        GetAccountInfo()
    }
}

@Preview
@OptIn(ExperimentalMaterial3Api::class)
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
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text = stringResource(id = R.string.email)) },
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(15.dp, 0.dp, 15.dp, 0.dp),
//            colors = TextFieldDefaults.textFieldColors(containerColor = Color.White)
            colors = TextFieldDefaults.textFieldColors(
                focusedLabelColor = Color.Black,
                disabledLabelColor = Color.Gray,
                errorLabelColor = Color.Red
            ),
        )

    }

    Button(
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.redPrimary)),
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(18.dp, 0.dp, 18.dp, 0.dp),
        onClick = { /*TODO*/ }
    ) {
        Text(
            text = stringResource(id = R.string.send),
            modifier = Modifier
                .padding(0.dp, 10.dp)
        )
    }

}

