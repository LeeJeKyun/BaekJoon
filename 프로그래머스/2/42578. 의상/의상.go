func solution(clothes [][]string) int {
    //map[string]int로 부위별 옷 개수 정리
    clothesCount := make(map[string]int)
    for _, v := range clothes {
        value := clothesCount[v[1]] 
        clothesCount[v[1]] = value + 1
    }
    
    result := 1
    //(옷개수+1) * (옷개수+1) ... 계산
    for _, v := range clothesCount {
        result *= (v + 1)
    }
    
    //결과에서 1빼서 반환
    return result - 1
}