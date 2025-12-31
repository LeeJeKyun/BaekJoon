package main

import "fmt"

func main() {
    var n int
    fmt.Scanf("%d", &n)
    
    a := n/4
    
    str := ""
    for i := 0; i < a; i++ {
        str += "long "
    }
    
    str += "int"
    
    fmt.Println(str)
}