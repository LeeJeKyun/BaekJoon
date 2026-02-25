func solution(bridge_length int, weight int, truck_weights []int) int {
	result := 0
	arr := make([]int, bridge_length)
	currentWeight := 0
	index := 0

	// 모든 트럭이 "진입"할 때까지 반복
	for index < len(truck_weights) {
		result++ // 매 루프는 1초의 흐름을 의미합니다.

		// 1. 일단 다리에서 하나를 내보냅니다. (나가는 건 0일 수도, 트럭일 수도 있음)
		// 기존 PopAndPush를 쓰되, 이번 루프에서 들어올 트럭은 뒤에서 결정합니다.
		currentWeight -= arr[0]
		arr = arr[1:]

		// 2. 새 트럭이 들어올 수 있는지 체크
		if currentWeight+truck_weights[index] <= weight {
			// 들어올 수 있다면 새 트럭 진입
			currentWeight += truck_weights[index]
			arr = append(arr, truck_weights[index])
			index++
		} else {
			// 들어올 수 없다면 빈 공간(0) 진입
			arr = append(arr, 0)
		}
	}

	// 마지막 트럭이 진입만 하고 루프가 끝났으므로,
	// 그 트럭이 다리를 완전히 빠져나가는 시간(bridge_length)을 더해줍니다.
	return result + bridge_length
}
