func containsDuplicate(nums []int) bool {
    m := make(map[int]int)
    
    for _, v := range nums {
        if m[v] == 1 {
            return true
        }
        m[v]++
    } 
    return false
}