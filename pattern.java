import java.util.Scanner;
import java.util.*;

public class pattern {

    public static void main(String args[] ){

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        int col = sc1.nextInt();

        for(int i=0 ; i<row ; i++){
            for(int j=0 ;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }  

    }
    
}