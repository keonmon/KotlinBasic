package days02

fun main(){
    val s1 = SubClass1() //자식클래스 객체 생성
    println("s1.subMember1:${s1.subMember1}")
    s1.subMethod1()
    println("s1.superMember1:${s1.superMember1}")
    s1.superMethod1()

}

// 상속이 될 클래스들이 final로 만들어진다. 이는 상속이 불가능하므로, 'open 키워드'를 앞에 붙인다
open class SuperClass1{
    var superMember1 = 100
    fun superMethod1(){
        println("SuperClass1의 메서드 실행")
    }
}

// 상속은 extends키워드 없이 부모클래스 이름을 ':', '()'와 함께 클래스 옆에 써준다.
class SubClass1 : SuperClass1(){
    var subMember1 = 200
    fun subMethod1(){
        println("SubClass1의 메서드 실행")
    }
}


// 만일 부모 클래스에 대표생성자가 있다면?
open class SuperClass2(val a1:Int){}

// 상속을 위해 부모클래스 이름을 쓰고 괄호를 연결했다면, 괄호안에 부모클래스의 대표생성자 매개변수에 맞게 전달인수를 전달해야 한다.
// 그렇지 않으면 부모클래스의 멤버변수가 생성되지 않고, 상속도 안되는 에러가 발생한다.
class SubClass2:SuperClass2(100){
}

// 자식 클래스의 생성자가 따로 기술되어야 한다면 아래와 같이 표현한다.
class SubClass3 : SuperClass2{
    constructor() : super(100){
    }
}

// 자식 클래스에도 대표생성자가 있다면
class SubClass4 (var a4:Int) : SuperClass2(100){

}