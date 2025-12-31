package main

import "fmt"

func main() {
    var n, m int
    fmt.Scanf("%d %d", &n, &m)
    s := make([]int, n+1)
    for a := 0; a < m; a++ {
        var i, j, k int
        fmt.Scanf("%d %d %d", &i, &j, &k)
        for b := i; b <= j; b++ {
            s[b] = k
        }
    }
    
    for a := 1; a < len(s); a++ {
        fmt.Printf("%d ",s[a])
    }
}