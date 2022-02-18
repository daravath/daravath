public class number {
    public static void main(String[] args){
            int sum=0;
            int count = 1;
            for(int i=1; i<=1000;i++){
                // logic
                if(i%3==0 && i%8==0) {
                    System.out.println(i);
                    sum=sum+i;
                    count++;
                    if(count == 10) break;
                }
            }
            System.out.println(sum);



    }

}
