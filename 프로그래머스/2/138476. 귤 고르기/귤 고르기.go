import "sort"

func solution(k int, tangerine []int) int {
    // map[int]int로 크기별 개수 정리
    // 개수들을 합하여 k가 나올 경우의 수 중 수를 최소로 사용하는 수 찾기
    // 슬라이스에 내림차순 정렬 후 숫자를 합해보며 추출
    
    counts := map[int]int{}
    
    //1. map에 정리
    for _, v := range tangerine {
        counts[v]++
    }
    
    //2. slice에 정리(개수별로)
    numbers := make([]int, 0, len(counts))
    for _, v := range counts {
        numbers = append(numbers, v)
    }
    
    //3. 내림차순 정렬
    sort.Slice(numbers, func(i, j int) bool {
        return numbers[i] > numbers[j]
    })
    
    // 가장 많은 개수가 k보다 클 경우
    if numbers[0] > k {
        return 1
    }
    
    current := 0
    result := 0
    for i := 0; i < len(numbers); i++ {
        now := numbers[i]
        //만약 누적값 + 현재값이 k라면
        if current+now >= k {
            result++
            break;
        }
        //아무것도 아니라면 누적값에 현재값 더하고 결과도 하나 더하기
        current += now
        result++
    }
    
    return result
}