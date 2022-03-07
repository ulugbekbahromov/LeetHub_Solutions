var m = make(map[int]int)

func fib(n int) int {
    
    if n == 0 {
        return 0
    } else if n <= 2 {
        return 1
    } else if _, ok := m[n]; ok {
        return m[n]
    }
    
    m[n] = fib(n-1) + fib(n-2)
    return m[n]
}