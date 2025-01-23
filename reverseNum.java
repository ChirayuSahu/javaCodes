import java.util.*;

class newCode{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int c = 0;
        int revnum = 0;

        int num2=num;

        while(num2!=0){
            num2 = num2 / 10;
            c++;
        }

        for(int i=0;i<c;i++){
            revnum+=(num%10)*Math.pow(10,c-i-1);
            num/=10;
        }

        System.out.println(c);
        System.out.println(revnum);

        sc.close();
    }
}
