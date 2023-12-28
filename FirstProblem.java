public class FirstProblem {
    public static void main(String[] args) {
        int sum=0;
        int num=1000;
        for (int i=0;i<num;i++){
            if ((i%3)==0||(i%5)==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
