package days01

fun main(){
    print("Hello World!")
    print("Hello World!")
    print("Hello World!")
    println()
    println("Hello World!")
    println("Hello World!")
    println("-------------")
    println("값 : "+100)
    println("값 : ${100}")
    println("값 : ${50+50}")
    // 코틀린의 print와 printf에서는 %d의 역할이나 + 연산에 의해 이어지던 출력을 위와 같이 " " 안에 포함시켜서 출력할 수 있다.
    // 한줄 주석
    /*
        여러 줄 주석이다.
     */
    // 코틀린의 주석은 자바와 동일하다.
    // System.out.을 쓰지 않고 print, println 메서드를 이용한다.
    // print는 자동개행 기능이 없고, println은 자동개행
    // 변수에 저장된 값이나 별도의 리터럴값과 함께 출력할 때는 ${ 값 또는 변수명 }을 사용한다.


    println("---------------------")
    println("세미콜론 없음")
    println("세미콜론 있음");
    println("명령문1"); println("명령문2"); println("명령문3");
    // ';' 세미콜론은 사용하지 않는 것이 기본이지만, 한 줄에 여러 명령이 나열될 때는 구분하기 위해 사용한다.



}
