import java.lang.UnsupportedOperationException

fun main(args: Array<String>) {
    println("Aguante eclipse")
    tryCatchDemo()
    val l = listOf(1, 4, 5, 6, 0)

    with(l) {
        println(first())
        println(size)
    }

    fun hola() {
        println("hola")
    }

    hola()

//    val sum: (Int, Int) -> String = { x, y -> (x + y).toString() }

    testPasarFuncion(1) { a: Int, b: Int ->
        (a + b).toString()
    }

    testAny("nacho")
    testAny(3)

    println(case(1))
    println(case(10))

    caseEnum(enumaNcho.Y)
}

fun testPasarFuncion(a: Int, fn: (x: Int, y: Int) -> String) {
    println(fn(a, a))
}

fun tryCatchDemo() {
    val edad = try {
        4
//        throw RuntimeException("ee")
    } catch (e: Exception) {
        e.printStackTrace()
        7
    }
    println(edad)
}

suspend fun aa() {
    Thread.yield()
}

fun testAny(x: Any) {
    if (x is String) {
        println(x.substring(2))
    } else if (x is Int) {
        println(x.plus(3))
    } else {
        throw UnsupportedOperationException()
    }
}

fun case(x: Int): String = when {
    x == 1 -> "soy uno"
    x in 2..5 -> "del 2 al 5"
    x > 6 -> "soy mayor a 6"
    else -> "Ni idea"
}

fun caseEnum(x: enumaNcho) {
    println(
        when (x) {
            enumaNcho.X -> "X"
            enumaNcho.Y -> "Y"
            enumaNcho.Z -> "Z"
        }
    )
}

enum class enumaNcho {
    X, Y, Z
}