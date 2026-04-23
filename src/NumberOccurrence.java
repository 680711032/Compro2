import java.util.Scanner;

public class NumberOccurrence {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];

        for(int i =0;i<n;i+=1){
            arr[i]= sc.nextInt();
        }

        int found = sc.nextInt();
        int count =0;
        for(int i =0;i<n;i+=1){
            if(arr[i]==found){
                System.out.print((i+1)+" ");
                count++;
            }
        }
        if(count==0){
            System.out.println("0");    
        }
    }    
}