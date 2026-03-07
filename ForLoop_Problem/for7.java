import java.util.Scanner;

public class for7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double billAmunt = 0.0;
        String category = " ";
        int sum=0;
        double add =0.0;
        for(int i=1;i<=n;i++){
            String conusumerID = sc.next();
            int unitConusumed = sc.nextInt();
            
            sum = sum+ unitConusumed;

            System.out.println("Consumer ID: " + conusumerID);
            System.out.println("Units Consumed: " + unitConusumed);

            if(unitConusumed>=0 && unitConusumed<=100){
                billAmunt = unitConusumed * 0.10;
            }
            else if(unitConusumed >=101 && unitConusumed <= 200){
                billAmunt = unitConusumed * 0.13;
            }
            else if(unitConusumed>=201 && unitConusumed<=300){
                billAmunt = unitConusumed * 0.16;
            }
            else if(unitConusumed >=301){
                billAmunt = unitConusumed * 0.20;
            }

            add = add+ billAmunt;
            System.out.printf("Bill Amount: $%.1f\n",billAmunt);

            if(unitConusumed <=200){
                category = "Low Usage";
            }
            else if(unitConusumed >=201 && unitConusumed <= 300){
                category ="Medium Usage";
            }
            else if(unitConusumed >= 301){
                category ="High Usage";
            }
            System.out.println("Category: " + category);
            System.out.println();
        }   

        System.out.println("Total Consumers: " + n);
        System.out.println("Units Consumed: " + sum);
        System.out.printf("Total Revenue: $%.1f\n",add);
        
        double avrg = add / n;
        System.out.printf("Average Bill: $%.1f\n",avrg);
    }
}
