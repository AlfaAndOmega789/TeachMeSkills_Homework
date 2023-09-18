package all_homework.homework_8.task_1;



public class Therapist extends Doctor {


    public static void main(String[] args) {
        Patient patient = new Patient();
        Therapist therapist = new Therapist();
        therapist.appointDoctorAccordingToTheTreatmentPlan(patient.getTreatmentPlan());


    }
    @Override
    public  void treat(){
        System.out.println("Therapist treat!");
    }

    public void appointDoctorAccordingToTheTreatmentPlan(int a){
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();
        Therapist therapist = new Therapist();

            if(a == 1) {
                System.out.println("The patient has been assigned a surgeon");
                surgeon.treat();
            }else if(a == 2) {
                System.out.println("The patient has been assigned a dentist");
                dentist.treat();
            }else {
                System.out.println("The patient has been assigned a therapist");
                therapist.treat();
            }
        }
    }

