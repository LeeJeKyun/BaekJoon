package main

import "fmt"

func main() {
	var input string
	fmt.Scanf("%s", &input)

	s := []rune(input)
	result := 0
	for _, v := range s {
		if v >= 'A' && v <= 'C' {
			result += 3
		} else if v <= 'F' {
			result += 4
		} else if v <= 'I' {
			result += 5
		} else if v <= 'L' {
			result += 6
		} else if v <= 'O' {
			result += 7
		} else if v <= 'S' {
			result += 8
		} else if v <= 'V' {
			result += 9
		} else {
			result += 10
		}
	}

	fmt.Println(result)
}
