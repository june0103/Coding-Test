class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        
        for(i in 0..queries.size-1){
            var a = arr[queries[i][0]]
            arr[queries[i][0]] = arr[queries[i][1]]
            arr[queries[i][1]] = a
        }
        
        return arr
    }
}