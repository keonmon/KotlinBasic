package days02

fun main(){

    val a1 = 10

    // switch-case문법과 비슷하다. 각 case를 '->'로 표시하고, break를 작성하지 않아도 된다.
    when(a1){
        1 -> println("a1은1이다")
        2 -> {
            println("수행되는 코드")
            println("a1은 2이다")
        }
        3 -> println("a1은 3이다")
        else -> println("a1은 1,2,3이 아니다. a1:$a1")
    }

    println("----------------------------------")

    val a2 = 3

    when(a2){
        1, 2 -> println("a2는 1 또는 2")
        3, 4 -> println("a2는 3 또는 4")
        5, 6 -> println("a2는 5 또는 6")
        else -> println("a2는 1 ~ 6이 아닙니다")
    }   // (,)로 구분하여 두 가지의 경우를 하나의 case로 처리 가능

    println("----------------------------------")

    val a5 = 5

    when(a5){
        in 1..3 -> println("a5는 1~3 사이의 숫자")
        in 4..6 -> println("a5는 4~6 사이의 숫자")
        in 1..6 -> println("a5는 1~6 사이의 숫자")
        else -> println("a5는 1~6사이의 숫자가 아닙니다")
    }   // in 키워드와 .. 연산자를 이용하여 범위를 골라내는 case를 작성할 수 있다.

    println("----------------------------------")

    // var a6:String  = if(a5==5) "5입니다" else "5가 아닙니다"
    val a6 = 20

    val str:String = when(a6){
        10 -> "a6는 10이다"
        20 -> {
            println("두 번째 경우의 수")
            "a6는 20이다"
        }
        30 -> "a6는 30이다"
        else -> "a6는 10~30이 아닙니다."
    }   // 각 케이스에서 선택된 값을 결과로 반환하여 변수의 값으로 활용할 수 있다.
    println("str : $str");

    println("----------------------------------")

    // setValue()메서드 활용
    val str1 = setValue(10)
    val str2 = setValue(20)
    val str3 = setValue(30)
    val str4 = setValue(40)
    println("str1:$str1")
    println("str2:$str2")
    println("str3:$str3")
    println("str4:$str4")

}

// when이 내장되어있는 setValue()메서드 생성
fun setValue(a1:Int)= when(a1){
        10->"a1는 10이다"
        20->"a1는 20이다"
        30->"a1는 30이다"
        else->"a6는 10~30이 아닙니다."
}
/*
fun setValue(a1:Int):String{
    val str:String = when(a1){
        10->"a1는 10이다"
        20->"a1는 20이다"
        30->"a1는 30이다"
        else->"a6는 10~30이 아닙니다."
    }
    return str;
}
 */