package me.uditverma.sample.cafecoffee.sample

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

data class User(
    val name: String,
    val displayPicture: String,
    val username: String
)

@Composable
fun Profile(user: User) {
    BoxWithConstraints {
        when (this.maxWidth) {
            in (0.dp..100.dp) -> {
                CompactProfile(user)
            }
            in (301.dp..900.dp) -> {
                ExpandedProfile(user)
            }
        }
    }
}

@Composable
fun CompactProfile(user: User) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(text = user.name)
        Text(text = "(${user.username})")
    }
}

@Composable
fun ExpandedProfile(user: User) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        AsyncImage(model = user.displayPicture, contentDescription = "User profile picture")
        CompactProfile(user = user)
    }
}
