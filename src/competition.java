import java.util.Scanner;
public class competition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int team1[]= new int[n];
        int team2[]= new int[n];

        for(int i=0;i<n;i+=1){
            team1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i+=1){
            team2[i]=sc.nextInt();   
        }
        int sum1=0;
        int sum2=0;

        for(int i=0;i<n;i+=1){
        if(team1[i]>team2[i]){
            sum1+=2;
        }else if(team2[i]>team1[i]){
            sum2+=2;
        }else if(team1[i]==team2[i]){
            sum1+=1;
            sum2+=1;
        }
    }
    if(sum1>sum2){
    System.out.println("Team 1 wins");
    System.out.println("Score "+sum1+" to "+sum2);
    }
    if(sum2>sum1){
    System.out.println("Team 2 wins");
    System.out.println("Score "+sum2+" to "+sum1);
    }
    if(sum1==sum2){
    System.out.println("Draw game");
    System.out.println("Score "+sum1+" to "+sum2);
    }



sc.close();
    }
}
