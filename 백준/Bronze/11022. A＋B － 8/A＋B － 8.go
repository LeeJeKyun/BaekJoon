package main

import "fmt"

func main() {
    var t int
    fmt.Scanf("%d", &t)
    
    for i := 1; i <= t; i++ {
        var a, b int
        fmt.Scanf("%d %d", &a, &b)
        fmt.Printf("Case #%d: %d + %d = %d\n",i,a,b,a+b)
    }
}