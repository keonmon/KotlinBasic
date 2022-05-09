package days02

fun main(){

    // 월과 일을 입력받아 요일을 출력
    // 2022년에 한하여 입력
    // 2022년 1월 1일은 토요일, 상대적 위치의 값으로 요일을 선택
    println("월 입력 : ")
    val month:Int = readLine()!!.toInt()
    println("일 입력 : ")
    val day:Int = readLine()!!.toInt()

    var days:Int = sumdays(month)   // 1월부터 입력한 월의 전달까지 날짜 수 계산하는 함수 제작
    days += day
    val temp:Int = days % 7

    val weekday : String = selectWeekday(temp)  // 총 날짜를 7로 나눈 나머지로 요일을 계산하는 함수 제작
    println(weekday)
}

fun sumdays(month:Int)=when(month){
    1->0
    2->31
    3->31+28
    4->31+28+31
    5->31+28+31+30
    6->31+28+31+30+31
    7->31+28+31+30+31+30
    8->31+28+31+30+31+30+31
    9->31+28+31+30+31+30+31+31
    10->31+28+31+30+31+30+31+31+30
    11->31+28+31+30+31+30+31+31+30+31
    12->31+28+31+30+31+30+31+31+30+31+30
    else->0
}
fun selectWeekday(temp:Int)=when(temp){
    1->"토요일입니다"
    2->"일요일입니다"
    3->"월요일입니다"
    4->"화요일입니다"
    5->"수요일입니다"
    6->"목요일입니다"
    0->"금요일입니다"
    else->"잘못된 연산입니다."
}