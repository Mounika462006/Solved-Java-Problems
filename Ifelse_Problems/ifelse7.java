import java.util.Scanner;

public class ifelse7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int heartRate = sc.nextInt();
        sc.nextLine();


        String bloodPressure = sc.nextLine();
        String[] bp = bloodPressure.split("/");
        int systolic = Integer.parseInt(bp[0]);
        int diastolic = Integer.parseInt(bp[1]);
        

        double temperature = sc.nextDouble();
        sc.nextLine();
        String symptomSeverity = sc.nextLine();
        String str ="";
        String action ="";
        int time =0;
        System.out.println("Heart Rate: " + heartRate+" bpm");
        System.out.println("Blood Pressure: "+bloodPressure);
        System.out.printf("Temparture: %.1f°F\n",temperature);
        System.out.println("Symptom Severity: "+symptomSeverity);


        if((heartRate<50 || heartRate > 130) || (systolic>180 || systolic<90) || (temperature>103 || temperature<96) || (symptomSeverity.equalsIgnoreCase("Life-Threatening"))){
            str = "Critical";
            time = 0;
            action ="Immediate Emergency Care";
        }
        else if(((heartRate>=50 && heartRate<=60)||(heartRate>=110 && heartRate<=130)) && ((systolic>=160 && systolic<=180)||(systolic>=90 && systolic<=100)) && (temperature>103 || temperature<96) && (symptomSeverity.equalsIgnoreCase("Severe"))){
            str = "Urgent";
            if(systolic<100 && temperature<97 && heartRate<100){
                time =20;
            }else{
                time=15;
            }
            action="Priority Medical Attention";

        }
        else if((heartRate>=60 && heartRate<=110) && (systolic>=100 && systolic<=160) && (temperature>=97 && temperature<=101) && symptomSeverity.equalsIgnoreCase("Moderate")){
            str ="Standard";
            time=45;
            action="Standard Examination";
        }
        else{
            str = "Non-Urgent";
            time =90;
            action="Routine Checkup";
        }
        System.out.println("Triage Priority: "+str);
        System.out.println("Estimated Wait Time: "+time+" minutes");
        System.out.println("Recommended Action: "+ action);

    }
}
