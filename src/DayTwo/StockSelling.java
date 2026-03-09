package DayTwo;

public class StockSelling {
    public static int solution(int []a){

        int min=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i:a){
            if(maxProfit<i-min){
                maxProfit=Math.max(maxProfit,i-min);
            }
            if(i<min) min=i;

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{7,1,5,3,6,4}));
    }
}
