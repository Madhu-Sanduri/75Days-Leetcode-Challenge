import java.util.Arrays;

public class Day10LeetCodeChallenge {
//    static int matchedCaseSum=0;

    public static int solution(String a,String b){

        long totalASCII=0;

        for(int i=0;i<a.length();i++){
            totalASCII+= a.charAt(i);
        }
        for(int i=0;i<b.length();i++){
            totalASCII+= b.charAt(i);
        }
        int len1=a.length();
        int len2=b.length();
        int [][]dp =new int[len1+1][len2+1];

        for(int []i:dp) Arrays.fill(i,-1);


        return (int) totalASCII-2*dpWay(a,b,len1-1,len2-1,dp);
    }


    static int dpWay(String a,String b, int idx1,int idx2,int [][]dp){
        if(idx1<0 || idx2<0) return 0;

        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];

        int take=0;

        if(a.charAt(idx1)==b.charAt(idx2)){
            take= a.charAt(idx1)+dpWay(a,b,idx1-1,idx2-1,dp);
        }

        int notTake= Math.max(dpWay(a,b,idx1-1,idx2,dp),dpWay(a,b,idx1,idx2-1,dp));

        dp[idx1][idx2]=Math.max(take,notTake);

        return dp[idx1][idx2]=Math.max(take,notTake);

    }


    public static void main(String[] args) {
        System.out.println(solution("sea","eat"));
        System.out.println(solution("delete","leet"));
    }
}
