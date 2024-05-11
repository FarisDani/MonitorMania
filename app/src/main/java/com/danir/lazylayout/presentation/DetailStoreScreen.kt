package com.danir.lazylayout.presentation

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.danir.lazylayout.data.DummyData
import com.danir.lazylayout.model.Store

@Composable
fun DetailStoreScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    storesId: Int?
) {
    val newStoreList = DummyData.MonitorStore.filter { store -> store.id == storesId }
    
    Column(
        modifier = modifier
    ) {
        DetailStoreContent(newStoreList = newStoreList)     
    }
}

@Composable
private fun DetailStoreContent(
    newStoreList: List<Store>,
    modifier: Modifier = Modifier
) {
    Column(modifier = Modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .padding(16.dp)
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = Color(0xFFCEBEBE),
                    shape = RoundedCornerShape(size = 8.dp)
                )
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(data = newStoreList[0].photo)
                    .build(),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(height = 100.dp, width = 100.dp)
                    .clip(CircleShape),
                contentDescription = "Poster Movie"
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = newStoreList[0].name,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = newStoreList[0].status,
                    color = when (newStoreList[0].status){
                        "Aktif" -> Color.Green
                        "Nonaktif" -> Color.Red
                        else -> MaterialTheme.colorScheme.primary
                    }
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Lokasi : ${newStoreList[0].location}",
                    style = MaterialTheme.typography.titleSmall,
                )
//            Column(modifier = Modifier.padding(10.dp)) {
//                Text(
//                    newStoreList[0].description,
//                    textAlign = TextAlign.Justify,
//                    modifier = Modifier.width(300.dp)
//                )
//            }
            }
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            Text(
                newStoreList[0].description,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .width(300.dp)

            )
        }
    }


}

@Preview (showBackground = true)
@Composable
private fun DetailStorePrev() {
    DetailStoreContent(newStoreList = DummyData.MonitorStore)
}