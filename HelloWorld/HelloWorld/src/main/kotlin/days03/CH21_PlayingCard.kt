package days03

fun main(){
    // CardDeck 객체 생성
    var d : CardDeck = CardDeck()

    // 세명의 플레이어가 받은 카드 배열 생성 p1 p2 p3
    var p1 = Array<Card>(5,{ Card() })
    var p2 = Array<Card>(5,{ Card() })
    var p3 = Array<Card>(5,{ Card() })

    d.shuffle()

    var i = 0
    var k = 0
    while(i<5){
        p1[i] = d.pick(k++)
        p2[i] = d.pick(k++)
        p3[i] = d.pick(k++)
        i++
    }

    for(item in p1)
        print("$item ");
    println()
    for(item in p2)
        print("$item ");
    println()
    for(item in p3)
        print("$item ");
    println()

}