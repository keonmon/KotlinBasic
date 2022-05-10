package days03


// Any 클래스는 자바의 Object 클래스와 같은 '모든 클래스의 부모클래스가 되는 클래스'.
// 이미 만들어져 있거나, 앞으로 생성될 클래스에 따로 명시하지 않아도, 다른 클래스를 상속받지 않아도, 그 클래스는 Any클래스를 상속받고 있다.
// 다만 다른 클래스를 상속받고 있는 클래스는 그 부모 클래스가 Any클래스를 상속받고 있기 때문에 결과적으로 자기 자신도 Any클래스의 자식(손자) 클래스가 된다고 볼 수 있다.

fun main(){

    val obj1 = TestClass11()
    println("obj1 : $obj1")
    // 참조변수를 println에 넣으면 Any클래스에서 상속받은 toString() 메서드가 실행되어 
    // 클래스 이름과 해시코드가 출력된다. obj1 : days03.TestClass11@해시코드

    // Any클래스에서 상속받은 toString메서드를 오버라이드 클래스는 재정의된 메서드가 실행된다.
    val obj2 = TestClass12()
    println("obj2 : $obj2")

    testFun(obj1)
    testFun(obj2)

}

class TestClass11{ }

class TestClass12{
    // Any클래스에서 상속받은 toString을 오버라이딩하여 사용할 수 있다.
    override fun toString() : String{
        return "TestClass12 객체입니다."
    }
}



// 매개변수의 자료형이 Any라는 것은 모든 클래스의 객체가 전달인수로 전달될 수 있다는 뜻
fun testFun(a:Any){
    println("a:$a")
}