func solution(number []int) int {
    //시작번호 0~len-3
    //삼총사여부 확인 함수
    //3중 반복?
    //첫번호, 두번째번호, 세번째번호
    result := 0
    for i := 0; i < len(number)-2; i++ {
        for j := i+1; j < len(number)-1; j++ {
            for k := j+1; k < len(number); k++ {
                if isZero(number[i], number[j], number[k]) {
                    result++
                }
            }
        }
    }
    return result
}

func isZero (a, b, c int) bool {
    if a + b + c == 0 {
        return true
    }
    
    return false
}