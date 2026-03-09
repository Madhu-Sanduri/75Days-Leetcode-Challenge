package DayOne;

public class SecondLargestElement {


    public static int solution(int []a){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){

            if(max<a[i]) {
                secondMax=max;
                max=a[i];
            }

            else if(secondMax<a[i] && max>a[i]){
                secondMax=a[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{9,8,7,6,5,4,3,2,1}));
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(solution(new int[]{381,672,917,110,4,111,518}));
    }
}

/*
* Time Complexity: O(n) -> We're iterating throughout array
* Space Complexity: O(1) -> Just taking two variables to store
* */