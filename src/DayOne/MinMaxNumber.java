package DayOne;

//Print min,max number from arrays
public class MinMaxNumber {

    public static int solution(int []a){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i:a){
            if(max<i) max=i;
            if(min>i) min=i;
        }

        System.out.println("Minimum Number is:"+ min);
        System.out.println("Maximum Number is:"+ max);

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(solution(new int[]{-1,6,-11,-910,110,29,456}));
    }
}
