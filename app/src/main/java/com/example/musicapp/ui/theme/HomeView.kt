package com.example.musicapp.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.R

@Composable
fun HomeView() {
    val categories = listOf(
        "Hits",
        "Pop",
        "Rock",
        "Classical",
        "Jazz",
        "R&B",
        "Soul",
        "Metal",
        "Punk",
        "Folk",
        "Dance",
        "Disco",
        "Reggae",
        "Country",
        "Blues",
        "Latin",
        "Reggaeton",
        "Hip-Hop",
        "Gospel",
        "World"
    )
    val grouped = listOf<String>(
        "New Releases",
        "Favourites",
        "Trending",
        "Recently Played",
        "Top Rated",
        "Top Albums",
        "Top Artists"
    ).groupBy { it[0] }

    LazyColumn {
        grouped.forEach { entry ->
            val categoryList = entry.value
            if(categoryList.isNotEmpty()) {
                stickyHeader {
                    Text(
                        text = categoryList[0],
                        modifier = Modifier.padding(16.dp)
                    )
                    LazyRow {
                        items(categories){
                                cat ->
                            BrowserItem(cat = cat, drawable = R.drawable.baseline_music_note_24)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BrowserItem(cat: String,drawable: Int) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .size(200.dp),
        border = BorderStroke(3.dp, color = Color.DarkGray)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = cat)
            Image(painter = painterResource(id = drawable), contentDescription = cat)
        }
    }
}