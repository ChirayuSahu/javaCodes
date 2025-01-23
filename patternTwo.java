import java.util.*;

class newCode{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int r = sc.nextInt();

        /*
         
             1 
           2 3 2
         3 4 5 4 3
       4 5 6 7 6 5 4

         */

        for(int i=0; i<=r; i++){
            for(int j=0; j<=r-i;j++){
                System.out.print(" ");
            }

            for(int j=i;j<=2*i-1;j++){
                System.out.print(j);
            }

            for(int j=2*i-2;j>=i;j--){
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}
