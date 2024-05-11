package com.danir.lazylayout.presentation.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danir.lazylayout.R
import com.danir.lazylayout.model.Brand
import com.danir.lazylayout.theme.LazyLayoutTheme

@Composable
fun BrandItem(
    brand: Brand,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
//            modifier = Modifier
//            .width(113.dp)
//            .height(160.dp)
//            //.background(shape = RoundedCornerShape(size = 8.dp))
//            .padding(start = 8.dp, top = 8.dp, end = 8.dp, bottom = 8.dp),
            modifier = modifier
                .clickable {
                onItemClicked(brand.id)
            }
                .width(113.dp)
                .height(160.dp)
                //.background(shape = RoundedCornerShape(size = 8.dp))
                .padding(start = 8.dp, top = 8.dp, end = 8.dp, bottom = 8.dp),
        ) {
            Image(painter = painterResource(id = brand.photo), 
                contentDescription = brand.name,
                modifier = Modifier
                    .clip(CircleShape)
                    .width(87.dp)
                    .height(86.dp)
            )
            Text(
                text = brand.name,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight(500),

                )
            )
            Text(
                text = brand.nickname,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                )
            )
        }
}

@Preview(showBackground = true)
@Composable
private fun BrandItemHorizontalPreview() {
    LazyLayoutTheme{
        BrandItem(
            brand = Brand(
                1,
                "Lenovo",
                "@lenovo.id",
                "WhatsApp : +6221 50851766",
                R.drawable.lenovo,
                 "Monitors for every budget\n" +
                        "\n" +
                        "Do you need a large, crisp image when working at your computer? Are you worried about the sticker shock that usually comes with high quality monitors? Those days are over. At Lenovo, we've worked hard to design monitors that fit your budget and provide the premium viewing experience you deserve. No more grainy, low color-quality screens. We have a large selection so you can find the perfect monitor for your needs."

            ),
            onItemClicked = { brandId -> println("Brand Id : $brandId") }
        )
    }
    
}