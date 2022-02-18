public class Missing {

    public static void main(String[] args) {
        int n=108;
        int[] arr=new int
                [String.valueOf(n).length()];
        // By Rama

        int j=0;
        while (n != 0) {
            arr[j]=(n%10);
            n=n/10;
            j++;
        }
        for (int i =arr[arr.length-1]; i <= arr[0]; i++) {
            boolean found=false;
            for (int a :arr) {
                if (i == a) {
                    found = true;
                    break;
                }
            }
            if(!found) System.out.print(i);
        }
    }

}
