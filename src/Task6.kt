//Создать приложение, в котором пользователь вводит две различных цифры. На выходе
// приложение выдает, если это возможно, из введенных цифр, нечетное число.
// Результат выводится в консоль. При невозможности создать нечетное число
// выводится сообщение – «Создать нечетное число невозможно». Каждое число вводится на отдельной строке
import kotlin.math.pow
import kotlin.math.sqrt
fun main() {
    println("Введи 2 цифры через Enter")
    val a = readln().toInt()
    val b = readln().toInt()
    var chislo = 0
    println("Число а- $a")
    println("Число b- $b")
    if ((b % 2 == 0) && (a % 2 == 0))
    {
        println("Создать нечетное число невозможно")
    }
    else
        if (b % 2 == 0)
        {
            println("Получилось нечетное число: $b$a")
        }
        else
        {
            println("Получилось нечетное число: $a$b")
        }

}

