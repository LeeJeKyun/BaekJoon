import (
	"strings"
)

func solution(my_string string, k int) string {
	builder := strings.Builder{}
	for i := 0; i < k; i++ {
		builder.WriteString(my_string)
	}
	return builder.String()
}