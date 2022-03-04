func fib(n int) int {
    if n <= 1 {
        return n
    }
    
    a, b := 0, 1
    sum := 0
    
    for ;n > 1 ;n-- {
        sum = a + b
        a = b
        b = sum
    }
    
    return b
}