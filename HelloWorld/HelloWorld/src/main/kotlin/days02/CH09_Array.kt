package days02

fun main(){
    // 코틀린의 배열생성은 arrayOf를 자주 이용합니다.
    val array1 = arrayOf(10, 20, 30, 40, 50)
    println("array1:$array1")   //클래스 이름과 해시코드등이 출력된다.
    // 배열의 요소들을 한 번에 출력하려면 contentToString 함수를 사용한다.
    println("array1 : ${array1.contentToString()}")

    println("\n-----------------------")

    // 코틀린의 배열은 자료형의 제약이 없어서, 자바의 리스트 등 처럼 여러 자료형 데이터를 하나의 배열에 넣어서 사용할 수 있다.
    // 다만, 그것이 권장할 만한 동작은 아니기 때문에 자료형을 제한하는 코드가 제공되어 사용된다.

    //자료형 제약 없이 사용
    val array2 = arrayOf(100, 11.11, "문자열", true)
    println("array2 : ${array2.contentToString()}")

    // 하나의 자료로 제한하여 사용
    val array3 = intArrayOf(10, 20, 30, 40, 50) // 기본 자료형은 ArrayOf앞에 자료형을 붙여 쓰고 ( intArrayOf() )
    println("array3 : ${array3.contentToString()}")

    val array4 = doubleArrayOf(11.11, 22.22, 33.33, 44.44, 55.55)   // doubleArrayOf()
    println("array4 : ${array4.contentToString()}")

    val array5 = arrayOf<String>("문자열1", "문자열2", "문자열3")    // 객체형 자료는 제네릭을 사용한다. ( ArrayOf<> )
    println("array5 : ${array5.contentToString()}")

    // int array6 = new Int[5];
    // String str = new String[5];

    println("\n-----------------------")

    var array6 = Array(5,{0})   // 다섯개의 0이 채워진 배열 생성
    var str = Array<String?>(5,{null})  // 다섯개의 null이 채워진 배열. 코틀린의 변수는 null을 허용하지 않는 것이 기본이므로 이와같이 '?'를 넣어 null을 허용한다.

    println("array6 : ${array6.contentToString()}")
    println("str : ${str.contentToString()}")

    println("\n-----------------------")

    // 반복실행문으로 배열 요소 꺼내기
    for(item in array1){
        print("$item\t")
    }

    println("\n-----------------------")

    println("첫 번째 값 : ${array1.first()}")
    println("마지막 값 : ${array1.last()}")
    println("30의 위치 : ${array1.indexOf(30)}")
    println("평균 : ${array1.average()}")
    println("합 : ${array1.sum()}")
    println("개수 : ${array1.count()}")
    println("개수 : ${array1.size}")
    println("30을 포함하는가 : ${array1.contains(30)}")
    println("1000을 포함하는가 : ${array1.contains(1000)}")
    println("30을 포함하는가 : ${30 in array1}")
    println("1000을 포함하는가 : ${1000 in array1}")

    val array12 = arrayOf(5,1,3,7,10,8)

    val array13 = array12.sortedArray()
    println("요소를 오름차순으로 : ${array13.contentToString()}")

    val array14 = array12.sortedArrayDescending()
    println("요소를 내림차순으로: ${array14.contentToString()}")

}