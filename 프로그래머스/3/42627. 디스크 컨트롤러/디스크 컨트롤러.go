import (
    heap "container/heap"
    "sort"
)

func solution(jobs [][]int) int {
	//요청시간에 따라 정렬
	sort.Slice(jobs, func(i, j int) bool {
		return jobs[i][0] < jobs[j][0]
	})

	h := &Heap{}
	currentTime, totalReturnTime, jobIdx, count := 0, 0, 0, 0
	n := len(jobs)

	for count < n {
		for jobIdx < n && jobs[jobIdx][0] <= currentTime {
			heap.Push(h, jobs[jobIdx])
			jobIdx++
		}

		if h.Len() > 0 {
			job := heap.Pop(h).([]int)
			currentTime += job[1]
			totalReturnTime += currentTime - job[0]
			count++
		} else {
			currentTime = jobs[jobIdx][0]
		}
	}

	return totalReturnTime / n
}

type Heap [][]int

func (h *Heap) Less(i, j int) bool {
	//1. 소요시간 - h[i][1], h[j][1]
	if (*h)[i][1] != (*h)[j][1] {
		return (*h)[i][1] < (*h)[j][1]
	}

	//2. 요청시각 - h[i][0], h[j][0]
	return (*h)[i][0] < (*h)[j][0]
}

func (h *Heap) Swap(i, j int) {
	(*h)[i], (*h)[j] = (*h)[j], (*h)[i]
}

func (h *Heap) Len() int {
	return len(*h)
}

func (h *Heap) Pop() (v interface{}) {
	*h, v = (*h)[:h.Len()-1], (*h)[h.Len()-1]
	return v
}

func (h *Heap) Push(v interface{}) {
	*h = append(*h, v.([]int))
}
