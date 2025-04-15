func solution(n int) int {
	result := 0
	if n%2 == 0 {
		for i := 2; i <= n; i += 2 {
			result += i * i
		}
	} else {
		for i := 1; i <= n; i += 2 {
			result += i
		}
	}
	return result
}