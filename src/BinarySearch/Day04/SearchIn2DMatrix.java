package BinarySearch.Day04;

public class SearchIn2DMatrix {
    public static boolean solution(int [][]a,int target){

        int rowLen=a.length;
        int colLen=a[0].length;
        for(int i=0;i<rowLen;i++){
            if(a[i][0]<=target && a[i][colLen-1]>=target){

                int s=0,e=a[0].length-1;
                while (s<=e){
                    int mid=s+(e-s)/2;
                    if(a[i][mid]==target) return true;
                    if(a[i][mid]<target) s=mid+1;
                    else e=mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,3}},3));
        System.out.println(solution(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},3));
        System.out.println(solution(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},13));
    }
}
