func solution(n int) int {
    if n == 1 {
        return 1
    }
    if n == 2 {
        return 1
    }
    arr := make([]int, n + 1)
    arr[1] = 1
    arr[2] = 1
    for i := 3; i <= n; i++ {
        arr[i] = (arr[i-1]+arr[i-2]) % 1234567
    }
    
    return arr[n]
}