package BinarySearch.Day02;

public class PeakIndexMountainArray {

    public static int solution(int []a){
        int len=a.length;
        int s=0,e=len-1;

        while (s<=e){
            int mid = s+(e-s)/2;

            if(a[mid-1]<a[mid] && a[mid]>a[mid+1]) return mid;
            if(a[mid-1]<a[mid] && a[mid]<a[mid+1]) s=mid+1;
            else e=mid-1;
        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{0,1,0}));
        System.out.println(solution(new int[]{0,2,1,0}));
        System.out.println(solution(new int[]{0,10,5,2}));
    }
}
