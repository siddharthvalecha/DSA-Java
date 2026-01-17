



/**
 *
 * @author Siddharth Valecha
 */
public class RichestWealth {

    public static void main(String[] args) {
        RichestWealth rw=new RichestWealth();
        System.out.println(rw.maximumWealth(new int[][]{{1,5},{7,3},{3,5}}));
                
    }
     public int maximumWealth(int[][] accounts) {
        int wealth=0;
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
               wealth=wealth+accounts[i][j];
            }
            if(wealth>maxWealth)
            {
               maxWealth=wealth;
            }
            wealth=0;
        }
//        for(int[] person:accounts)
//        {
//            int wealth=0;
//            for(int money:person)
//            {
//                wealth+=money;
//            }
//            if(maxWealth<wealth)
//            {
//                maxWealth=wealth;
//            }
//        }
        return maxWealth;
    }
}
