package main

import "fmt"

func main() {
	var A, B, V int
	fmt.Scanf("%d %d %d", &A, &B, &V)
	r := (V - A) / (A - B)
	if (V-A)%(A-B) != 0 {
		r++
	}
	fmt.Println(r + 1)
}
