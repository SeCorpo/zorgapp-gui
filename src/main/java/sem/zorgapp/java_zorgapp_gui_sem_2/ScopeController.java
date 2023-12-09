package sem.zorgapp.java_zorgapp_gui_sem_2;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ScopeController {

    public static boolean userLoggedIn = false;

    //CURRENT LANGUAGE
    public static final Locale nl = new Locale("nl", "NL");
    public static final Locale en = new Locale("en", "US");

    private static Locale currentLanguage;
    public static Locale getCurrentLanguage() {
        if(currentLanguage == null) {
            currentLanguage = en;
        } return currentLanguage;
    }
    public void setCurrentLanguage(Locale locale) {
        if(currentLanguage != locale) {
            currentLanguage = locale;
            try {
                ZorgappGUI.getInstance().reloadZorgapp();
                System.out.println("setCurrentLanguage (reloadZorgapp)");

            } catch(Exception e) {
                System.err.println("Failed to change language " + e);
            }
        } else {
            System.err.println(getCurrentLanguage().getDisplayLanguage() + " : already selected");
            alertAlreadySelected(getCurrentLanguage().getDisplayLanguage());
        }
    }


    //MENUBAR
    @FXML MenuItem menuSettingsLanguageEnglish;
    @FXML MenuItem menuSettingsLanguageNederlands;
    @FXML MenuItem menuHelpAbout;

    //BUTTONBAR
    @FXML Button buttonExit;
    @FXML Button buttonLoginLogout;
    @FXML Button buttonLock;
    @FXML Label topClock;

    @FXML AnchorPane mainFrame;

    public void initialize() {
        initTopClock();
        initButtonLock();
        initButtonLoginLogout();

        if(userLoggedIn) {
            try {
                AnchorPane pane = FXMLLoader.load(getClass().getResource("Administration.fxml"));
                mainFrame.getChildren().setAll(pane);
                System.out.println("LoginScreen > Administration");
            } catch (Exception e) {
                System.out.println("Failed to load the Administration FXML file");
            }
        }

        System.out.println("ScopeController :: init done");
    }

    //LOAD FXML IN MAINFRAME
    public void loadFXMLIntoMainFrame(String fxmlFile) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource(fxmlFile));
            mainFrame.getChildren().setAll(pane);
        } catch (Exception e) {
            alertCannotFindFXMLFile();
        }
    }

    //ON MENUBAR ITEMS
    @FXML protected void onMenuSettingsLanguageNederlands() {
        setCurrentLanguage(nl);
    }
    @FXML protected void onMenuSettingsLanguageEnglish() {
        setCurrentLanguage(en);
    }
    @FXML protected void onMenuHelpAbout() {
        aboutWindow();
    }

    //ON BUTTONBAR
    @FXML protected void onButtonExit() {
        System.out.println("Goodbye ... ");
        Runtime.getRuntime().exit(0);
    }
    @FXML protected void onButtonLoginLogout() {
        if(userLoggedIn) {
            System.out.println("WORKING ON LOGOUT");
            userLoggedIn = false;
            ZorgappGUI.getInstance().setCurrentUser(null);
            ZorgappGUI.getInstance().reloadZorgapp();
        } else {
            LoginRegisterScreenController.loginTrueRegisterFalse = true;
            loadFXMLIntoMainFrame("LoginRegisterScreen.fxml");
        }
    }
    @FXML protected void onButtonLock() {
        System.out.println("WORKING ON LOCK BUTTON");
    }
    @FXML protected void onTopClock() {
        try {
            ZorgappGUI.getInstance().reloadZorgapp();
        } catch(Exception e) {
            alertCannotFindFXMLFile();
        }
    }

    //INITIALIZE FUNCTIONS
    private void initTopClock() {
        try {
            AnimationTimer clock = new AnimationTimer() {
                @Override
                public void handle(long l) {
                    if(topClock != null) {
                        topClock.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                    } else {
                        System.err.println("Failed to load clock\n" + "Cannot find Label");
                    }
                }
            };
            clock.start();
        } catch(Exception e) {
            System.err.println("Failed to load clock\n" + e);
        }
    }
    private void initButtonLock() {
        if(userLoggedIn) {buttonLock.setVisible(true);}
        else {buttonLock.setVisible(false);}
    }
    private void initButtonLoginLogout() {
        if(userLoggedIn) {buttonLoginLogout.setText("Logout");}
        else {buttonLoginLogout.setText("Login");}
    }

    //HELPER FUNCTIONS
    private void aboutWindow() {
        try {
            FXMLLoader aboutWindow = new FXMLLoader(ZorgappGUI.class.getResource("About.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(aboutWindow.load(), 400, 500);
            stage.setTitle("About");
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            System.err.println("Failed to load about window\n" + e);
        }
    }
    //FOR USE IN OTHER CLASSES
    public static void goBackHome() {
        try {
            ZorgappGUI.getInstance().reloadZorgapp();
        } catch(Exception e) {
            System.out.println("ZorgappGUIController.goBackHome :: Cannot Go Back To MainScreen");
        }
    }

    //ALERTS
    private void alertAlreadySelected(String information) {
        Alert alreadySelected = new Alert(Alert.AlertType.WARNING);
        alreadySelected.setTitle(information + " Already Selected");
        alreadySelected.setContentText(information + " already selected");
        alreadySelected.show();
    }
    public void alertCannotFindFXMLFile() {
        Alert cannotFindFXMLFile = new Alert(Alert.AlertType.WARNING);
        cannotFindFXMLFile.setTitle("Cannot Find Page");
        cannotFindFXMLFile.setContentText("Failed to load the FXML file");
        cannotFindFXMLFile.show();
    }
}