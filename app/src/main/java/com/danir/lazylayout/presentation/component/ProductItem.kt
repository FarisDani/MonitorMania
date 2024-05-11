package com.danir.lazylayout.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.danir.lazylayout.R
import com.danir.lazylayout.model.Product
import com.danir.lazylayout.theme.LazyLayoutTheme

@Composable
fun ProductItem(
    product: Product,
//    modifier: (Any) -> Unit = Modifier,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit

) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = Color(0xFFCEBEBE),
                shape = RoundedCornerShape(size = 8.dp)
            )
            .padding(start = 8.dp, top = 8.dp, end = 8.dp, bottom = 8.dp)
            .clickable { onItemClicked(product.id) }
    ) {
        Image(painter = painterResource(id = product.photo),
            contentDescription = product.name,
            modifier = Modifier
                .fillMaxWidth()
                .width(120.dp)
                .height(119.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = product.name,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth(),
            style = TextStyle(
               // fontSize = 20.sp,
                fontWeight = FontWeight(500),
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = product.price,
            textAlign = TextAlign.Center,
            style = TextStyle(
             //   fontSize = 12.sp,
                fontWeight = FontWeight(400)
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
private fun ProductItemPreview() {
    LazyLayoutTheme {
        ProductItem(
            product = Product(
                1,
                "Lenovo R25i-30",
                "Rp. 2.699.000",
                R.drawable.r25i30,
                "Display Size 24.5\"\n" +
                        "View Area 543.7x302.6 mm\n" +
                        "Panel In-Plane Switching\n" +
                        "Backlight WLED\n" +
                        "Aspect Ratio 16:9\n" +
                        "Resolution 1920x1080\n" +
                        "Pixel Pitch 0.283×0.280 mm\n" +
                        "Dot / Pixel Per Inch 90 dpi\n" +
                        "View Angle (H / V) 178° / 178°\n" +
                        "Response Time 0.5ms (MPRT) / 1ms (Level 5) / 2ms (Level 4) / 3ms (Level 3) / 4ms (Level 2) / 5ms (Level 1)\n" +
                        "Color Support 16.7 Million\n" +
                        "Refresh Rate 165Hz (Overclock to 180Hz)\n" +
                        "Brightness 400 cd/m²\n" +
                        "Contrast Ratio 1000:1\n" +
                        "Color Gamut 99% sRGB, 90% DCI-P3\n" +
                        "Screen Surface Treatment Anti-glare\n" +
                        "Curvature None\n" +
                        "Camera None\n" +
                        "Microphone None\n" +
                        "Speakers 3Wx2\n" +
                        "Power Consumption (Typical / Maximum) 18.5W / 28W\n" +
                        "Power Adapter Integrated\n" +
                        "Touchscreen None\n" +
                        "Smart System None"
            ),
            onItemClicked = { productId ->
                println("Product Id : $productId")
            }
        )
    }

}