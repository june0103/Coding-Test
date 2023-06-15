class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = my_string.substring(my_string.length-n until my_string.length)
        
        return answer
    }
}