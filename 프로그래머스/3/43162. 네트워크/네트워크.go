var visited []bool

func solution(n int, computers [][]int) int {
    visited = make([]bool, n)
    networkCount := 0
    
    for i := 0; i < n; i++ {
        if !visited[i] {
            networkCount++
            dfs(i, n, computers)
        }
    }
    
    return networkCount
}

func dfs(current, n int, computers [][]int) {
    visited[current] = true
    
    for next := 0; next < n; next++ {
        if current != next && computers[current][next] == 1 && !visited[next] {
            dfs(next, n, computers)
        }
    }
}