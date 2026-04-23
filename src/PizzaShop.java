import java.util.Scanner;

public class PizzaShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int[]arr1 = new int[N];
        int[]arr2 = new int[4];
    
        for(int i=0 ;i<N;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0 ;i<3;i++){
            arr2[i]=sc.nextInt();
        }

        int count1=0; // go to arr1
        int count2=0;
        boolean hasnext=true;

        while (hasnext) {
            int L=arr2[count2%3]; //4
            
            int sum=0;

            for(int i=0;i<L;i+=1){
                sum+=arr1[count1];
                count1++;
            
            if(count1>=N){
                hasnext=false;
                break;
            }

        }
        System.out.print(sum+" ");
        count2++;

    }
}
}