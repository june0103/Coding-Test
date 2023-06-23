class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer = IntArray(arr.size)
        
        for(i in queries){
            val s = i[0]
            val e = i[1]
            val k = i[2]
            
            for(j in s..e){
                if(j % k == 0){
                    answer[j]++
                }
            }
        }
        
        for(l in 0 until arr.size){
            answer[l] += arr[l]
        }
        
        return answer
    }
}