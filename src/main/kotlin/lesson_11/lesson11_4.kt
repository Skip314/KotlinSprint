package org.example.lesson_11

class Category(
    val name: String,
    val icon: String,
    val destination: String,
)

class Recipe(
    val name: String,
    val quality: Int,
    val ingredients: List<Ingredient>,
    val cooking: String
)

class Ingredient(
    val name: String,
    val quality: Int
)
