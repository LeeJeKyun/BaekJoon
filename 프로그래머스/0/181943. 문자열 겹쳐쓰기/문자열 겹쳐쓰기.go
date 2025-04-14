func solution(my_string string, overwrite_string string, s int) string {
    	s1 := my_string[:s]
	s2 := my_string[s+len(overwrite_string):]
	runes := []rune(s1)
	for _, v := range overwrite_string {
		runes = append(runes, v)
	}
	for _, v := range s2 {
		runes = append(runes, v)
	}
	result := string(runes)
	return result
}