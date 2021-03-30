fun foo() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit
        print(it)
    }
}

fun foo1()
{
    listOf(1, 2, 3, 4, 5).forEach {
        if(it == 3) return@forEach
        print(it)
    }
}

fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return
        print(value)
    })
}

fun foo3() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop
            print(it)
        }     }
}

fun main() {
    foo()
    foo1()
    foo2()
    foo3()
}