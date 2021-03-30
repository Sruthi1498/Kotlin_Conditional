fun main()
{
    abc@ for(i in 1..10)
    {
        for(j in 1..3) {
            print("$i , $j")
            if (j == 2)
                break@abc
        }

    }
     
}