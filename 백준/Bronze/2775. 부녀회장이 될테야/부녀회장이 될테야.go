package main

import "fmt"

func main() {
	s := make([][]int, 15)
	s[0] = make([]int, 15)
	for i := 0; i <= 14; i++ {
		s[0][i] = i
	}
	for i := 1; i <= 14; i++ {
		s[i] = make([]int, 15)
		for j := 1; j <= 14; j++ {
			s[i][j] = s[i][j-1] + s[i-1][j]
		}
	}

	var iter int
	fmt.Scanf("%d", &iter)
	for i := 0; i < iter; i++ {
		var k, n int
		fmt.Scanf("%d", &k)
		fmt.Scanf("%d", &n)
		fmt.Println(s[k][n])
	}

}
