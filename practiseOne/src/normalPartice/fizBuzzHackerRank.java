package normalPartice;

public class fizBuzzHackerRank {
    public static void main(String[] args) {
        int n = 15;
        fizzBuzz(n);
        int p = 6;
        int a = addfun(p);
        System.out.println("a:  " +a );
    }

    private static int addfun(int p) {
        if(p<=0)
            return 0;
        if (p==1)
            return 2;
        return addfun(p-1) + addfun(p-2);
    }

    private static void fizzBuzz(int n) {
        for(int i = 1; i<=n ; i++){
            if(i%3 == 0 || i%5==0){
                if(i%3 == 0 && i%5==0){
                    System.out.println("FizzBuzz");
                    continue;
                }
                if(i%3 == 0){
                    System.out.println("Fizz");
                    continue;
                }
                if( i%5==0){
                    System.out.println("Buzz");
                }
            }
            else{
                System.out.println(i);
            }
        }
    }
}
