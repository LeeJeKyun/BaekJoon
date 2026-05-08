import "sort"

func solution(k int, tan []int) int {
	answer := 0

	organize := make(map[int]int)
	for _, v := range tan {
		organize[v]++
	}
	sizes := make([]int, 0, len(organize))
	for _, v := range organize {
		sizes = append(sizes, v)
	}

	//내림차순 정렬
	sort.Slice(sizes, func(i, j int) bool {
		return sizes[i] > sizes[j]
	})

	if sizes[0] > k {
		return 1
	}

	current := 0
	for _, v := range sizes {
		if current+v >= k {
			answer++
			break
		}
		current += v
		answer++
	}

	return answer
}