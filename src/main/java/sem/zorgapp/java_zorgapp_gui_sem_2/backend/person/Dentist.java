package sem.zorgapp.java_zorgapp_gui_sem_2.backend.person;

import sem.zorgapp.java_zorgapp_gui_sem_2.backend.Consult;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dentist extends User {

    private Consult consult;
    private final ArrayList<Consult> consultList = new ArrayList<>();

    @Override
    public ArrayList<Consult> getConsultList() {
        return consultList;
    }

    public Dentist(String username, String password, String title, String firstName, String surname, LocalDate birthday) {
        super(username, password, title, firstName, surname, birthday);
    }

    //ADMINISTRATION

    @Override
    public String patientInfoPerson() {
        return "--------------------------------------------------\n" +
                patientInfoPatientNumber() +
                patientInfoFullName() +
                patientInfoAge() +
                "--------------------------------------------------\n";
    }

    //CONSULTS
    {
        consultList.add(new Consult("Dentist", "Default", "Routine controle", 20.00f));
        consultList.add(new Consult("Dentist", "Simple", "Extractie", 30.00f));
        consultList.add(new Consult("Dentist","Simple", "Flouridebehandeling", 30.00f));
        consultList.add(new Consult("Dentist", "Complex", "Wortelkanaalbehandeling", 55.00f));
        consultList.add(new Consult("Dentist", "Complex", "Implantaat", 55.00f));
    }
}