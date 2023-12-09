package sem.zorgapp.java_zorgapp_gui_sem_2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.person.Patient;
import java.time.LocalDate;

public class AdministrationController {

    public static boolean medicationTrueConsultFalse = true;

    @FXML AnchorPane anchorPaneAdministration;
    @FXML Label labelWelcomePerson;
    @FXML TextField textFieldSearch;
    @FXML Button buttonSearch;
    @FXML TableView<Patient> tableViewSearch;
    @FXML TableColumn<Patient, Integer> tableViewSearchPatientNumber;
    @FXML TableColumn<Patient, String> tableViewSearchFirstName;
    @FXML TableColumn<Patient, String> tableViewSearchSurname;
    @FXML TableColumn<Patient, LocalDate> tableViewSearchYear;
    @FXML SplitPane splitPanePatientInfo;

    //CONSOLE
    @FXML TextArea textAreaConsole;
    @FXML Button buttonFindMedication;
    @FXML Button buttonFindConsult;
    @FXML Button buttonEditPatient;
    @FXML Button buttonHelp;
    @FXML Button buttonAddNote;
    @FXML Button buttonAddMedNote;
    @FXML Button buttonAddConsult;
    @FXML Button buttonAddStarNote;
    @FXML Button buttonClear;

    //INFO
    @FXML TextArea textAreaPatientPerson;
    @FXML TextArea textAreaPatientConsult;
    @FXML TextArea textAreaPatientNotes;
    @FXML TextArea textAreaPatientMedNotes;


    public void initialize() {
        initLabelWelcomePerson();
        initTableViewSearch();
        System.out.println("AdministrationController - init done");
    }

    private void initLabelWelcomePerson() {
        labelWelcomePerson.setText("Welcome " + ZorgappGUI.getInstance().getCurrentUser().getFullName());
    }
    private void initTableViewSearch() {
        if(ZorgappGUI.getInstance().getCurrentUser().showPatientList) {

            tableViewSearch.setVisible(true);

            tableViewSearchPatientNumber.setCellValueFactory(new PropertyValueFactory<Patient, Integer>("patientNumber"));
            tableViewSearchFirstName.setCellValueFactory(new PropertyValueFactory<Patient, String>("firstName"));
            tableViewSearchSurname.setCellValueFactory(new PropertyValueFactory<Patient, String>("surname"));
            tableViewSearchYear.setCellValueFactory(new PropertyValueFactory<Patient, LocalDate>("birthday"));

            ZorgappGUI.getInstance().getPatientData().getPatientMap().forEach((key, patient) -> tableViewSearch.getItems().add(patient));
        }
    }
    private void setPatientInfoPerson() {
        textAreaPatientPerson.clear();
        textAreaPatientPerson.setText(ZorgappGUI.getInstance().getCurrentUser().patientInfoPerson());
    }
    private void setPatientInfoConsult() {
        textAreaPatientConsult.clear();
        textAreaPatientConsult.setText(ZorgappGUI.getInstance().getCurrentUser().currentPatient_ConsultNotes());

    }
    private void setPatientInfoNotes() {
        textAreaPatientNotes.clear();
        textAreaPatientNotes.setText(ZorgappGUI.getInstance().getCurrentUser().currentPatient_Notes());
    }
    private void setPatientInfoMedNotes() {
        textAreaPatientMedNotes.clear();
        textAreaPatientMedNotes.setText(ZorgappGUI.getInstance().getCurrentUser().currentPatient_MedNotes());
    }

    //ACTION EVENTS
    @FXML protected void onTableViewPatientsSearch() {
        ZorgappGUI.getInstance().getCurrentUser().setCurrentPatient(tableViewSearch.getSelectionModel().getSelectedItem());
        if(ZorgappGUI.getInstance().getCurrentUser().getCurrentPatient() != null) {
            splitPanePatientInfo.setVisible(true);

            loadSelectedPatientInfo();
        }
    }
    @FXML protected void onButtonFindMedication() {
        medicationTrueConsultFalse = true;
        loadFindMedicationConsultWindow();
    }
    @FXML protected void onButtonFindConsult() {
        medicationTrueConsultFalse = false;
        loadFindMedicationConsultWindow();
    }
    @FXML protected void onButtonEditPatient() {

    }
    @FXML protected void onButtonHelp() {

    }
    @FXML protected void onButtonAddNote() {
        try {
            ZorgappGUI.getInstance().getCurrentUser().getCurrentPatient().addNote(textAreaConsole.getText());
            loadSelectedPatientInfo();
        } catch(Exception e) {
            e.getMessage();
        }
    }
    @FXML protected void onButtonAddMedNote() {
        if(ZorgappGUI.getInstance().getCurrentUser().getSelectedMedication() != null) {
            try {
                ZorgappGUI.getInstance().getCurrentUser().getCurrentPatient().addMedNote(textAreaConsole.getText());
                loadSelectedPatientInfo();
            } catch (Exception e) {
                e.getMessage();
            }
        } else {
            onButtonFindMedication();
        }
    }
    @FXML protected void onButtonAddConsult() {

    }
    @FXML protected void onButtonAddStarNote() {

    }
    @FXML protected void onButtonClear() {
        textAreaConsole.clear();
    }

    //PATIENT INFO
    private void loadSelectedPatientInfo() {
        try {
            setPatientInfoPerson();
            setPatientInfoConsult();
            setPatientInfoNotes();
            setPatientInfoMedNotes();
        } catch(Exception e) {
            System.out.println("Cannot print data currentPatient" + e.getMessage());
        }
    }
    // medicationTrueConsultFalse = true;
    private void loadFindMedicationConsultWindow() {
        try {
            FXMLLoader findMedication = new FXMLLoader(ZorgappGUI.class.getResource("FindMedicationConsult.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(findMedication.load(), 600, 800);
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            System.err.println("Failed to load medication / consult window\n" + e);
        }
    }
}
