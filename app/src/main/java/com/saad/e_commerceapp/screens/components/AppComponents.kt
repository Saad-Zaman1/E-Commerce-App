package com.saad.e_commerceapp.screens.components

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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saad.e_commerceapp.R
import com.saad.e_commerceapp.ui.theme.CardClick

@Composable
fun NormalText(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontFamily = FontFamily(Font(R.font.montserratregular))
        ),
        maxLines = 1
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
        modifier = modifier,
        maxLines = 1
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
fun imageShowCaseItem(text: String, image: Int) {
    var isFavorite by remember { mutableStateOf(false) }
//    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.starts))
    Column(
        modifier = Modifier
            .padding(start = 15.dp, top = 5.dp)
    ) {
        Box(
            modifier = Modifier

                .size(width = 170.dp, height = 230.dp)
//            .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize(1f)
                    .clip(shape = RoundedCornerShape(15.dp)),
                contentScale = ContentScale.Crop
            )
            TitleText(
                text = text,
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.TopStart)
                    .size(width = 45.dp, height = 30.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.Black)
                    .padding(5.dp),
                style = TextStyle(
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily(Font(R.font.montserratregular)),
                    fontWeight = FontWeight.SemiBold
                )
            )

            //Favorite Button
            Box(
                modifier = Modifier
                    .shadow(10.dp, shape = CircleShape)
                    .size(50.dp)
                    .align(Alignment.BottomEnd)
            ) {
                IconToggleButton(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color.White)
                    // Add a shadow modifier to create a shadow
                    ,
                    checked = isFavorite,
                    onCheckedChange = {
                        isFavorite = !isFavorite
                    }) {
                    Icon(
                        tint = Color.Gray,
                        contentDescription = "",
                        imageVector = if (isFavorite) {
                            Icons.Filled.Favorite
                        } else {
                            Icons.Default.FavoriteBorder
                        }
                    )
                }
            }

        }
//        LottieAnimation(
//            modifier = Modifier
//                .size(100.dp),
//            composition = composition
//        )
        Spacer(
            modifier = Modifier
                .padding(top = 6.dp)
        )
        ReviewStars(rating = 3.5f)

        //Category
        TitleText(
            text = "Dorothy Perkins", modifier = Modifier
                .padding(top = 2.dp),
            style = TextStyle(
                color = Color.Gray,
                fontFamily = FontFamily(Font(R.font.montserratregular))
            )
        )

        //Product Title

        TitleText(
            text = "Evening Dress", modifier = Modifier
                .padding(top = 1.dp), style = TextStyle(
                fontFamily = FontFamily(Font(R.font.montserratbold)),
                fontSize = 20.sp
            )
        )
        TitleText(
            text = "12$", modifier = Modifier
                .padding(top = 1.dp), style = TextStyle(
                fontFamily = FontFamily(
                    Font(R.font.montserratregular)
                ),
                fontWeight = FontWeight.SemiBold
            )
        )
    }

}

@Composable
fun ReviewStars(rating: Float, maxRating: Int = 5, size: Dp = 20.dp, totalReviews: Int = 12) {
    val fullStars = rating.toInt()
    val emptyStars = maxRating - fullStars

    Row(verticalAlignment = Alignment.CenterVertically) {
        repeat(fullStars) {
            Icon(
                tint = colorResource(id = R.color.lightYellow),
                painter = painterResource(id = R.drawable.star_filled),
                contentDescription = null,
                modifier = Modifier.size(size)
            )
        }
        repeat(emptyStars) {
            Icon(
                tint = Color.LightGray,
                painter = painterResource(id = R.drawable.star_outlined),
                contentDescription = null,
                modifier = Modifier.size(size)
            )
        }
        TitleText(
            text = "(${totalReviews})", modifier =
            Modifier.padding(start = 4.dp), style = TextStyle(
                fontFamily = FontFamily(Font(R.font.montserratregular)),
                color = Color.Gray
            )
        )
    }
}

