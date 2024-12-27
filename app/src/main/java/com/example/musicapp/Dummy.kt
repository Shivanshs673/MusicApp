package com.example.musicapp

import androidx.annotation.DrawableRes

data class lib(
    @DrawableRes val icon: Int,
    val name: String
)

val libraries = listOf<lib>(
    lib(R.drawable.baseline_music_note_24, "My Music"),
    lib(R.drawable.baseline_album_24, "Albums"),
    lib(R.drawable.baseline_playlist_24, "Playlists"),
    lib(R.drawable.baseline_queue_music_24, "Queue"),
    lib(R.drawable.baseline_favorite_24, "Favourites")
)
