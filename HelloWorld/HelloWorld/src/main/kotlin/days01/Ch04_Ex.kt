package days01

import java.text.DecimalFormat

fun main(){
    // 코틀린의 화면 입력
    print("국어점수 입력 : ")
    val kor:Int = readLine()!!.toInt()
    print("영어점수 입력 : ")
    val eng:Int = readLine()!!.toInt()
    print("수학점수 입력 : ")
    val mat:Int = readLine()!!.toInt()
    // 국어 영어 수학 점수를 입력 받아서 총점 평균 성적표 양식에 맞춰 출력하세요


    val tot:Int = sum(kor,eng,mat)
    val avg:Double = average(tot)
    prn(kor, eng, mat, tot, avg)

}

fun sum(kor:Int, eng:Int, mat:Int) : Int{
    return kor + eng + mat
}

fun average(tot:Int) : Double {
    return tot/3.0
}
fun prn(kor:Int, eng:Int, mat:Int, tot:Int, avg:Double):Unit{
    val df1 = DecimalFormat("#,##0.0")
    println("\t\t===성적표===")
    println("-----------------------------------")
    println("국어\t영어\t수학\t총점\t평균")
    println("-----------------------------------")
    println("$kor\t\t$eng\t\t$mat\t\t$tot\t\t${df1.format(avg)}\t")
    println("-----------------------------------")

}
