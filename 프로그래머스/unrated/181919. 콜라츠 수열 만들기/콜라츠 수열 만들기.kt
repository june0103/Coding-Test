class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var a = n
        
        while(a != 1){
            answer = answer.plus(a)
            if(a % 2 == 0){
                a = a/2
            }else{
                a = a*3+1
            }
        }
        
        answer = answer.plus(1)
        
        return answer
    }
}