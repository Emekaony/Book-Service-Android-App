package com.example.book_service.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import com.example.book_service.presentation.BookVM

@Composable
fun BookCard(book: BookVM) {
    Column {
        Text("Title: ${book.title}")
        Text("Author: ${book.author}")
    }
}