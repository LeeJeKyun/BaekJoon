package main

import "fmt"

func main() {

	var N int
	fmt.Scan(&N)
	var arr []int = make([]int, N)
	for i := 0; i < N; i++ {
		fmt.Scan(&arr[i])
	}

	for i := len(arr) - 1; i > 0; i-- {
		for j := 0; j < i; j++ {
			if arr[j] > arr[j+1] {
				temp := arr[j]
				arr[j] = arr[j+1]
				arr[j+1] = temp
			}
		}
	}

	for _, v := range arr {
		fmt.Println(v)
	}

}
