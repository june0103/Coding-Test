class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        
        for(i in 1..numLog.size-1){
            if(numLog[i]-numLog[i-1] == 1){
                answer += "w"
            }else if(numLog[i]-numLog[i-1] == -1){
                answer += "s"
            }else if(numLog[i]-numLog[i-1] == 10){
                answer += "d"
            }else{
                answer += "a"
            }
        }
        
        return answer
    }
}