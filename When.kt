import java.lang.Integer.parseInt

fun main()
{
    show(1);
    show(67L)
    show("hello")
    show("world")
    show(6.9)
   
}
fun show(x:Any) :Unit
{
    var s = 12
    when(x)
    {

        in 1..9 -> println("int")
        "hello","world" -> println("string")
        67L -> println("long")
        is Double -> println("double")

        else -> {
            println("nothing")
        }
    }

}









