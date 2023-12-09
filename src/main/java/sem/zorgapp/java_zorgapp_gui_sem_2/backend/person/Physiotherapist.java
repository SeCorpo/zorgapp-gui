package sem.zorgapp.java_zorgapp_gui_sem_2.backend.person;

import sem.zorgapp.java_zorgapp_gui_sem_2.backend.Consult;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class Physiotherapist extends User {

    private Consult consult;
    private final ArrayList<Consult> consultList = new ArrayList<>();

    @Override
    public ArrayList<Consult> getConsultList() {
        return consultList;
    }

    public Physiotherapist(String username, String password, String title, String firstName, String surname, LocalDate birthday) {
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

    //CONSULTS
    {
        consultList.add(new Consult("Physiotherapist", "Default", "Standaard behandeling", 17.50f));
        consultList.add(new Consult("Physiotherapist", "Short", "Tapen en bandageren", 25.00f));
        consultList.add(new Consult("Physiotherapist", "Short", "Mobilisatie", 25.00f));
        consultList.add(new Consult("Physiotherapist", "Short", "Massage", 25.00f));
        consultList.add(new Consult("Physiotherapist", "Extended", "Manuele therapie", 50.00f));
        consultList.add(new Consult("Physiotherapist", "Extended", "Dry needling", 50.00f));
        consultList.add(new Consult("Physiotherapist", "Facilities", "Gebruik van oefenbad", 5.00f));
    }
}