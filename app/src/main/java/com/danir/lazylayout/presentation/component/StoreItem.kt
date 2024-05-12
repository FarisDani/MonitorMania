package com.danir.lazylayout.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.danir.lazylayout.R
import com.danir.lazylayout.model.Store
import com.danir.lazylayout.theme.LazyLayoutTheme

@Composable
fun StoreItem(
    store: Store,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .width(329.dp)
                .height(91.dp)
                .background(color = Color(0xFFF7F7F7), shape = RoundedCornerShape(size = 8.dp))
                .padding(start = 8.dp, top = 8.dp, end = 8.dp, bottom = 8.dp)
                .clickable { onItemClicked(store.id) }

        ) {
            Image(painter = painterResource(
                id = store.photo),
                contentDescription = store.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)

            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = store.name, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.SemiBold)
                Row {
                    Text(
                        text = store.status,
                        color = when (store.status){
                            "Aktif" -> Color.Green
                            "Nonaktif" -> Color.Red
                            else -> MaterialTheme.colorScheme.primary
                        }
                    )
                    Text(text = " - ${store.location}")
                }
            }
        }


}

@Preview(showBackground = true)
@Composable
private fun StoreItemPreview() {
    LazyLayoutTheme {
        StoreItem(
            store = Store(
                1,
                "Sinar Jaya",
                R.drawable.sinarjaya,
                "Jakarta Pusat",
                "Aktif",
                "Kami sangat peduli terhadap kepuasan pelanggan, itulah mengapa kami berkomitmen untuk menyediakan layanan pelanggan yang luar biasa. Tim kami siap membantu Anda dengan pertanyaan, masukan, atau bantuan apa pun yang Anda butuhkan selama proses pembelian.\n" +
                        "\n" +
                        "Nikmati kemudahan berbelanja online dengan pengiriman yang cepat dan aman langsung ke pintu Anda. Berbelanja di Kami adalah pengalaman yang mudah, cepat, dan menyenangkan.\n" +
                        "\n" +
                        "Terima kasih telah memilih toko kami sebagai mitra belanja online Anda"
            ),
            onItemClicked = { storeId -> println("Store Id : $storeId") }
        )
    }
}