package sem.zorgapp.java_zorgapp_gui_sem_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.Consult;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.Medication;

public class FindMedicationConsultController {

    @FXML TextField textFieldMedicationConsultSearch;
    @FXML Button buttonSearch;
    @FXML TableView<Medication> tableViewMedication;
    @FXML TableColumn<Medication, Integer> tableViewMedicationNumber;
    @FXML TableColumn<Medication, Boolean> tableViewMedicationRestriction;
    @FXML TableColumn<Medication, String> tableViewMedicationName;
    @FXML TableColumn<Medication, String> tableViewMedicationType;
    @FXML TableColumn<Medication, String> tableViewMedicationDose;

    @FXML TableView<Consult> tableViewConsult;
    @FXML TableColumn<Consult, String> tableViewConsultCategory;
    @FXML TableColumn<Consult, String> tableViewConsultType;
    @FXML TableColumn<Consult, String> tableViewConsultTariff;

    public void initialize() {
        if(AdministrationController.medicationTrueConsultFalse) {
            initFindMedication();
            System.out.println("AdministrationController - initFindMedication done");
        } else if(!AdministrationController.medicationTrueConsultFalse) {
            initFindConsult();
            System.out.println("AdministrationController - initFindConsult done");
        }
    }
    private void initFindMedication() {
        if(ZorgappGUI.getInstance().getCurrentUser().showMedicationList) {
            tableViewConsult.setVisible(false);
            tableViewMedication.setVisible(true);

            //tableViewMedicationNumber.setCellValueFactory(new PropertyValueFactory<Medication, Integer>(""));
            tableViewMedicationRestriction.setCellValueFactory(new PropertyValueFactory<Medication, Boolean>("restricted"));
            tableViewMedicationName.setCellValueFactory(new PropertyValueFactory<Medication, String>("name"));
            tableViewMedicationType.setCellValueFactory(new PropertyValueFactory<Medication, String>("type"));
            tableViewMedicationDose.setCellValueFactory(new PropertyValueFactory<Medication, String>("stDose"));

            ZorgappGUI.getInstance().getPatientData().getMedicationData().getMedicationMap().forEach((key, medication) -> tableViewMedication.getItems().add(medication));
        }
    }
    private void initFindConsult() {
        if(ZorgappGUI.getInstance().getCurrentUser().showConsultList) {
            tableViewMedication.setVisible(false);
            tableViewConsult.setVisible(true);

            tableViewConsultCategory.setCellValueFactory(new PropertyValueFactory<Consult, String>("category"));
            tableViewConsultType.setCellValueFactory(new PropertyValueFactory<Consult, String>("type"));
            tableViewConsultTariff.setCellValueFactory(new PropertyValueFactory<Consult, String>("tariff"));

            ZorgappGUI.getInstance().getCurrentUser().getConsultList().forEach(consult -> tableViewConsult.getItems().add(consult));
        }
    }

    @FXML protected void onTableViewMedication() {
        ZorgappGUI.getInstance().getCurrentUser().setSelectedMedication(tableViewMedication.getSelectionModel().getSelectedItem());

    }
    @FXML protected void onTableViewConsult() {
        ZorgappGUI.getInstance().getCurrentUser().setSelectedConsult(tableViewConsult.getSelectionModel().getSelectedItem());
    }

    @FXML protected void onButtonSearch() {

    }
}
