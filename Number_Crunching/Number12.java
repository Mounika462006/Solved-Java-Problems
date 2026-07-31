import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
        
        while(n>0){
            long temp = n%10;
            
            if(temp ==0){
                zero++;
            }
            else if(temp ==1){
                one++;
            }
            else if(temp ==2){
                two++;
            }
            else if(temp ==3){
                three++;
            }
            else if(temp ==4){
                four++;
            }
            else if(temp ==5){
                five++;
            }
            else if(temp ==6){
                six++;
            }
            else if(temp ==7){
                seven++;
            }
            else if(temp ==8){
                eight++;
            }
            else if(temp ==9){
                nine++;
            }
            n=n/10;
            
        }
        System.out.println("0 : " + zero);
        System.out.println("1 : " + one);
         System.out.println("2 : " + two);
         System.out.println("3 : " + three);
         System.out.println("4 : " + four); 
         System.out.println("5 : " + five);
         System.out.println("6 : " + six);
         System.out.println("7 : " + seven);
         System.out.println("8 : " + eight);
         System.out.println("9 : " + nine);
      
         
    }
}
