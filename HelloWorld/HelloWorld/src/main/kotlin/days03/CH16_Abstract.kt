package days03

fun main(){

    val obj1 = Sub1()
    obj1.method1()  // Super1의 method1이다.
    obj1.method2()  // 재정의된 Super1의 method2이다.

    println(" ----------------------------- ")

    val obj2 = Sub2()
    testFun1(obj2)
    // Super1의 method1이다.
    // 재정의된 Super1의 method2이다.

    testFun1(obj1)
    // Super1의 method1이다.
    // 재정의된 Super1의 method2이다.

}

// 부모클래스의 참조변수가 멤버변수로 있기때문에, 그 자식클래스의 객체를 전달인수로 전달할 수 있다.
fun testFun1(obj1:Super1){
    obj1.method1()
    obj1.method2()
}



// 추상클래스 : 상속을 위한 클래스, 멤버메서드의 override에 강제성을 부여하기 위해 사용한다.
open abstract class Super1{

    // 재정의(override)의 강제성이 있는 메서드와 없는 메서드를 동시에 사용이 가능하다.
    fun method1(){
        println("Super1의 method1이다.")
    }
    open abstract fun method2() // 재정의(override) 강제성이 부여된 추상메서드
}


class Sub1:Super1(){
    override fun method2() {
        println("재정의된 Super1의 method2이다.")
    }
}

class Sub2:Super1(){
    override fun method2() {
        println("재정의된 Super1의 method2이다.")
    }
}