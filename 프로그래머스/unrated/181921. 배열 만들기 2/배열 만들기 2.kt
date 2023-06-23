class Solution {
    fun solution(l: Int, r: Int): IntArray {
        val answer = mutableListOf<Int>()
        
        for(i in l..r){
            val a = i.toString().toList()
            var b = true
            for(j in a){
                // '5' 또는 '0'이 아닌 경우에 b를 false로 변경
                if(j != '5' && j != '0'){
                    b = false
                    break
                } 
            }
            if(b){
                answer.add(i)
            }
        }
        
        if(answer.isEmpty()){
            return intArrayOf(-1)
        }else{
            return answer.toIntArray()
        }
    }
}