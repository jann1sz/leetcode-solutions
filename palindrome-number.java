class Solution {
    public boolean isPalindrome(int x) {
        
        //orNum is the original number x converted to a string
        String orNum = Integer.toString(x);
        
        /*
        two arrays are created containing the length of number x,
        originalNum holds the integer x in normal order, while
        reversedNum holds the integer x in reverse order.
        */
        
        char [] originalNum =  new char [orNum.length()];
        char [] reversedNum = new char [orNum.length()];
        
        int i;
        int j;
        int start = 0;
        
        /*
        the contents within the originalNum array are
        replaced with the integer x in its normal order.
        */
        
        for (i = 0; i < orNum.length(); ++i) {
            originalNum[i] = orNum.charAt(i);
        }
        
        /*
        the contents within the reversedNum array are
        replaced with the integer x in backwards order.
        */
        
        for (j = orNum.length()-1; j >=0; --j) {
            reversedNum[j] = orNum.charAt(start);
            ++start;
        }
        
        /*
        the contents within the originalNum and reversedNum
        arrays are compared with each other.
        
        if one of the contents from one array does not match
        the contents from the other array, then we return false.
        otherwise, we return true.
        */
        
        for(i = 0; i < orNum.length(); ++i) {
            if (reversedNum[i] != originalNum[i]) {
                return false;
            }
            
        }
        return true;
    }
}
