package main

import "fmt"

func main() {
	//입력
	var N int
	fmt.Scanf("%d", &N)
	shirts := make([]int, 6)
	for i, _ := range shirts {
		fmt.Scanf("%d", &shirts[i])
	}
	var T, P int
	fmt.Scanf("%d %d", &T, &P)

	//각 사이즈의 개수 % T가 0인경우 몫을, 0이 아닌 경우 몫+1을 반환하여 더하기
	// 펜은 몫, 나머지 반환
	var x, y, z int
	var peopleCount int
	for _, v := range shirts {
		peopleCount += v
		x += tOrderCount(v, T)
	}
	y = peopleCount / P
	z = peopleCount % P

	fmt.Println(x)
	fmt.Printf("%d %d", y, z)
}

func tOrderCount(count, T int) int {
	if count%T == 0 {
		return count / T
	}
	return count/T + 1
}
