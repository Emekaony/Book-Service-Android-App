package com.example.book_service.presentation

data class BookVM (
    val title: String = "",
    val author: String = "",
    val read: Boolean = false,
)

val books: List<BookVM> = listOf(
    BookVM(title = "The Quantum Paradox", author = "Elara Voss", read = true),
    BookVM(title = "Winds of Aether", author = "Dax Holloway", read = false),
    BookVM(title = "Fragments of Tomorrow", author = "Kira Noelle", read = true),
    BookVM(title = "Rust & Stardust", author = "Milo Strickland", read = false),
    BookVM(title = "Neon Gods", author = "Tess Orion", read = true),
    BookVM(title = "Echoes of the Void", author = "Finn Calder", read = false),
    BookVM(title = "The Code of Shadows", author = "Zayne Cole", read = true),
    BookVM(title = "Pathfinder’s Lament", author = "Nyla Dray", read = false),
    BookVM(title = "Seraphim Protocol", author = "Rhea Morgan", read = true),
    BookVM(title = "The Last Ember", author = "Jace Hollow", read = false),
    BookVM(title = "Neon Gods", author = "Tess Orion", read = true),
    BookVM(title = "Echoes of the Void", author = "Finn Calder", read = false),
    BookVM(title = "The Code of Shadows", author = "Zayne Cole", read = true),
    BookVM(title = "Pathfinder’s Lament", author = "Nyla Dray", read = false),
    BookVM(title = "Seraphim Protocol", author = "Rhea Morgan", read = true),
    BookVM(title = "The Last Ember", author = "Jace Hollow", read = false),
    BookVM(title = "Neon Gods", author = "Tess Orion", read = true),
    BookVM(title = "Echoes of the Void", author = "Finn Calder", read = false),
    BookVM(title = "The Code of Shadows", author = "Zayne Cole", read = true),
    BookVM(title = "Pathfinder’s Lament", author = "Nyla Dray", read = false),
    BookVM(title = "Seraphim Protocol", author = "Rhea Morgan", read = true),
    BookVM(title = "The Last Ember", author = "Jace Hollow", read = false)
)
