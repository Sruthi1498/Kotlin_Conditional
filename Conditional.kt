fun main()
{
    println(maxof(2,5))
    println(maxof1(5,3))
    println(maxof2(10,7))
}
fun maxof(a: Int, b: Int) : Int
{
    var max = a
    if (a<b)
        max = b

    return max
}
fun maxof1(a:Int, b:Int): Int{
    var max: Int
    if(a>b)
        max = a
    else
        max = b

    return max
}
fun maxof2(a:Int, b: Int): Int{
    var max = if(a>b)
        return a
    else
        return b
}