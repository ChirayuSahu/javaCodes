import java.util.Scanner;

public class newCode {
    public static void main(String[] args) {

        /*
           1
          212
         32123
        4321234
         32123
          212
           1
        */
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();

        // upper half
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            
            System.out.println();
        }

        //lower half
        for(int i=r-1;i>=1;i--){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            
            System.out.println();
        }
        sc.close();
    }

}
