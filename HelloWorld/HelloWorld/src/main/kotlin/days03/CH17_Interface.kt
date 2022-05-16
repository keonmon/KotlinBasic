package days03

fun main(){

    var obj31 = TestClass31()    // Inter1을 상속(구현)받은 자식클래스
    obj31.inter1_Method1()  // Inter1의 Method1이다.
    obj31.inter1_Method2()  // TestClass31의 Inter1에서 오버라이딩된 Method2이다.

    println(" ------------------ ")

    var obj32 = TestClass32()    // Inter2를 상속(구현)받은 자식클래스
    obj32.inter2_Method1()  // Inter2의 Method1이다.
    obj32.inter2_Method2()  // TestClass32의 Inter2에서 오버라이딩된 Method2이다.

    println(" ------------------ ")

    // 다중상속
    var obj33 = TestClass33()    // Inter1과 Inter2를 상속(구현)받은 자식클래스
    obj33.inter1_Method1()  // Inter1의 Method1이다.
    obj33.inter1_Method2()  // TestClass33의 Inter1에서 오버라이딩된 Method2이다.
    obj33.inter2_Method1()  // Inter2의 Method1이다.
    obj33.inter2_Method2()  // TestClass33의 Inter2에서 오버라이딩된 Method2이다.

    println(" ------------------ ")

    // 부모중 해당 인터페이스가 구현되어있는 객체만 전달인수로 사용이 가능합니다.

    // obj32는 test1에 전달이 불가능하다.
    // testFun1(obj32)

    // obj31는 전달이 불가능하다.
    // testFun2(obj31)

    // obj33(TestClass33)은 Inter1이 구현되어있어서 인수로 전달이 가능하다.
    testFun1(obj33)
    // Inter1의 Method1이다.
    // TestClass33의 Inter1에서 오버라이딩된 Method2이다.

    // obj33(TestClass33)은 Inter2가 구현되어있어서 인수로 전달이 가능하다.
    testFun2(obj33)
    // Inter2의 Method1이다.
    // TestClass33의 Inter2에서 오버라이딩된 Method2이다.

}

fun testFun1(obj:Inter1){
    obj.inter1_Method1()
    obj.inter1_Method2()
}

fun testFun2(obj:Inter2){
    obj.inter2_Method1()
    obj.inter2_Method2()
}



// 인터페이스 : 추상클래스가 할 수 없던, '다중상속'이 가능하다.
// 자바의 버전이 업그레이드 되면서, '인터페이스에도 override의 강제성이 부여되지 않는 일반변수와 메서드 선언이 가능'해졌다.

interface Inter1{
    fun inter1_Method1(){
        println("Inter1의 Method1이다.")
    }   // override의 강제성이 부여되지 않는 메서드

    fun inter1_Method2() // override의 강제성이 부여된 메서드
}

interface Inter2 {
    fun inter2_Method1() {
        println("Inter2의 Method1이다.")
    }

    fun inter2_Method2()
}

// 인터페이스의 구현은 자식클래스명 옆에 ":"와 함께 인터페이스명만 기술한다.
class TestClass31:Inter1{
    override fun inter1_Method2() {
        println("TestClass31의 Inter1에서 오버라이딩된 Method2이다.")
    }
}

class TestClass32 : Inter2{
    override fun inter2_Method2() {
        println("TestClass32의 Inter2에서 오버라이딩된 Method2이다.")
    }
}


// 두 개 이상의 인터페이스를 구현하려면 인터페이스명을 ','로 구분하여 기술한다.
class TestClass33 : Inter1, Inter2{
    override fun inter1_Method2() {
        println("TestClass33의 Inter1에서 오버라이딩된 Method2이다.")
    }
    override fun inter2_Method2() {
        println("TestClass33의 Inter2에서 오버라이딩된 Method2이다.")
    }
}
