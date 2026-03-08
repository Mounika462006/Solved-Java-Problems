import java.util.Scanner;

public class for16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int passcount =0;
        int failCount =0;
        int sum =0;
        int maxMark =0;

        for(int i=1;i<=n;i++){
            String studname = sc.next();
            int corAns = sc.nextInt();
            int wrongAns = sc.nextInt();
            int unattemp = sc.nextInt();

            System.out.println("Student: " + studname);
            System.out.println("Correct: " + corAns);
            System.out.println("Wrong: " + wrongAns);
            System.out.println("Unattempeted: " + unattemp);

            int score = (corAns * 4 ) - (wrongAns * 3 ) + ( unattemp * 0);
            System.out.println("Score: " + score);
            
            sum= sum+score;

            String res = " ";

            if(score >= 32){
                System.out.println("Result: Pass");
                passcount++;
            }
            else{
                System.out.println("Result: Fail");
                failCount++;
            }

            if(maxMark < score){
                maxMark = score;
            }
            System.out.println();
        }

        System.out.println("Total Students: "+ n);
        System.out.println("Pass Count: " + passcount);
        System.out.println("Fail Count: " + failCount);
        double avrg = sum /n;
        System.out.println("Class Average: "+ avrg);
        System.out.println("Highest Score: " + maxMark);

    }
}
