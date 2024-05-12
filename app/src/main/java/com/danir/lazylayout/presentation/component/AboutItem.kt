package com.danir.lazylayout.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danir.lazylayout.R
import com.danir.lazylayout.theme.LazyLayoutTheme

@Composable
fun AbouiItem(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.faris),
            contentDescription = "danir",
            contentScale = ContentScale.FillBounds,

            modifier = Modifier
                .width(60.dp)
                .height(60.dp)
                .clip(CircleShape)
        )
        Text(
            text = "My Profile",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                // color = Color(0xFF000000)
            ),
            modifier = Modifier
                .width(78.dp)
                .height(24.dp)
        )
        Column(

            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,

            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0xFFCEBEBE),
                    shape = RoundedCornerShape(size = 8.dp)
                )
                .width(204.dp)
                .height(216.dp)
               .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
                .fillMaxSize()
        ) {

            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.Start,

                ) {
                Text(
                    text = "Nama",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                    )
                )
                Text(
                    text = "Faris Dani Rizkianto",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    )
                )

            }

            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Email",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                    )
                )

                Text(
                    text = "farisdani84@gmail.com",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    )
                )
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Asal Kampus",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                    )
                )

                Text(
                    text = "UPN “Veteran” Yogyakarta",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    )
                )
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Jurusan",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                    )
                )

                Text(
                    text = "Informatika",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    )
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AboutPreview() {
    LazyLayoutTheme {
        AbouiItem()
    }
    
}