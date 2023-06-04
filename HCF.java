import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        System.out.print("Enter the numbers :");
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        int smaller,hcf=0,i;
        if(a>b){
            smaller=b;
        }
        else{
            smaller=a;
        }
        for(i=1;i<=smaller;i++){
            if((a%i==0)&&(b%i==0)){
                hcf=i;
            }
        }
        System.out.print("Hcf of "+a+" and "+b+" is "+hcf);
    }
}
