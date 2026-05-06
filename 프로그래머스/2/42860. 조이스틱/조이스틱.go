func solution(name string) int {
    n := len(name)
    move := n - 1
    result := 0
    for i, c := range name {
        //결과 더하기
        result += calc(c)
        
        //A뭉텅이 구하기
        next := i + 1
        for next < n && name[next] == 'A' {
            next++
        }
        
        move = min(move, i + n - next + min(i, n-next))
    }
    
    return result + move
}

func calc(c rune) int {
    if c > 'N' {
        return int('Z' - c + 1)
    } else {
        return int(c - 'A')
    }
}

func min(a, b int) int {
    if a < b {
        return a
    } 
    return b
}