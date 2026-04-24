func solution(n int, a int, b int) int {
    
    answer := 1
    for !isNeighbor(a,b) {
        if isEven(a) {
            a /= 2
        } else {
            a = a/2 + 1
        }
        
        if isEven(b) {
            b /= 2
        } else {
            b = b/2 + 1
        }
        answer++
    }
    
    return answer
}

func isNeighbor (a, b int) bool {
    if a < b && isEven(b) && a == b-1 {
        return true
    } else if b < a && isEven(a) && a == b+1 {
        return true
    }
    return false
}

func isEven(a int) bool {
    if a % 2 == 0 {
        return true
    }
    return false
}