package DayFour;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static String solution(int []a,int []b,int m,int n){

        int len1=m-1;
        int lastIdx=a.length-1;
        int len2=b.length-1;

        while (len1>=0 && len2>=0){
            if(a[len1]<b[len2]){
                a[lastIdx--]=b[len2];
                len2--;
            }
            else{
                a[lastIdx]=a[len1];
                lastIdx--;
                len1--;
            }
        }
        return Arrays.toString(a);
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{0},new int[]{1},0,1));
        System.out.println(solution(new int[]{1,2,3,4,0,0,0},new int[]{2,5,6},4,3));
        System.out.println(solution(new int[]{1,2,3,0,0,0},new int[]{2,5,6},3,3));

        /*

        {1,2,3,4,0,0,0}
        {2,5,6}

        1,2,3,4,0,0,6
        2,5

        1,2,3,4,0,5,6
        2

        1,2,3,4,4,5,6

        1,2,3,3,4,5,6

        1,2,2,3,4,5,6

        1,2,2,3,4,5,6
        *
        * */
    }
}
