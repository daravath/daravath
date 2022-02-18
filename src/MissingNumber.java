public class MissingNumber {
    public static void main(String[] args){
        String str= "108";
        String[] string = str.split("");
        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.valueOf(string[i]);
        }
        for (int i =arr[0]; i <arr[arr.length-1]; i++) {
            Boolean found=false;
            for (int n :arr) {
                if (i == n) {
                    found = true;
                    break;
                }
            }
            if(!found) System.out.print(i);
        }
    }
}
