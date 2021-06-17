package com.example.compose_play

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Greeting(value: String) {
    Text(text = "Welcome $value")
}

@Composable
fun NewsStory(name: String) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Greeting(name)
            Spacer(Modifier.height(8.dp))
            Image(
                painter = painterResource(R.drawable.bg_header),
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.height(8.dp))
            Text("A day in Shark Fin Cove")
            Text(
                text = "December 2018",
                fontSize = 10.sp
            )
            Text(
                text = "Davenport, California",
                fontSize = 12.sp
            )
        }
    }
}

@Preview
@Composable
fun NewsStoryPreview() {
    NewsStory("Itadori")
}