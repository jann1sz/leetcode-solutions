class Solution {
    public String defangIPaddr(String address) {
        
        int i;
        String defangedIp = "";
        
      /*
      the following loop checks for a period within the address string.
      if the character at the specified index is a period, we append
      the defang string "[.]" to the defangedIp string.
      
      */
      
        for(i = 0; i < address.length(); ++i) {
            char ch = address.charAt(i);
            if (ch == '.') {
                String defang = "[.]";
                defangedIp += defang;
            }
          
          /*
          if the character at the specified index is not a period, we
          append the character to the defangedIp string.
          */
            
            else{
                defangedIp += ch;
            }
        }
        
        return defangedIp;
        
    }
}
