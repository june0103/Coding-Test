class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()

        for(i in 0..queries.size-1){
            val s = queries[i][0]
            val e = queries[i][1]
            val k = queries[i][2]
            var array1 = intArrayOf()
            for(i in s..e){
                array1 = array1.plus(arr[i])
            }
            var array2 = intArrayOf()
            for(j in array1){
                if(k < j){
                    array2 = array2.plus(j)
                }
            }
            if(array2.isEmpty()){
                answer = answer.plus(-1)
            }else{
                val sortmin = array2.sorted()
                val min = sortmin.first()
                answer = answer.plus(min)
            }
        }   
        return answer
    }
}