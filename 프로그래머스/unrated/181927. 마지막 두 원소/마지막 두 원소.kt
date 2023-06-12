class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val a = num_list[num_list.size-1]
        val b = num_list[num_list.size-2]
                
        if(a > b) answer = num_list.plus(a-b)
        if(a <= b) answer = num_list.plus(a*2)
        
        return answer
    }
}