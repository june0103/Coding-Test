class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var a = 1
        var b = 0
        
        for(list in num_list){
            a = a * list  
            b += list 
        }
        if(a < b*b){
            answer = 1
        }
        
        return answer
    }
}