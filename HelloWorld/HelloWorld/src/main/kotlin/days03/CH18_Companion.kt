package days03

// Companion
// 자바에서 static으로 사용되던 키워드가 companion이라는 키워드로 바뀌어 사용된다.
// 다만 static은 각 변수나 메서드에 각각 붙여 쓰지만,
// companion은 영역을 만들고 그 안에 정적멤버로 사용할 변수나 메서드를 다 때려 넣는다.

fun main(){

    var obj1 = TestClass()
    println("obj1.a1 : ${obj1.a1}") // obj1.a1 : 100

    obj1.testFun1()
    // 인스턴스 메서드 testFun1 실행!
    // a1:100
    // a2:200
    // companion메서드 testFun2 실행!
    // a2:200

    obj1.a1 = 200
    println("obj1.a1 : ${obj1.a1}") // obj1.a1 : 200

    println(" -------------------- ")

    // companion 영역에 선언된 멤버들은 객체 생성없이, 클래스 이름과 함께 바로 사용이 가능하다.
    println("TestClass.a2 : ${TestClass.a2}")   // TestClass.a2 : 200
    TestClass.testFun2()
    // companion메서드 testFun2 실행!
    // a2:200

}

class TestClass{
    var a1 = 100    // 인스턴스 멤버 변수

    companion object{
        var a2 = 200
        fun testFun2(){
            println("companion메서드 testFun2 실행!")
            //println("a1:$a1") // 에러발생 - 인스턴스 멤버는 companion(static)메서드에 접근할 수 없다.
            println("a2:$a2")   // 정적 멤버 메서드에서는 정적멤버변수의 접근이 가능
        }
    }

    fun testFun1(){ // 인스턴스 멤버 메서드
        println("인스턴스 메서드 testFun1 실행!")
        println("a1:$a1")
        println("a2:$a2")   // 인스턴스 메서드는 companion변수(a2)를 언제든 사용이 가능하다.
        testFun2()
    }
}







