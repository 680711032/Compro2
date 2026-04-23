import java.util.Scanner;

public class howtobreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count=0;
        
        while(true){
            int n =sc.nextInt();
            if(n!=0)    
            count++;
            else
                break;

            
            

        }
        System.out.print(count);
    }
}
