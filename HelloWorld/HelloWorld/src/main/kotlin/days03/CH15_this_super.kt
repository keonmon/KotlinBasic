package days03

fun main(){
    var obj1 = TestClass21()
    obj1.testMethod1()

    println(" ------------- ")

    var obj2 = SubClass11()
    obj2.superMethod1()

    println(" ------------- ")

    var obj3 = SubClass12(600)
    obj2.superMethod1()

}

// ** this의 용도 **
// 멤버변수와 매개변수(또는 지역변수)의 이름이 같을 때 그들을 구분하기 위해 사용한다.
// 대표 생성자가 있는 경우 보조 생성자에서 기본 생성자의 매개변수 개수와 자료형에 맞춰서 반드시 호출해야하는데, 이때 this 키워드를 사용한다.
// 메서드 내부에 다른 메서드 (이름하야 지역메서드:지역변수와 같은 의미)를 만들어 쓸 수 있는데 멤버메서드와 구분하기 위해 사용한다.

class TestClass21 (var a2:Int){
    var a1:Int = 200
    constructor():this(300){
        // 보조생성자는 반드시 대표생성자를 this키워드를 이용하여 호출해야한다. 대표생성자의 매개변수가 멤버변수로 생성되어야 하는데,
        // 호출되지 않으면 생성되지 않기 떄문이다.
    }
    fun testMethod1(){
        var a1 = 100
        println("메서드의 지역변수 a1 : $a1")
        println("TestClass21의 멤버변수 a1 : ${this.a1}")
        // $this.a1이라고 쓰면, 클래스명@해시코드.a1으로 출력된다.
        // 멤버변수의 값을 출력하고 싶다면, 위와같이 ${this.a1}라고 작성한다.
        fun testMethod2(){
            println("testMethod1() 내부의 testMethod2() 메서드")
        }
        testMethod2()   // 지역메서드 우선 실행
        this.testMethod2()  // 멤버메서드 실행
    }
    fun testMethod2(){
        println("멤버메서드 testMethod2()")
    }
}



// ** super의 용도 **
// 상속관계의 자식 생성자에서, 부모클래스의 생성자를 호출할 때, 자식 클래스의 이름 옆에 부모 클래스의 이름을 사용하지만, 보조 생성자에서는 super라는 키워드를 쓴다.
// 자식 클래스에서 오버라이드된 메서드 그리고 변수를 사용할 때, 인위적으로 부모의 메서드를 호추하거나 변수값을 취할 때 사용한다.

open class SuperClass(var a2:Int){  //대표생성자
    open var a1 = 100
    constructor():this(200){ }  // 보조생성자
    open fun superMethod1(){
        println("SuperClass의 superMethod1()")
    }
}

// 대표생성자와 보조생성자가 모두 있는 부모클래스는 둘 중 어떤 형태로도 상속(부모클래스 생성자호출)이 가능하다.
class SubClass11 : SuperClass(/*200*/) {
    override fun superMethod1() {
        super.superMethod1()    // 부모클래스의 메서드
        println("super.a1 : ${super.a1}")   // 부모클래스의 멤버변수
        println("SubClass의 superMethod1")
    }
}

class SubClass12 : SuperClass {
    // constructor키워드로 생성된 생성자 이름 옆에 super키워드를 이용하여 부모클래스의 대표생성자를 직접 호출할 수 있다.
    // 그 경우 Extends로 연결되는 부모클래스 이름 옆의 괄호는 지워진다.
    // class SubClass12 : SuperClass() -> class SubClass12 : SuperClass
    constructor(a1:Int) : super(a1){ }
}