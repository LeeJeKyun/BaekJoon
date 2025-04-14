func solution(arr []string) string {
	rs := []rune{}
	for _, v := range arr {
		runes := []rune(v)
		rs = append(rs, runes[0])
	}
	return string(rs)
}