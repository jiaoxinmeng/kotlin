package demo
import java.util.*
import kotlin.reflect.jvm.internal.impl.serialization.jvm.JvmProtoBuf.StringTableTypes.Record.Operation

fun main(args: Array<String>) {
//    println("Hello World")
//    print(sum(1,5))
//    print("sum of 1 and 5 is ${sum(1,5)}")
//    print(sum2(1,5))
//    print(sum3(1,5))
//    val a:Int = 1   //声明并初始化
//    val b = 2   //初始化，可更具值推导出Int类型
//    val c:Int   //当没有初始化值的时候必须声明
//    c = 3   //赋值操作
//    print("a = $a, b = $b, c = $c")
//    val x = 5
//    x += 1
//    println("x = $x")
//    val a = 1
//    val s = "a is $a"
//    
//    a = 2
//    val s1 = "${s.replace("is","was")}, but now is $a"
//    print(s1)
//    println("max of 1 and 5 is ${maxOf(1,5)}")
//    println("max of 1 and 5 is ${maxOf2(1,5)}")
//    println("String 321 trans to Int is ${parseInt("321")}")
//    printProduct("2","5");
//    printProduct("a","5");
//    printProduct("2","a");
//    fun printLength(obj: Any){
//        println("'$obj' string length is ${getStringLength(obj)?:"...err, not a string"}")
//    }
//    printLength("your name is jia.chenhao")
//    printLength(1000)
//    printLength("1000")
//    printLength("")
//    printLength(listOf(Any()))
    
//    val items = listOf("jia","chen","hao")
//    for(index in items.indices){
//        println("item at $index is ${items[index]}")
//    }
//    
//    for(item in items){
//        println(item)
//    }
    
//    println(describe(1))
//    println(describe("Hello"))
//    println(describe(1000L))
//    println(describe(2))
//    println(describe("other"))
    
//    val x = 12
//    val y = 9
//    if(x in 1..y+1){
//        println("12 in 1-12")
//    } else {
//        println("12 not in 1-12")
//    }
//
    
//    val list = listOf("jia","chen","hao")
//    
//    if(-1 !in 0..list.lastIndex){
//        println("-1 is out of range")
//    }
//    
//    if(list.size !in list.indices){
//        println("list size is out of valid list indices range too")
//    }
    
//    for(x in 1..10 step 2){
//        print(x)
//    }
    
    for(x in 9 downTo 0 step 3){
        print(x)
    }
}

/*
 类型声明方式：Int
 */
fun sum(a:Int,b:Int):Int{
    return a + b
}

//函数可省略函数体直接赋值
fun sum1(a:Int,b:Int) = a + b

//参数可用$标识
fun sum2(a:Int,b:Int):Unit{
    println("sum of $a and $b is ${a + b}")
}

//返回类型Unit可省略
fun sum3(a:Int,b:Int){
    println("sum of $a and $b is ${a + b}")
}

fun maxOf(a:Int, b:Int):Int {
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxOf2(a:Int,b:Int) = if(a>b) a else b

fun parseInt(str: String): Int?{
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    
    if(x != null && y != null){
        println(x*y)
    }else{
        println("either '$arg1' or '$arg2' is not a number")
    }
}

fun getStringLength(obj: Any): Int?{
    if(obj is String){
        //自动转换为String类型
        return obj.length
    }
    return null
}

fun describe(obj: Any): String = when (obj) {
    1           -> "One"
    2           -> "Two"
    "hello"     -> "Greeting"
    is Long     -> "Long"
    !is String  -> "Not a string"
    else        -> "Unknown"
}



