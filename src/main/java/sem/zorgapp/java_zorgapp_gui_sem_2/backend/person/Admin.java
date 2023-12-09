package sem.zorgapp.java_zorgapp_gui_sem_2.backend.person;

import sem.zorgapp.java_zorgapp_gui_sem_2.backend.Consult;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.User;

import java.time.LocalDate;

public class Admin extends User {

    private Consult consult;

    public Admin(String username, String password, String title, String firstName, String surname, LocalDate birthday) {
        super(username, password, title, firstName, surname, birthday);
    }


    //ADMINISTRATION

    @Override
    public String patientInfoPerson() {
        return "--------------------------------------------------\n" +
                patientInfoPatientNumber() +
                patientInfoFullName() +
                patientInfoAge() +
                patientInfoBMI() +
                "--------------------------------------------------\n";
    }
    @Override
    public String currentPatient_MedNotes() {

        return  "--------------------------------------------------\n" +
                "Current User cannot get information on current Patient\n" +
                "--------------------------------------------------\n";
    }

}