@Composable
fun imageShowCaseGridItem(text: String, image: Int) {
    var isFavorite by remember { mutableStateOf(false) }
//    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.starts))
    Column(
        modifier = Modifier
            .padding(start = 15.dp, top = 5.dp)
    ) {
        Box(
            modifier = Modifier

                .size(width = 170.dp, height = 230.dp)
//            .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize(1f)
                    .clip(shape = RoundedCornerShape(15.dp)),
                contentScale = ContentScale.Crop
            )
            TitleText(
                text = text,
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.TopStart)
                    .size(width = 45.dp, height = 30.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.Black)
                    .padding(5.dp),
                style = TextStyle(
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily(Font(R.font.montserratregular)),
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
//        LottieAnimation(
//            modifier = Modifier
//                .size(100.dp),
//            composition = composition
//        )
        Spacer(
            modifier = Modifier
                .padding(top = 6.dp)
        )
        ReviewStars(rating = 3.5f)

        //Category
        TitleText(
            text = "Evening Dress",
            modifier = Modifier
                .padding(top = 1.dp),
            style = TextStyle(
                fontFamily = FontFamily(Font(R.font.montserratbold)),
                fontSize = 20.sp,
            )
        )

        //Product Title
        Row(
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                TitleText(
                    text = "Dorothy Perkins", modifier = Modifier
                        .padding(top = 2.dp),
                    style = TextStyle(
                        color = Color.Gray,
                        fontFamily = FontFamily(Font(R.font.montserratregular))
                    )
                )

                TitleText(
                    text = "12$", modifier = Modifier
                        .padding(top = 1.dp), style = TextStyle(
                        fontFamily = FontFamily(
                            Font(R.font.montserratregular)
                        ),
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
            //Favorite Button
            Box(
                modifier = Modifier
                    .padding(start = 14.dp)
                    .shadow(10.dp, shape = CircleShape)
                    .size(45.dp)
            ) {
                IconToggleButton(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color.White)
                    // Add a shadow modifier to create a shadow
                    ,
                    checked = isFavorite,
                    onCheckedChange = {
                        isFavorite = !isFavorite
                    }) {
                    Icon(
                        tint = Color.Red,
                        contentDescription = "",
                        imageVector = if (isFavorite) {
                            Icons.Filled.Favorite
                        } else {
                            Icons.Default.FavoriteBorder
                        }
                    )
                }
            }
        }

    }

}

@Composable
fun imageShowCaseListItem(text: String, image: Int) {
    var isFavorite by rememberSaveable { mutableStateOf(false) }
//    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.starts))
    Box {

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(150.dp)
                .padding(horizontal = 15.dp, vertical = 15.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight(1f)
                        .fillMaxWidth(0.4f)
                        .padding(end = 10.dp)

                ) {
                    Image(
                        painter = painterResource(id = image),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize(1f),
                        contentScale = ContentScale.Crop
                    )
                }

                Column {
                    TitleText(
                        text = "Evening Dress", modifier = Modifier
                            .padding(top = 8.dp), style = TextStyle(
                            fontFamily = FontFamily(Font(R.font.montserratbold)),
                            fontSize = 20.sp
                        )
                    )
                    //Category
                    TitleText(
                        text = "Dorothy Perkins", modifier = Modifier
                            .padding(top = 0.dp),
                        style = TextStyle(
                            color = Color.Gray,
                            fontFamily = FontFamily(Font(R.font.montserratregular))
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 15.dp))
                    ReviewStars(rating = 3.5f)

                    //Product Title


                    TitleText(
                        text = "12$", modifier = Modifier
                            .padding(top = 10.dp), style = TextStyle(
                            fontFamily = FontFamily(
                                Font(R.font.montserratregular)
                            ),
                            fontWeight = FontWeight.SemiBold
                        )
                    )

                }
            }
        }
        //Favorite Button
        Box(
            modifier = Modifier
                .shadow(10.dp, shape = CircleShape)
                .padding(end = 8.dp)
                .size(50.dp)
                .align(Alignment.BottomEnd)
        ) {
            IconToggleButton(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.White)
                // Add a shadow modifier to create a shadow in the app
                ,
                checked = isFavorite,
                onCheckedChange = {
                    isFavorite = !isFavorite
                }) {
                Icon(
                    tint = Color.Gray,
                    contentDescription = "",
                    imageVector = if (isFavorite) {
                        Icons.Filled.Favorite
                    } else {
                        Icons.Default.FavoriteBorder
                    }
                )
            }
        }
    }

}
