package com.example.musicapp.ui.theme

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.example.musicapp.R

@Composable
fun BrowseView() {
    val categories = listOf("All", "Artists", "Albums", "Playlists", "Songs", "Podcast")
    LazyVerticalGrid(GridCells.Fixed(2)) {
        items(categories) { cat->
            BrowserItem(cat = cat, drawable = R.drawable.baseline_apps_24)
        }
    }
}