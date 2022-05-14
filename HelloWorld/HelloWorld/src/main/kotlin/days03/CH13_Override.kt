package days03

fun main(){

    // 상속이 구현된 자식 클래스를 이용하여 객체를 만들고 자식클래스가 새로 만든 변수를 출력하고 메서드를 실행해본다.
    var obj1:SubClass1 = SubClass1()
    println("obj1.subA1 : ${obj1.subA1}")  // obj1.subA1 : 200
    obj1.subMethod()                        // SubClass1의 subMethod1입니다

    // 상속받은 부모 클래스의 변수를 출력하고, 부모클래스에 있는 메서드를 실행
    println("obj1.superA1 : ${obj1.superA1}")   // obj1.superA1 : 100
    obj1.superMethod()                           // SuperClass1의 superMethod1입니다

    println(" ----------------------------------------- " )

    val obj2:SubClass2 = SubClass2()
    // 오버라이딩 된 메서드를 실행
    obj2.superMethod2()     // SubClass2의 오버라이딩 된 superMethod2

    // 부모클래스의 레퍼런스 변수에 자식클래스의 인스턴스를 저장
    val obj3:SuperClass2 = SubClass2()
    // 부모클래스의 레퍼런스 변수로 실행한 메서드는 ... 자식 클래스에서 재정의된 메서드가 우선 실행된다.
    obj3.superMethod2()     // SubClass2의 오버라이딩 된 superMethod2

    println(" ----------------------------------------- " )

    // 전달인수로 부모 인스턴스 주소 전달
    Test1(obj2);    // SubClass2의 오버라이딩 된 superMethod2

    val obj4:SuperClass2 = SuperClass2()
    Test1(obj3)     // SubClass2의 오버라이딩 된 superMethod2
    Test1(obj4)     // SuperClass2의 superMethod2입니다

}

// 일반적인 상속
open class SuperClass1{ // 상속을 하기위해 클래스를 open을 사용하여 생성
    var superA1 = 100
    fun superMethod(){
        println("SuperClass1의 superMethod1입니다")
    }
}

// SuperClass1 클래스를 상속받는 SubClass1을 생성
class SubClass1 : SuperClass1(){
    var subA1 = 200
    fun subMethod(){
        println("SubClass1의 subMethod1입니다")
    }
}

// 메서드 오버라이딩을 위한 상속
open class SuperClass2{
    // 오버라이드가 될 부모클래스의 메서드는 반드시 앞에 open을 붙여 쓴다.
    open fun superMethod2(){
        println("SuperClass2의 superMethod2입니다")
    }
}

class SubClass2 : SuperClass2(){
    override fun superMethod2(){
        // super.superMethod2() // 부모 클래스의 오버라이딩 되기 전 메서드 호출 : super키워드 사용
        println("SubClass2의 오버라이딩 된 superMethod2")
    }
}

fun Test1(obj:SuperClass2){
    obj.superMethod2()
}