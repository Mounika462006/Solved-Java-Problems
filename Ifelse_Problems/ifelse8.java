import java.util.Scanner;

public class ifelse8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String locationTier = sc.nextLine();
        int squareFootage = sc.nextInt();
        int propertyAge = sc.nextInt();
        int amenityScore = sc.nextInt();

        double base = 0.0;
        int age =0;
        double bonus = 0.0;
        String str ="";

        System.out.println("Location Tier: " +locationTier);
        System.out.println("Square Footage: " + squareFootage + " sq ft");
        System.out.println("Property Age: " + propertyAge+ " years");
        System.out.println("Amenity Score: "+ amenityScore);

        if(locationTier.equalsIgnoreCase("Prime")){
            base=400;
        }
        else if(locationTier.equalsIgnoreCase("Urban")){
            base=300;
        }
        else if(locationTier.equalsIgnoreCase("Suburban")){
            base= 180;
        }
        else if(locationTier.equalsIgnoreCase("Rural")){
            base = 100;
        }

        System.out.printf("Base Price Per Sq Ft:$%.1f\n" , base);

        if(propertyAge>=0 && propertyAge<=5){
            age=0;
        }
        else if(propertyAge<=10){
                age =-5;
        }
        else if(propertyAge<=15){
            age = -10;
        }
        else if(propertyAge<=30){
            age= -15;
        }
        else{
            age=-25;
        }

        System.out.println("Age Adjustment: "+ age + "%");

        
        double baseValue = squareFootage * base;
        double adjustValue = baseValue * (1 + age/100.0);

        if(amenityScore>=80 && amenityScore<=100){
            bonus = (baseValue* 10/100);
        }
        else if(amenityScore>=60 && amenityScore<=79){
            bonus = (baseValue * 5/100);
        }
        else if(amenityScore>=40 && amenityScore<=59){
            bonus =(baseValue * 2/100);
        }
        else{
            bonus =( baseValue  * 0/100);
        }

        double last = adjustValue + bonus;

        System.out.printf("Amenity Bonus:$%.1f\n",bonus);
        System.out.printf("Estimated Property Value: $%.1f\n",last);

        if((locationTier.equalsIgnoreCase("Prime")||(locationTier.equalsIgnoreCase("Urban") )&& propertyAge<15)){
            str ="Hot";
        }
        else if(locationTier.equalsIgnoreCase("Rural") || propertyAge>30){
            str ="Slow";
        }
        else if(locationTier.equalsIgnoreCase("Suburban")){
            str ="Stable";
        }

        System.out.println("Market Category: "+ str);
    }
}
