package org.example.lesson_17

class Task(
    _question: String = "Кто проживает на дне океана?",
    _answer: String = "СпанчБоб",
) {

    val question: String = _question
        get() = field

    var answer: String = _answer
        get() = field
        set(value) {
            field = value
        }
}