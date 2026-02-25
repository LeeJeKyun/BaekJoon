import (
    "sort"
    "strconv"
)

func solution(numbers []int) string {
    //문자열로 바꿔서 넣기
    strings := make([]string, 0, len(numbers))
    for _, v := range numbers {
        str := strconv.Itoa(v)
        strings = append(strings, str)
    }
    
    sort.Slice(strings, func(i, j int) bool {
        return strings[i]+strings[j] > strings[j]+strings[i]
    })
    
    result := ""
    for _, v := range strings {
        result += v
    }
    
    if result[0] == '0'{
        return "0"
    }
    
    return result
}