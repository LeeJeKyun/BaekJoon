import (
    "strings"
)
func solution(number string, k int) string {
    //선택해야 하는 숫자의 수
    choice := len(number) - k
    
    //0 ~ l-k+1 사이의 최대값 인덱스 찾기
    startIdx := 0
    sb := strings.Builder{}
    for i := 0; i < choice; i++ {
        endIdx := k + 1 + i
        if endIdx >= len(number) {
            endIdx = len(number)
        }
        //만약 시작인덱스가 종료인덱스보다 작을 경우 반복문
        //아닐 경우 시작인덱스가 최대값
        m := byte('0')
        
        for j := startIdx; j < endIdx; j++ {
            current := number[j]
            if current > m {
                m = number[j]
                startIdx = j + 1
            }
        }
        
        sb.WriteByte(m)
    }
    
    return sb.String()
}