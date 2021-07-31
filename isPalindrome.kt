class Palindrome {
    fun isPalindrome(s: String): Boolean {
        val re = Regex("[^A-Za-z0-9]")
        val alphanumber  = re.replace(s, "").toCharArray()
        println(alphanumber)
        val size = alphanumber.size - 1
        if(alphanumber.size <= 1) return true
        else if(alphanumber.size >= 2 && alphanumber.size < 200000) {
        for(i in 0..(alphanumber.size/2)) {
            if(alphanumber[i].equals(alphanumber[size - i], true).not()) {
                return false
            }
        }} else {
            return false
        }
        return true
    }
}