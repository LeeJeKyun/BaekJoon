package main

import "fmt"

func main() {
	var str string
	fmt.Scanf("%s", &str)
	s := []rune(str)
	others := 0
	mag := 1
	for i, v := range s {
		if i%2 == 0 {
			//1배
			if v == '*' {
				mag = 1
				continue
			}
			others += int(v - '0')
		} else {
			//3배
			if v == '*' {
				mag = 3
				continue
			}
			others += int(v-'0') * 3
		}
	}

	mod := others % 10

	if mag == 1 {
		fmt.Println((10 - mod) % 10)
	} else { // mag == 3
		fmt.Println((7 * (10 - mod)) % 10)
	}
}
