//Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной
//строке. На вход подается, например, строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4.
//То есть, если количество подряд идущих символов меньше двух, то мы не пишем единицу
fun main() {
    println("Введи строку и программа посчитает количество подряд идущих одинаковых символов")
    val input = readln()
    if (input.isEmpty()) {
        return
    }
    var result = ""
    var lastChar = input[0]
    var count = 1
    for (i in 1 ..input.length-1) {
        if (input[i] == lastChar) {
            count++
        }
        else {
            if (count == 1)
            {
                result += lastChar
            }
            else
            {
                result += lastChar + count.toString()
            }
            count = 1
            lastChar = input[i]
        }
    }
    if (count == 1)
    {
        result += lastChar
    }
    else
    {
        result += lastChar + count.toString()
    }
    println(result)
}
