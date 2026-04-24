func solution(elements []int) int {
    l := len(elements)
    result := map[int]bool{}
    
    //길이의 반복
    for i := 1; i <= l-1; i++ {
        //인덱스의 반복
        for j := 0; j < l; j++ {
            value := 0
            //합의 반복
            for k := j; k <= j + i - 1; k++ {
                value += elements[k%l]
            }
            result[value] = true
        }
    }
    
    last := 0
    for i := 0; i < l; i ++ {
        last += elements[i]
    }
    result[last] = true
    
    return len(result)
}