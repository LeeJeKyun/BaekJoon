import (
    "sort"
)

func solution(citations []int) int {
    // 1. 내림차순 정렬 (잘 하셨습니다!)
    sort.Slice(citations, func(i, j int) bool {
        return citations[i] > citations[j]
    })

    hIndex := 0
    for i, v := range citations {
        // 현재 논문의 순번(i+1)
        paperCount := i + 1
        
        // "paperCount"번째 논문까지는 모두 "v"번 이상 인용됨.
        // 만약 인용 횟수 v가 현재 논문 수(paperCount)보다 크거나 같다면,
        // 일단 paperCount를 hIndex로 볼 수 있습니다.
        if v >= paperCount {
            hIndex = paperCount
        } else {
            // 더 이상 조건을 만족하지 않으면 중단
            break
        }
    }
    
    return hIndex
}