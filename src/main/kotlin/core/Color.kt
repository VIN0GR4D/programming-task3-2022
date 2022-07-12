package core

enum class Color {
    WHITE, BLACK, NEUTRAL;
    fun opposite() = if (this == WHITE) BLACK else WHITE
}