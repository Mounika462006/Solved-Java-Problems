import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = " ";
        String  status = " ";
        double avrg =0.0;
        int high =0;
        int count =0;
        int decree =0;
        for(int i=1;i<= n;i++){
            String studName = sc.next();
            int score = sc.nextInt();

            System.out.println("Student: "+studName);
            System.out.println("Score: " + score);

            if(score >=85 && score<=100){
                str = " A";
                status= "Pass";
            }
            else if(score>=70 && score<=84){
                str ="B";
                status ="Pass";
            }
            else if(score>=60 && score<=69){
                str = "C";
                status ="Pass";
            }
            else if(score>=50 && score<=59){
                str ="D";
                status ="Fail";
            }
            else{
                str ="F";
                status = "Fail";
            }
            avrg = avrg+ score;
            if(high<score){
                high = score;
            }
            System.out.println("Letter Grade: " + str);
            System.out.println("Status: " + status);
            
            if(status.equalsIgnoreCase("Pass")){
                count++;
            }else{
                decree++;
            }

        }
        System.out.println("Total Students: " + n);
        System.out.printf("Class Average: %.1f\n",avrg/n);
        System.out.println("Highest Score: " + high);
        System.out.println("Students Passed: " + count);
        System.out.println("Students Failed: " + decree);

    }
}
