
func solution(age int) string {
	bytes := []byte{}
	for age/10 != 0 {
		bytes = append(bytes, byte(age%10))
		age /= 10
	}
	bytes = append(bytes, byte(age%10))
	for i, _ := range bytes {
		bytes[i] += 97
	}

	result := []byte{}
	for i := len(bytes) - 1; i >= 0; i-- {
		result = append(result, bytes[i])
	}

	return string(result)
}