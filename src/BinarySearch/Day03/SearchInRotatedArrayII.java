package BinarySearch.Day03;

public class SearchInRotatedArrayII {

    public static boolean solution(int []a,int target){

        int len=a.length;
        int s=0,e=len-1;

        while (s<e){
            int mid= s+(e-s)/2;
            if(a[mid]==target) return true;

            if(a[s]<=a[mid]){

                if(a[s]<=target && a[mid]>target) e =mid-1;
                else s=mid+1;
            }
            else if(a[e]>=target){
                if(a[e]>target && a[mid]<=target) s=mid+1;
                else e=mid-1;
            }
            else{
                s++;
                e--;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,5,6,0,0,1,2},3));
        System.out.println(solution(new int[]{2,5,6,0,0,1,2},0));
    }
}
