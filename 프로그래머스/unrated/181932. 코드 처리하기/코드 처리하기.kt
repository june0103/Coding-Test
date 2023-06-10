class Solution {
    fun solution(code: String): String {
    var answer: String = ""
    var idx = 0
    var mode = 0
    val size = code.length

    
        while (idx < size) {
            if (mode == 0) {
                if (code[idx] == '1') mode = 1 else if (idx % 2 == 0) answer += code[idx]
            } else if (mode == 1) {
                if (code[idx] == '1') mode = 0 else if (idx % 2 == 1) answer += code[idx]
            }
            idx++
        }
        if(answer.equals("")) answer="EMPTY"
    
        return answer 
    }
}