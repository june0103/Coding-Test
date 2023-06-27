class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        
        for(index in my_strings.indices){
            val part = parts[index]
            answer = answer + my_strings[index].substring(part[0], part[1]+1)
        }
        
        return answer
    }
}