import java.util.Scanner;

public class for14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double dayFine =0;
        double maxfine =0;
        int overdue =0;
        double totalFines = 0;

        for(int i=1;i<=n;i++){
            String bookType = sc.next();
            int daysLate = sc.nextInt();

            System.out.println("Book " + i + " : " + bookType);
            System.out.println("Days Late: " + daysLate);

            if(bookType.equalsIgnoreCase("Regular")){
                dayFine = 0.50;
                maxfine = 10;
            }
            else if(bookType.equalsIgnoreCase("Reference")){
                dayFine = 1.00;
                maxfine = 20;
            }
            else if(bookType.equalsIgnoreCase("Magazine")){
                dayFine = 0.25;
                maxfine = 5;
            }
            System.out.println("Daily Fine:$ " + dayFine);
            double cal = daysLate * dayFine;
            double actual = cal;
            String cap = "NO";

            if(cal>maxfine){
                actual = maxfine;
                cap = "Yes";
            }
            if(daysLate>0){
                overdue++;
            }
            totalFines = totalFines + actual;

            System.out.println("Calculated Fine:$ "+ cal);
            System.out.println("Actual Fine: $" + actual);
            System.out.println("Cap Applied: " + cap);
            System.out.println();
        }

        double avrg = totalFines /n;
        System.out.println("Total Books: " + n);
        System.out.println("Total Fines Collected: $" + totalFines);
        System.out.println("Books Overdue: " + overdue);
        System.out.printf("Average Fine:$ %.2f\n",avrg );
    }
}
