package main

import "fmt"

func main() {
	var N, K int
	fmt.Scanf("%d %d", &N, &K)
	k := N - K
	if k < K {
		K = k
	}

	result := 1
	for i := 0; i < K; i++ {
		result *= N
		N--
	}
	for i := K; i > 0; i-- {
		result /= i
	}
	fmt.Println(result)
}
