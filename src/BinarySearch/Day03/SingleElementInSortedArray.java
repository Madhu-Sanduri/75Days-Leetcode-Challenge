package BinarySearch.Day03;

public class SingleElementInSortedArray {

    public static int solution(int []a){
        int len=a.length;
        int s=0,e=len-1;

        while (s<e){
            int mid = s+(e-s)/2;
            if(mid%2==0 && a[mid]==a[mid+1] || ((mid %2 == 1 && a[mid] == a[mid - 1]))) s=mid+1;
            else e=mid;
        }
        return a[s];
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,3,7,7,10,10,11,12,12}));
        System.out.println(solution(new int[]{3,3,7,7,10,11,11}));
        System.out.println(solution(new int[]{1,1,2,3,3,4,4,8,8}));
        System.out.println(solution(new int[]{2,2,3,3,4,4,8,8,9}));
        System.out.println(solution(new int[]{2,3,3,4,4,8,8,9,9}));
    }
}
