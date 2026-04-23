import java.util.Scanner;

public class SlotRsv {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();

        int[]arr1 =new int[N+1];
        int[]arr2 =new int[N+1];

        for(int i=0;i<P;i+=1){
            int idk = sc.nextInt();
        
        if(arr1[idk]<K){
            arr1[idk]++;
            System.out.println(1);
        }else{
            arr2[idk]++;
            System.out.println(2);
        }
    }
    for(int i=1;i<arr1.length;i++){
        System.out.print(arr1[i]+" ");
    }
    System.out.println();
    for(int i=1;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
    }
    }
}
