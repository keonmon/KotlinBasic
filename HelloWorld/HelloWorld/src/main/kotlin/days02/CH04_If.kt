package days02

fun main(){

    // 기본 if문
    val a1:Int = 10
    if(a1==10) println("a1은 10이다")
    if(a1!=10){
        println("a1은 10이 아니다")
    }
    println("----------------------------------")
    // else문 : 조건식이 만족하지 않을 경우 수행
    if(a1==10)println("a1은 10이다")
    else{
        println("a1은 10이 아니다")
    }
    if(a1==20)println("a1은 20이다")
    else{
        println("a1은 20이 아니다")
    }
    println("----------------------------------")
    // else if
    if(a1==5){
        println("a1은 5이다")
    }else if(a1==10){
        println("a1은 10이다")
    }else if(a1==20){
        println("a1은 20이다")
    }else{
        println("a1은 5, 10, 20이 아니다")
    }
    println("----------------------------------")

    var a4:String = ""
    var a5:Int = 10

    // 자바와 코틀린의 같은 if문 사용방법
    if(a5==10) a4 = "10이다"
    else a4="10이 아니다"
    println("a4:$a4");

//    // 자바에서만 사용 가능한 삼항연산자
//    var b:Int = 10
//    var a6 = (b!=10)? "10과 같다" : "10이 아니다";

    // 코틀린에서만 사용할 수 있는 if문의 변형 사용
    // 예제1
    val a6:String = if(a5==10) "10이다" else "10이 아니다"
    println("a6:$a6")

    println("----------------------------------")

    // 예제2
    val a7:String = if(a5==10){
        println("블록1 수행")
        "10입니다"     // 변수에 입력될 값은 각 경우에 해당하는 영역 맨 마지막에 작성된다.
    }else{
        println("블록2수행")
        "10이 아니다"
    }
    println("a7:$a7")






}
