func fib(n int) int {
    if n == 0 || n == 1 {
        return n
    } 
    
    a, b := 0, 1
    sum := 0
    
    for i := 1; i < n; i++ {
        sum = a + b
        a, b = b, sum
    }
    
    return sum
}