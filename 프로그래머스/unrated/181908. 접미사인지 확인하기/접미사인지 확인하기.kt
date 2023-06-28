class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        var answer: Int = 0
        
        for(i in 0 until my_string.length){
            if(my_string.substring(i, my_string.length) == is_suffix) answer = 1
        }
        
        return answer
    }
}