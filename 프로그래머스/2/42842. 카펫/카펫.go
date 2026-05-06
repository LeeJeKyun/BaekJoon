
func solution(brown, yellow int) []int {
	//전체 타일 수
	all := brown + yellow

	answer := make([]int, 0, 2)
	//약수만 진행
	for i := all; i >= 1; i-- {
		if all%i != 0 {
			continue
		}

		w := i
		l := all / i

		if brown == (2*w + 2*l - 4) {
			answer = append(answer, w)
			answer = append(answer, l)
			break
		}

	}
	return answer
}