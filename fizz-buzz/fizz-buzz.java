class Solution {

    public List<String> fizzBuzz(int n) {
    
        List<String> list = new ArrayList<>();
        
        for (int i = 1, fizz = 0, buzz = 0; i <= n; i++) {
        
            fizz++;
            buzz++;
            
            if (fizz == 3 && buzz == 5) {
        
                fizz = 0; // back to 0
                buzz = 0; // back to 0
                list.add("FizzBuzz"); // add "FizzBuzz"
                
            } else if (fizz == 3) {
                
                fizz = 0; // back to zero
                list.add("Fizz"); // add "Fizz"
                
            } else if (buzz == 5) {
                
                buzz = 0; // back to zero
                list.add("Buzz"); // add "Buzz"
                
            } else {
                
                // add just number itself
                list.add(Integer.toString(i));
                
            }
        }
        
        return list;
    }
}