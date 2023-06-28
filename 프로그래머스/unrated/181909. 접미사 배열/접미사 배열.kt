class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        for(i in 0 until my_string.length){
            answer += my_string.substring(i, my_string.length)
        }
        
        return answer.sorted().toTypedArray()
    }
}