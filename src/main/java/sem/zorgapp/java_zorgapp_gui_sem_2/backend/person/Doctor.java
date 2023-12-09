package sem.zorgapp.java_zorgapp_gui_sem_2.backend.person;

import sem.zorgapp.java_zorgapp_gui_sem_2.backend.Consult;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor extends User {

    private Consult consult;
    private final ArrayList<Consult> consultList = new ArrayList<>();

    @Override
    public ArrayList<Consult> getConsultList() {
        return consultList;
    }

    public Doctor(String username, String password, String title, String firstName, String surname, LocalDate birthday) {
        super(username, password, title, firstName, surname, birthday);
    }

    //ADMINISTRATION

    @Override
    public String patientInfoPerson() {
        return  "--------------------------------------------------\n" +
                patientInfoPatientNumber() +
                patientInfoFullName() +
                patientInfoAge() +
                patientInfoBMI() +
                "--------------------------------------------------\n";
    }

    //CONSULTS
    {
        consultList.add(new Consult("Doctor", "Default", "Consult", 21.50f));
        consultList.add(new Consult("Doctor", "Extended", "Huisbezoek", 43.00f));
        consultList.add(new Consult("Doctor", "Extended", "Gezondheidsonderzoek", 43.00f));
    }
}