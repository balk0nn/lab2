import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Please enter a positive " +
                "integer number n less than 15");
        while (!scan.hasNextInt()) {
            System.out.println("Not an integer, " +
                    "try again");
            scan.next();
        }
        n = scan.nextInt();
            while ((n < 0) | (n > 14)){
                System.out.println("You had to enter" +
                        " a positive number less" +
                        " than 15," +
                        "try again");
                while (!scan.hasNextInt()) {
                    System.out.println("Not an integer," +
                            " try again");
                    scan.next();
                }
                n = scan.nextInt();
            }
        long F = 1;
            int i = 1;
            int k = n;
            while (i <= k){
                F*=n;
                n-=1;
                i+=1;
            }
        System.out.println(k + "! = " + F);
    }
}
