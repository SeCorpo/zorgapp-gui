package sem.zorgapp.java_zorgapp_gui_sem_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.User;
import sem.zorgapp.java_zorgapp_gui_sem_2.data.PatientData;
import sem.zorgapp.java_zorgapp_gui_sem_2.data.UserData;

import java.io.IOException;
import java.util.ResourceBundle;

public class ZorgappGUI extends Application {

    public Stage stage;
    public Scene scene;

    private static volatile ZorgappGUI instance;
    public static ZorgappGUI getInstance() {
        ZorgappGUI singleton = instance;
        if(singleton == null) {
            synchronized(ZorgappGUI.class) {
                singleton = instance;
                if(singleton == null) {
                    instance = singleton = new ZorgappGUI();
                }
            }
        } return singleton;
    }

    public static void main(String[] args) {

        ZorgappGUI gui = instance;
        gui.launch();
    }

    public void start(Stage stage) throws IOException {
        ZorgappGUI.getInstance().stage = stage;

        loadZorgapp(stage);
    }
    private void loadZorgapp(Stage stage) throws IOException {
        ResourceBundle languages = ResourceBundle.getBundle("language", ScopeController.getCurrentLanguage());
        FXMLLoader fxmlLoader = new FXMLLoader(ZorgappGUI.class.getResource("Scope.fxml"), languages);
        scene = new Scene(fxmlLoader.load(), 1200, 800);
        stage.setTitle("Semmy's Simple Zorgapp");
        stage.setScene(scene);
        stage.show();
    }

    public void reloadZorgapp() {
        stage = (Stage) Stage.getWindows().get(0);
        try {
            loadZorgapp(stage);
            if(currentUser != null) {
                System.out.println(getCurrentUser().getUsername() + " is the currentUser");
            } else {
                System.out.println("There is no currentUser");
            }
            System.out.println(ScopeController.userLoggedIn + " userLoggedIn after reload");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //ADMINISTRATION
    UserData userData = new UserData();
    PatientData patientData = new PatientData();
    public UserData getUserData() {
        return userData;
    }
    public PatientData getPatientData() {
        return patientData;
    }

    User currentUser;
    public User getCurrentUser() {
        if(currentUser == null) {
            System.err.println("Please logging first");
        } return currentUser;
    }
    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }


}