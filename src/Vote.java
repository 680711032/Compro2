import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int arr[]= new int[101];
    
        for(int i=0;i<k;i+=1){
            int vote =sc.nextInt();
            arr[vote]++;
        }
        
        int max = 0;
        int candidate = 0;
        for(int i=1;i<=n;i+=1){
            if(arr[i]>max){
                max=arr[i];
                candidate=i;
            }
        }
        System.out.println(candidate);
        System.out.println(max);     
    }
}
