class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var a = ""
        var b = ""
        for(i in num_list){
            if(i % 2 == 0){
                a += i.toString()
            }else{
                b += i.toString()
            }
        }
        answer = a.toInt() + b.toInt()
        return answer
    }
}