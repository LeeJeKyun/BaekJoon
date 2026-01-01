package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	s := make([]int, 10001)
	var iter int
	fmt.Scanf("%d", &iter)
	reader := bufio.NewReader(os.Stdin)
	for i := 0; i < iter; i++ {
		var a int
		fmt.Fscan(reader, &a)
		s[a]++
	}

	writer := bufio.NewWriter(os.Stdout)
	defer writer.Flush()
	for i, v := range s {
		if v == 0 {
			continue
		}
		for j := 0; j < v; j++ {
			fmt.Fprintln(writer, i)
		}
	}
}
