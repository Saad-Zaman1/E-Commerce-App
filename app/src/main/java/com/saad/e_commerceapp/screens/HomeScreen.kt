package com.saad.e_commerceapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saad.e_commerceapp.R
import com.saad.e_commerceapp.screens.components.MainButton
import com.saad.e_commerceapp.screens.components.TitleText
import com.saad.e_commerceapp.screens.components.imageShowCaseItem

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .background(Color.Gray)
                .fillMaxWidth(1f)
                .height(530.dp)
//                .fillMaxHeight(.2f)


        ) {
            Image(
                painter = painterResource(id = R.drawable.main1),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize(1f),
                contentScale = ContentScale.Crop
            )
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxSize(1f)
//                .background(Color.Cyan)
            ) {
                TitleText(
                    text = stringResource(id = R.string.fashionsale),
                    Modifier.padding(start = 22.dp),
                    style = TextStyle(
                        fontSize = 44.sp,
                        fontFamily = FontFamily(Font(R.font.montserratbold)),
                        color = Color.White
                    )
                )
                MainButton(
                    text = stringResource(id = R.string.check), modifier = Modifier
                        .padding(bottom = 28.dp, start = 22.dp, end = 10.dp, top = 15.dp)
                        .size(width = 150.dp, height = 35.dp),
                    textModifies = Modifier
                        .padding(0.dp, 0.dp)
                ) {
                    //onClick
                }
            }

        }

        TitleText(
            text = stringResource(id = R.string.New),
            modifier = Modifier.padding(start = 12.dp, top = 15.dp),
            style = TextStyle(
                fontSize = 35.sp,
                fontFamily = FontFamily(Font(R.font.montserratbold))
            )
        )
        TitleText(
            text = stringResource(id = R.string.neverSee),
            modifier = Modifier.padding(start = 15.dp, top = 0.dp, bottom = 10.dp),
            style = TextStyle(
                fontFamily = FontFamily(Font(R.font.montserratlight)),
                color = Color.Gray
            )
        )
        imageShowCaseItem(stringResource(id = R.string.New), R.drawable.main1)

//        HorizontalItem()
    }


}