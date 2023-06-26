class Solution {
    fun solution(number: String): Int {
        var answer: Int = 0
        
        for(i in number){
            answer += i.toString().toInt()
        }
        
        
        return answer % 9
    }
}