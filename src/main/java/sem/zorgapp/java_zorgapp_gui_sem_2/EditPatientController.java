package sem.zorgapp.java_zorgapp_gui_sem_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EditPatientController {

    @FXML Label labelEditPatientName;
    @FXML Button buttonCancel;
    @FXML Button buttonSave;

    public void initialize() {
        labelEditPatientName.setText(ZorgappGUI.getInstance().getCurrentUser().getCurrentPatient().getFullName());
    }

    @FXML protected void onButtonCancel() {

    }
    @FXML protected void onButtonSave() {

    }
}
