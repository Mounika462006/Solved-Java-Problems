import java.util.Scanner;

public class operator1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int theory = sc.nextInt();
        int pratical = sc.nextInt();
        int avrg = (theory+pratical)/2;
        if(theory>=50 && pratical >=50){
            if(avrg>=60){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }
        }
    }
}
