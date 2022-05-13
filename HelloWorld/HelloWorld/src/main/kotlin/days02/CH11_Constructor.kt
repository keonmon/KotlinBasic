package days02

fun main(){

    val obj1 = TestClass11()
    println("obj1:$obj1")

    println("---------------------------")

    val obj2 = TestClass12()    // 매개변수가 없는 생성자 동작
    println("obj2:$obj2")
    println("obj2.v1:${obj2.v1}")   // obj2.v1:0
    println("obj2.v2:${obj2.v2}")   // obj2.v2:0
    val obj3 = TestClass12(100,200) // 매개변수가 두 개인 생성자 동작
    println("obj3:$obj3")
    println("obj3.v1:${obj3.v1}")   // obj3.v1:100
    println("obj3.v2:${obj3.v2}")   // obj3.v2:200

    println("---------------------------")

    val obj4 = TestClass13(100,200)
    println("obj4.a1:${obj4.a1}")   // obj4.a1:100
    println("obj4.a2:${obj4.a2}")   // obj4.a2:200
    // val obj5 = TestClass13() // 에러 : 매개변수 두개 있는 생성자가 디폴트 생성자를 대체하고
    // 별도로 디폴트 생성자를 오버로딩 하지 않았으므로 이것은 에러가 발생한다.

    println("---------------------------")

    // val obj5:TestClass15 = TestClass15(10,20)
    val obj6:TestClass15 = TestClass15()        // 매개변수가 없는 보조생성자 호출
    val obj7:TestClass15 = TestClass15(10)  // 매개변수가 하나인 보조생성자 호출


}


class TestClass11{
    init{
        println("init블럭 처리 : 객체가 생성되면 자동으로 동작되는 부분")
    }
}   // 코틀린은 클래스에 init블럭을 만들어주면 객체 생성시 자동으로 처리되는 코드를 만들 수 있다.
// 멤버변수에 값을 초기화하는 기능도 가능하다.
// init블럭은 생성자와 비슷한 역할을 할 수 있는 역영이지만, 전달인수나 기타의 함수로서의 기능은 없는 단순블럭이다.
// init블럭은 멤버변수 초기화, 생성자는 그외 객체 생성시 해야할 일들이 실행된다.


class TestClass12{
    var v1:Int = 0
    var v2:Int = 0
    // 생성자(constructor)를 만든다.
    // 생성자를 만들지 않으면 내부에 존재하는 디폴트 생성자가 사용되지만, 인위적으로 꺼내어 따로 기술할 수 있다.
    // 코틀린 클래스의 생성자 이름은 클래스이름을 따르지 않고, 'constructor'로 사용된다.
    constructor(){
        println("매개변수가 없는 생성자 동작")
    }
    // 'constructor'라는 이름의 생성자는 오버로딩이 가능하다.
    constructor(a1:Int, a2:Int){
        println("매개변수가 두 개인 생성자 동작")
        v1 = a1
        v2 = a2
    }
}


// 클래스명 옆에 기술하는 생성자
// 자바에는 없는 생성자이며 '주(대표)생성자'라고 부른다.
// 그 외 클래스 내부에 만들어지는 다른 오버로딩된 생성자들은 '보조생성자'라고 부른다.
// 주생성자에서 매개변수들은 var, val 등을 붙여 선언한다.
// 이들은 생성자의 매개변수이기도 하지만, 클래스의 멤버변수가 되기도 한다.
// 클래스 TestClass13의 이름 옆의 생성자는 매개변수가 없는 디폴트생성자를 대체하는 생성자로서, 매개변수 없는 생성자는
// 현재 클래스에서 없다고 생각해야 한다. 디폴트 생성자를 추가해야한다면 보조생성자로 오버로딩 되도록 생성해야 한다.
class TestClass13 constructor(var a1:Int, val a2:Int){
}

// class TestClass13 constructor(){}
// 클래스 생성시 매개변수가 없는 생성자는 이미 존재하기 떄문에 위와같은 표현은 따로 쓰지 않는다.
// class Test13{}

// 위 생성자의 모습은 이렇게도 바뀌어 사용할 수 있다. (클래스에 더 이상 쓸 내용이 없어서 중괄호 생략)
class TestClass14 (var a1:Int, val a2:Int)

// 클래스 이름 옆에 생성자를 만들고 나서 오버로딩된 다른 보조생성자를 사용하고 싶을 때
class TestClass15(var a1:Int, val a2:Int){
    // ※ 클래스의 이름옆에 있는 대표생성자는 객체생성시에 반드시 한번은 호출되어야 하는 강제규칙이 있다.
    // 이는 보조생성자가 있고 보조생성자가 호출되더라도 마찬가지이다.

    // 만약 객체 생성시에 보조생성자가 호출되었다면, 해당 보조생성자에서 대표생성자를 재호출해야 에러가 없다.
    // 보조생성자에서 디폴트 생성자를 재호출하는 방법은 constructor()옆에 :this(디폴트생성자에 맞는 전달인수)형태로 호출한다.
    // 클래스 이름 옆에 대표 생성자는 "멤버변수를 포함하고 있기 때문에" 그를 호출하지 않으면 객체 생성시 멤버변수가 만들어지지 않는다는 말과 같다.
    // 따라서 반드시 this 호출이 필요하다.

    constructor() :this(10,20){
        println("매개변수가 없는 보조생성자 호출")
    }
    constructor(a1:Int) :this(10,a1){
        println("매개변수가 하나인 보조생성자 호출")
    }
}