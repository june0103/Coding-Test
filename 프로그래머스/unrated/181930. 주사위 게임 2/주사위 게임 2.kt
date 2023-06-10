class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = 0
        val aa = a*a
        val bb = b*b
        val cc = c*c
        val aaa = aa * a
        val bbb = bb * b
        val ccc = cc * c
        if(a == b && a == c && b == c){
            answer = (a + b + c) * (aa + bb + cc) * (aaa + bbb + ccc)
        }
        else if(a != b && a != c && b != c){
            answer = a + b + c
        } else{
            answer = (a + b + c) * (aa + bb + cc)
        }
    
        return answer
    }
}