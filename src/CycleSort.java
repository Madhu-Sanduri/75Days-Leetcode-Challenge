public class CycleSort {

    public static int solution(int []a){
        int len=a.length;
        int [] map =new int[(int) Math.pow(10,5)+1];

        for(int i:a){
            map[i]++;
        }
        int idx=0;
        for(int i=0;i<map.length;i++){

            while (map[i]>0){
                a[idx]=i;
                map[i]--;
                idx++;
            }
        }

        int max=Integer.MIN_VALUE;

        for(int i=0;i<len/2;i++){
            max=Math.max(max, a[i]+a[len-i-1]);
        }

        return max;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{199,87,44,2,66,85,6,7,8,8,8,10,11,111,1009}));
    }
}
