package com.example.book_service.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.book_service.presentation.components.BookCard

@Composable
fun ListBookScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .padding(start = 10.dp)
    ) {
        books.forEach { book ->
            BookCard(book)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}