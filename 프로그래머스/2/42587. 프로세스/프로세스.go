
func solution(priorities []int, location int) int {
	//Pack 슬라이스 생성 및 데이터 삽입
	packs := make([]Pack, len(priorities))
	for i, v := range priorities {
		pack := Pack{Priority: v, OriginalIndex: i}
		packs[i] = pack
	}

	answer := 0
	for len(packs) > 0 {
		// 1. Pop
		var origin Pack
		packs, origin = Pop(packs)

		// 2. Max여부 판단
		existMax := ExistMax(packs, origin)

		// 3. Max여부에 따라 Push 또는 answer++
		if existMax {
			packs = Push(packs, origin)
		} else {
			answer++
			if origin.OriginalIndex == location {
				return answer
			}
		}
	}
	return answer
}

type Pack struct {
	Priority      int
	OriginalIndex int
}

func Pop(packs []Pack) ([]Pack, Pack) {
	pack := packs[0]
	packs = packs[1:]
	return packs, pack
}

func ExistMax(packs []Pack, origin Pack) bool {
	for _, v := range packs {
		if origin.Priority < v.Priority {
			return true
		}
	}

	return false
}

func Push(packs []Pack, origin Pack) []Pack {
	packs = append(packs, origin)
	return packs
}
