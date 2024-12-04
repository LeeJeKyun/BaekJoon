package main

import "fmt"

func main() {
	var t int
	fmt.Scan(&t)
	sp := 1
	ep := 1
	sum := 1
	count := 1
	for ep < t {
		if sum < t {
			ep++
			sum += ep
		} else if sum > t {
			sum -= sp
			sp++
		} else if sum == t {
			ep++
			sum += ep
			count++
		}
	}
	fmt.Println(count)
}
