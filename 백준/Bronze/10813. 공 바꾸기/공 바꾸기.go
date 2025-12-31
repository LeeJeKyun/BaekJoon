package main

import "fmt"

func main() {
    var n, m int
    fmt.Scanf("%d %d", &n, &m)
    
    s := make([]int, n)
    for i, _ := range s{
        s[i] = i + 1
    }
    
    for a := 0; a < m; a++ {
        var i, j int
        fmt.Scanf("%d %d", &i, &j)
        s[i-1], s[j-1] = s[j-1], s[i-1]
    }
    
    for _, v := range s{
        fmt.Printf("%d ", v)
    }
}