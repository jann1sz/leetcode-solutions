/* arranging coins to build a staircase but only return the
*  number of rows that can fulfill a staircase, so incomplete
*  staircases do not count towards the number of rows.
*/

class Solution {
    public int arrangeCoins(int n) {
                int coinsTotal = n;
        int total = 0;
        int rows = 0;
        int i = 0;
        
        while(coinsTotal > 0){
            ++i;
            total+=i;
            coinsTotal-=i;
            if(coinsTotal < 0){
                break;
            }
            
            rows+=1;
        }
        
        return rows;
        
    }
}
