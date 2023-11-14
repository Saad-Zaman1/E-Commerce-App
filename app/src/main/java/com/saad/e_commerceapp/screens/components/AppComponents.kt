package com.saad.e_commerceapp.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.saad.e_commerceapp.R
import com.saad.e_commerceapp.ui.theme.CardClick

@Composable
fun NormalText(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontFamily = FontFamily(Font(R.font.montserratregular))
        )
    )
}

@Composable
fun NormalTextImage(text: String, id: Int, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .padding(0.dp, 2.dp, 0.dp, 0.dp)
            .fillMaxWidth(1f),
        horizontalArrangement = Arrangement.End
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontFamily = FontFamily(Font(R.font.montserratregular))
            ),
            modifier = Modifier
                .clickable { onClick() }
        )
        Image(
            painter = painterResource(id = id),
            contentDescription = "",
            modifier = Modifier
                .padding(0.dp, 0.dp, 10.dp, 0.dp)
        )

    }
}

@Composable
fun TitleText(text: String, modifier: Modifier, style: TextStyle) {
    Text(
        text = text,
        style = style,
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditText(title: String, modifier: Modifier) {
    TextField(
        value = "",
        onValueChange = {},
        label = { Text(text = title) },
        modifier = modifier,
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
}

@Composable
fun MainButton(text: String, modifier: Modifier, textModifies: Modifier, onClick: () -> Unit) {
    Button(
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.redPrimary)),
        modifier = modifier,
        onClick = { onClick() }
    ) {
        Text(
            text = text,
            modifier = textModifies
        )
    }
}

@Composable
fun Socials(interactionSource: MutableInteractionSource, id: Int) {
    Card(
        modifier = Modifier
            .size(70.dp)
            .clickable(
                onClick = {},
                interactionSource = interactionSource,
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
                painter = painterResource(id = id),
                contentDescription = "",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(30.dp)
                    .align(Alignment.Center)
            )
        }
    }
}

@Composable
fun imageShowCaseItem() {
    Image(
        painter = painterResource(id = R.drawable.main1),
        contentDescription = "",
        modifier = Modifier
            .padding(start = 15.dp, top = 5.dp)
            .clip(shape = RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))


    )
}