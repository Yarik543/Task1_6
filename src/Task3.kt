//Создать приложение, которое преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную.
fun main() {
    println("Введи число не больше 255")
    var input:Int = readln().toInt()
    var Chislo = ""
    println(input)
    while (input != 0)
    {
        Chislo += input %2
        input /=2
    }
    for (char in Chislo.reversed())
    {
        print(char)
    }
}
