//runtime: 0ms

class Solution {
    public int lengthOfLastWord(String s) {
        
        int i;
        int count = 0;
        
        /*
        for loop that starts at the end of the
        string and checks whether or not the character
        at the specified index is a space.
        
        if the character is not a space, we add one
        to the count variable, which tells us how many
        letters are in the last word of the string.
        */
        
        for(i = s.length()-1; i >= 0; --i) {
            if(s.charAt(i) != ' '){
                count+=1;
            }
            
            /*
            if the character at the specified index is a space
            but the count is zero, it continues because the last
            word has not been ran through by the loop yet.
            */
            else if ((s.charAt(i) == ' ') && (count == 0)) {
                continue;

            }
            
            else{
                break;
            }
        }
        
        return count;
        
        
    }
}
