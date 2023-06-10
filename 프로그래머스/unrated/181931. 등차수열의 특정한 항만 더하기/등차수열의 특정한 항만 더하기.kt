class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var result = a
        for(i in included){
            if(i){
                answer += result
            }
            result += d
        }
        
        return answer
    }
}