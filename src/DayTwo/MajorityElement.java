package DayTwo;

//Moore's Voting Algo
public class MajorityElement {

    public static int solution(int []a){
        int result=0;
        int count=0;

        for(int i=0;i<a.length;i++){
            if(count==0){
                result=i;
            }

            if(a[i]==a[result]){
                count++;
            }

            else count--;
        }
        return a[result];
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,2,3}));
        System.out.println(solution(new int[]{2,2,1,1,1,2,2}));
    }
}
