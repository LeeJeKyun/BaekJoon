import (
	"fmt"
	"strconv"
)

func solution(a int, b int) int {
	s1 := fmt.Sprintf("%d%d", a, b)
	s2 := fmt.Sprintf("%d%d", b, a)
	i1, _ := strconv.Atoi(s1)
	i2, _ := strconv.Atoi(s2)
	if i1 > i2 {
		return i1
	} else {
		return i2
	}
}