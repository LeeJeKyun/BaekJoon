package main

import "fmt"

func main() {
    var s1 string
    fmt.Scan(&s1)
    for _, v := range s1 {
        fmt.Printf("%c\n", v)
    }
}