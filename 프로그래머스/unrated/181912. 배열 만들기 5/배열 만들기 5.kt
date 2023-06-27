class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(a in intStrs){
            val sub = a.substring(s,s+l).toInt()
            if(sub > k){
                answer = answer.plus(sub)
            }
        }
        
        return answer
    }
}