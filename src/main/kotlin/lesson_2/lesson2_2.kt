package org.example.lesson_2

fun main() {

    val worker: Byte = 50
    val student: Byte = 30
    val salaryWorker: Short = 30000
    val salaryStudent: Short = 20000

    val totalSalaryWorker = worker * salaryWorker
    println(totalSalaryWorker)
    val totalSalary = totalSalaryWorker + student * salaryStudent
    println(totalSalary)
    val averageSalary = totalSalary / (worker + student)
    println(averageSalary)
}