import (
    "strconv"
)
var results = make(map[int]bool)

func solution(numbers string) int {
	answer := 0
	for i, v := range numbers {
        current := string(v)
		others := numbers[:i] + numbers[i+1:]
		dfs(current, others)
	}
	
	for k, _ := range results {
		if isPrime(k) {
			answer++
		}
	}
	
	return answer
}

func dfs(current, others string) {
	if current != "" {
		num, _ := strconv.Atoi(current)
		results[num] = true
	}
	for i, r := range others {
		dfs(current+string(r), others[:i]+others[i+1:])
	}
}

func isPrime(num int) bool {
    if num == 0 || num == 1 {
        return false
    }
	for i := 2; i < num; i++ {
		if num%i == 0 {
			return false
		}
	}
	return true
}
