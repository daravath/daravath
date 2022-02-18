public class Missing {
    int n=108;
    int[] arr=new int
            [String.valueOf(n).length];
    // By Rama

    i=0;
    while(n!=0){
        arr[i]=(n%10);
        n=n/10;
        i++;}
    for (int i =arr[arr.length-1]; i <=arr[0]; i++) {
        Boolean found=false;
        for (int a :arr) {
            if (i == a) {
                found = true;
                break;
            }
        }
        if(!found) System.out.print(i);
    }
}
