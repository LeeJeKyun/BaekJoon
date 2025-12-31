package main

import "fmt"

func main() {
    var n, m int
    fmt.Scanf("%d %d", &n, &m)
    
    s := make([]int, n)
    for i, _ := range s {
        s[i] = i+1
    }
    
    for a := 0; a < m; a++ {
        var i, j int
        fmt.Scanf("%d %d", &i, &j)
        reverse(s, i, j)
    }
    
    for _, v := range s {
        fmt.Printf("%d ", v)
    }
}

func reverse(arr []int, a, b int) []int {
    a -= 1
    b -= 1
    
    for a < b {
        arr[a], arr[b] = arr[b], arr[a]
        a++
        b--
    }
    
    return arr
}