import (
    "sort"
)


func find(parent []int, i int) int {
	if parent[i] == i {
		return i
	}
	parent[i] = find(parent, parent[i])
	return parent[i]
}

func union(parent []int, i, j int) {
	rootI := find(parent, i)
	rootJ := find(parent, j)
	if rootI != rootJ {
		parent[rootI] = rootJ
	}
}

func solution(n int, costs [][]int) int {
	sort.Slice(costs, func(i, j int) bool {
		return costs[i][2] < costs[j][2]
	})
	
	//유니온-파인드 자료구조 초기화
	parent := make([]int, n)
	for i := range parent {
		parent[i] = i
	}

	totalCost := 0
	bridges := 0

	for _, edge := range costs {
		if bridges == n-1 {
			break
		}

		u, v, cost := edge[0], edge[1], edge[2]

		if find(parent, u) != find(parent, v) {
			union(parent, u, v)
			totalCost += cost
			bridges++
		}
	}
	return totalCost
}