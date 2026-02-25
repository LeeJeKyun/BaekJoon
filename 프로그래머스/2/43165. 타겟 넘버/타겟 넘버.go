
var results = make([]int, 0)

func solution(numbers []int, target int) int {
	answer := 0
	
	dfs(0, numbers[0], numbers[1:])
	dfs(0, -numbers[0], numbers[1:])
	
	for _, v := range results {
		if v == target {
			answer++
		}
	}
	return answer
}

func dfs(sum, number int, leftNumbers []int) {
	if len(leftNumbers) == 0 {
		results = append(results, sum+number)
		return
	}
	dfs(sum+number, leftNumbers[0], leftNumbers[1:])
	dfs(sum+number, -leftNumbers[0], leftNumbers[1:])
}
