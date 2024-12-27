package com.example.musicapp.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.lib
import com.example.musicapp.libraries

@Composable
fun LibraryView() {
    LazyColumn() {
        items(libraries) { Lib ->
            LibraryItem(Lib = Lib)
        }
    }
}

@Composable
fun LibraryItem(Lib: lib) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Icon(painter = painterResource(id = Lib.icon),
                    modifier = Modifier.padding(horizontal = 8.dp),
                    contentDescription = Lib.name
                )
                Text(text = Lib.name)
            }
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
        }
        Divider(color = Color.LightGray)
    }
}