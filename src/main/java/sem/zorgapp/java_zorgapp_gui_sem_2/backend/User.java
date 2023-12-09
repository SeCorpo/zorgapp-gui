package sem.zorgapp.java_zorgapp_gui_sem_2.backend;

import javafx.scene.control.Alert;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.person.Patient;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.person.Person;

import java.time.LocalDate;
import java.util.ArrayList;

public class User extends Person {
    private String title;
    private String username;
    private String password;
    private final ArrayList<Consult> consultList = new ArrayList<>();
    public ArrayList<Consult> getConsultList() {
        return consultList;
    }

    public User(String username, String password, String title, String firstName, String surname, LocalDate birthday) {
        super(firstName, surname, birthday);
        this.title = title;
        this.username = username;
        this.password = password;
    }
    public String getTitle() {
        return title;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    //PATIENTS
    Patient currentPatient;
    public Patient getCurrentPatient() {
        if(currentPatient == null) {
            alertSelectAPatientFirst();
        } return currentPatient;
    }
    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }


    //MEDICATION
    Medication selectedMedication;
    public Medication getSelectedMedication() {
        if(selectedMedication == null) {
            //alertSelectAMedicationFirst();
        } return selectedMedication;
    }
    public void setSelectedMedication(Medication selectedMedication) {
        this.selectedMedication = selectedMedication;
    }

    //CONSULT
    Consult selectedConsult;
    public Consult getSelectedConsult() {
        if(selectedConsult == null) {
            alertSelectAConsultFirst();
        } return selectedConsult;
    }
    public void setSelectedConsult(Consult selectedConsult) {
        this.selectedConsult = selectedConsult;
    }

    @Override
    public String getFullName() {
        return String.format("%s %s %s", getTitle(), getFirstName(), getSurname());
    }




    //ADMINISTRATION
    public boolean showPatientList = true;
    public boolean showMedicationList = true;
    public boolean showConsultList = true;

    //PATIENT INFO SETUP
    public String patientInfoPerson() {

        return  "--------------------------------------------------\n" +
                "Current User cannot get information on current Patient\n" +
                "--------------------------------------------------\n";

    }
    protected String patientInfoPatientNumber() {
        return "P-number: [" + getCurrentPatient().getPatientNumber().toString() + "]\n";
    }
    protected String patientInfoFullName() {
        return "Patient: " + getCurrentPatient().getFullName() + "\n";
    }
    protected String patientInfoAge() {
        return "Age: " + getCurrentPatient().calculateAge() + " (" + getCurrentPatient().getBirthday().toString() + ") \n";
    }
    protected String patientInfoBMI() {
        return "BodyMassIndex: " + String.format("%.2f", getCurrentPatient().calculateBmi()) + "\n" +
                "Length: " + String.format("%.2f", getCurrentPatient().getLength()) + " m" + "\n" +
                "Weight: " + String.format("%.2f", getCurrentPatient().getWeight()) + " kg" + "\n";
    }
    public String currentPatient_Notes() {
        StringBuilder noteCurrentPatient = new StringBuilder();

        noteCurrentPatient.append("--------------------------------------------------\n");
        if(getCurrentPatient().getNotesList().isEmpty()) {
            noteCurrentPatient.append(" Selected patient has no notes\n");
        }
        else {
            for (int i = 0; i < getCurrentPatient().getNotesList().size(); i++) {
                noteCurrentPatient.append("[" + getCurrentPatient().getNotesList().get(i).getNoteDate() + "] ").
                        append(getCurrentPatient().getNotesList().get(i).getNote() + "\n");
            }
        }
        return noteCurrentPatient.toString();
    }
    public String currentPatient_MedNotes() {
        StringBuilder medNotesCurrentPatient = new StringBuilder();

        medNotesCurrentPatient.append("--------------------------------------------------\n");
        if(getCurrentPatient().getMedNotesList().isEmpty()) {
            medNotesCurrentPatient.append(" Selected patient has never been prescribed medication\n");
        }
        else {
            for(int i = 0; i <getCurrentPatient().getMedNotesList().size(); i++) {
                medNotesCurrentPatient.append("Medication ").
                        append(getCurrentPatient().getMedNotesList().get(i).getMedication().getName()).
                        append("(").append(getCurrentPatient().getMedNotesList().get(i).getMedication().getStDose()).
                        append(") [").append(getCurrentPatient().getMedNotesList().get(i).getNoteDate().toString()).append("]\n").
                        append(getCurrentPatient().getMedNotesList().get(i).getNote()).append("\n").
                        append("--------------------------------------------------\n");
            }
        }

        return medNotesCurrentPatient.toString();
    }
    public String currentPatient_ConsultNotes() {
        StringBuilder consultNotesCurrentPatient = new StringBuilder();

        consultNotesCurrentPatient.append("--------------------------------------------------\n");
        if(getCurrentPatient().getConsultNotesList().isEmpty()) {
            consultNotesCurrentPatient.append(" Selected patient has never had a consult\n");
        }
        else {
            for(int i = 0; i < getCurrentPatient().getConsultNotesList().size(); i++) {
                consultNotesCurrentPatient.append("Specialty: ").
                        append(getCurrentPatient().getConsultNotesList().get(i).getConsult().getSpecialty() + "\n").
                        append("Category: ").append(getCurrentPatient().getConsultNotesList().get(i).getConsult().getCategory() + "\n").
                        append("Tariff: ").append(String.format("%.2f", getCurrentPatient().getConsultNotesList().get(i).getConsult().getTariff()) + "\n").
                        append("Type: ").append(getCurrentPatient().getConsultNotesList().get(i).getConsult().getType() + "\n");

                consultNotesCurrentPatient.append("--------------------------------------------------\n").
                        append("[").append(getCurrentPatient().getConsultNotesList().get(i).getNoteDate()).append("] ").
                        append(getCurrentPatient().getConsultNotesList().get(i).getNote() + "\n" + "\n");
            }
        }

        return consultNotesCurrentPatient.toString();
    }
    //ALERTS
    public void alertSelectAPatientFirst() {
        Alert currentPatientNull = new Alert(Alert.AlertType.WARNING);
        currentPatientNull.setTitle("Select a patient");
        currentPatientNull.setContentText("Select a patient");
        currentPatientNull.show();
    }
    public void alertSelectAMedicationFirst() {
        Alert selectedMedicationNull = new Alert(Alert.AlertType.WARNING);
        selectedMedicationNull.setTitle("Select a medication");
        selectedMedicationNull.setContentText("Select a medication");
        selectedMedicationNull.show();
    }
    public void alertSelectAConsultFirst() {
        Alert selectedConsultNull = new Alert(Alert.AlertType.WARNING);
        selectedConsultNull.setTitle("Select a consult");
        selectedConsultNull.setContentText("Select a consult");
        selectedConsultNull.show();
    }
}
