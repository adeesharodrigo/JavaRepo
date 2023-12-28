public class SecondProblem {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int next=0;
        int total=0;
        while(next < 4000000){
            next=first+second;
            if (next%2==0){
                total=total+next;
            }
            first=second;
            second=next;
        }
        System.out.println(total);
    }
}


