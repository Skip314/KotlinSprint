package org.example.lesson_17

class Task(
    question: String,
    answer: String,
) {

    val question: String = "Кто проживает на дне океана?"
        get() = field

    var answer: String = "СпанчБоб"
        get() = field
        set(value) {
            field = value
        }
}