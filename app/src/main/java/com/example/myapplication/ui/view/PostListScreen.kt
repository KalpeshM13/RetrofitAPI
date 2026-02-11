package com.example.myapplication.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.models.Post
import com.example.myapplication.ui.theme.PurpleGrey40
import com.example.myapplication.viewModel.PostViewModel

@Composable
fun PostListScreen(viewModel: PostViewModel= PostViewModel(), paddingValues: PaddingValues) {

    val posts by viewModel.posts
    if(posts.isEmpty()) {
        CircularProgressIndicator()
    } else {
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(paddingValues)
        ) {
            items(posts) {
                PostCard(it)
            }
        }
    }
}

@Composable
fun PostCard(post: Post) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(PurpleGrey40)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Post ${post.id}", style = MaterialTheme.typography.bodyLarge, color = Color.White)
            Text(text = post.title, style = MaterialTheme.typography.bodyMedium, color = Color.White)
            Text(text = post.body, style = MaterialTheme.typography.bodySmall, color = Color.White)

        }
    }
}