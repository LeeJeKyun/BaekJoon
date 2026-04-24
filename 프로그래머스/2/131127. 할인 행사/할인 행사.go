func solution(want []string, number []int, discount []string) int {
    //구매품목 정리
    items := map[string]int{}
    
    for i, _ := range want {
        items[want[i]] = number[i]
    }
    
    //10일간의 데이터 정리(map)
    // 내부에서 map이 일치하는지 확인 후 일치할 경우 결과에 +1
    // 결과 반환
    result := 0
    for i := 0; i < len(discount) - 9; i++ {
        sales := map[string]int{}
        for j := i; j < i + 10; j++ {
            sales[discount[j]]++
        }

        same := true
        for k, v := range items {
            if v != sales[k] {
                same = false
            }
        }
        if same {result++}
    }
    
    return result
}