package main

import "fmt"

func main() {
	var a, b int
	fmt.Scanf("%d %d", &a, &b)

	g := gcd(a, b)
	l := lmc(a, b)
	fmt.Println(g)
	fmt.Println(l)

}

func gcd(a, b int) int {
	if b == 0 {
		return a
	}
	return gcd(b, a%b)
}

func lmc(a, b int) int {
	return a * b / gcd(a, b)
}
