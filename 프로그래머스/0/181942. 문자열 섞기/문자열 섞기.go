func solution(str1 string, str2 string) string {
	rs := []rune{}
	for i := 0; i < len(str1); i++ {
		rs = append(rs, rune(str1[i]))
		rs = append(rs, rune(str2[i]))
	}
	return string(rs)
}