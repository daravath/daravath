public class helloworld {

        static int count = 0;

        helloworld() {
            count++;
        }

        public static void main(String[] args) {
            helloworld cob = new  helloworld();
            System.out.println(cob.count);

            helloworld cob1 = new  helloworld();
            System.out.println(cob1.count);
        }
}
