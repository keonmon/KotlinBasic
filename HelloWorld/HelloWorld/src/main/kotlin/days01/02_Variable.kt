package days01

fun main(){
    // 리터럴
    // 코드 작성시에 값을 작성하는 문법
    // 정수(Int, Long) : 100, 100L, 1_000_000
    // 정수 자료에 L이 붙으면 Long 형 자료를 의미한다.
    // 큰 값의 정수를 구분하기 편하게 하기위해 천 단위 구분기호(,)와 같은 기능으로 '_'를 중간에 넣을 수 있다.

    // 실수(Double, Float) : 11.11, 22.22F
    // F가 사용되면 Float형 자료이다.

    // 문자(Char) : 'A','B'
    // 문자열(String) : "문자열"
    // 진위 논리 리터럴 : println(false)

    //정수 리터럴
    println(100)                // Int
    println(1000000000000000)   // Long
    println(1000000000000000L)  // Long
    println(938_545_245_245);   
    //실수 리터럴
    println(11.11)
    println(22.22F)
    // 문자 리터럴
    println('A')
    println('가')                //
    // 문자열 리터럴
    println("문자열")// String
    //진위 논리 리터럴
    println(true)
    println(false)
    // 참고로 '자료형은 모두 첫글자 대문자로 시작'한다.
    
    // 복수행 String
    println("동해물과 백두산이\n마르고 닳도록\n하느님이 보우하사\n우리나라 만세\n")
    println("""동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세""".trimMargin())
    // .trimMargin() : 호출객체가 되는 문자열에 각행의 앞뒤공백 및 행의 시작문자 ('|')를 제거해주는 함수.
    // 큰 따옴표 세개를 이용하여 복수행의 문자열을 하나의 데이터로 다룰 수 있다.
    

    //변수와 자료형
    // 정수 : Long(8), Int(4), Short(2), Byte(1)
    // 부호가 없는 정수형 : ULong(8), UInt(4), UShort(2), UByte(1)
    // 실수 : Double(8), Float(4)
    // 논리 : Boolean(1)
    // 문자 : Char(2)
    // 문자열 : String
    // 자바의 자료형이 대부분 그대로 사용되지만 자료형의 이름 첫 글자는 대문자로 쓰여진다.
    // U가 붙은 자료형은 Unsigned를 의미하며, 음수가 없는 자료형을 칭한다.
    // Int가 -21억 ~ 21억의 표현범위라면, UInt는 0~42억까지의 표현범위를 갖는다


    // 변수의 선언
    // 코틀린은 변수 선언시 val, var 두 가지의 키워드를 사용한다.
    // var : 선언 이후 값을 다시 저장할 수 있다. - node.js의 let
    // val : 선언 이후 값을 다시 저장할 수 없다. - node.js의 const
    // 변수 선언 양식 -> var/val 변수명:타입 = 값
    // 타입을 생략 시 저장하는 값에 따라 자료형이 자동으로 결정된다.
    // int a = 100; 자바
    // vla a:Int = 100; 코틀린
    val a1:Int = 100        // 변수 이름 뒤에 :를 쓰고 자료형을 이어서 쓰므로써 변수를 선언한다
    println("a1 = ${a1}")   // ${}안에 변수 이름을 넣어 변수의 값을 출력문구와 함께 출력한다
    println("a1 = $a1")     // 리터럴 출력이 아닌 '변수 출력'인 경우 ${}에서 {}를 생략할 수 있다.
    val a2:Int = 100        // 변수 선언시 자바스크립트처럼 자료형을 생략하면 저장하는 값에 따라 자동으로 자료형이 결정된다.
    println("a2 = $a2")


    println("----------------------------------------------")
    var a3:Int = 100
    val a4:Int = 100
    // var로 선언된 변수를 값을 바꿀 수 있는 변수이고, val은 초기화된 값을 변경할 수 없는 변수다.
    println("a3 : $a3")
    println("a4 : $a4")
    a3 = 200
    println("a3 : $a3")
    // val변수는 값을 다시 저장하지 못한다.
    // a4 = 200 //에러발생

    println("----------------------------------------------")
    // null을 허용하거나 허용하지 않는 변수
    // 코틀린 변수는 선언할 때 그 변수가 null값을 가질 수 있는 변수인지 아닌지 결정이 가능하다.
    // 평상시 변수선언은 null값을 허용하지 않는다.
    // 이것은 프로그래밍시 null값이 저장되어 발생하는 오류를 방지하기 위함.
    // 다만, 우리가 프로젝트에서 로그인 결과 등을 알아 볼 때, 반환된 값이 null인 경우 로그인하려는 아이디가 없다고 판단하듯, null이 저장되는 것을 일부 허용하기 위해 예외를 두고 있다.
    // 변수 선언시 자료형 뒤에 '?' 를 붙여 null을 허용하게 할 수 있다.
    // var/val 변수명:자료형 = 값 -> null 허용하지 않는 변수
    // var/val 변수명:자료형? = 값 -> null 허용 변수

    // var a5:Int=null  //에러발생
    var a5:Int=100
    var a6:Int? = null
    println("a5 : $a5")
    println("a6 : $a6")

    var a7:Int? = a5
    println("a7 : $a7")
    // a8은 null을 허용하는 변수가 아니므로 아래 명령은 에러
    // var a8:Int =a6//에러
    // 코틀린은 모든 기본타입 변수 및 값을 삭제 반환하여 사용한다.

}