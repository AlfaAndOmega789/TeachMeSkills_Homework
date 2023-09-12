package all_homework.homework_8.task_1;

public class Therapist {
    Surgeon surgeon = new Surgeon();
    Dentist dentist = new Dentist();
    public static void treat(){
        System.out.println("Therapist treat!");
    }

    public void appointDoctorAccordingToTheTreatmentPlan(int a){
        while(true) {
            if(a == 1) {
                System.out.println("The patient has been assigned a surgeon");
                surgeon.treat();
                break;
            }else if(a == 2) {
                System.out.println("The patient has been assigned a dentist");
                dentist.treat();
                break;
            }else {
                System.out.println("The patient has been assigned a therapist");
                Therapist.treat();
                break;
            }
        }
    }
}
