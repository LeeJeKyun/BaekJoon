package main

import "fmt"

func main() {
    var n int
    fmt.Scanf("%d", &n)
    
    for i := 1; i <= n; i++ {
        var x, y int
        fmt.Scanf("%d %d", &x, &y)
        fmt.Printf("Case #%d: %d",i,x+y)
        if i != n {
            fmt.Printf("\n")
        }
    }
}