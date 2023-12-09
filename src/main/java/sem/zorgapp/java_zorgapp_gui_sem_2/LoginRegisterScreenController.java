package sem.zorgapp.java_zorgapp_gui_sem_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.person.*;

import java.time.LocalDate;

public class LoginRegisterScreenController {


    public static boolean loginTrueRegisterFalse = true;
    @FXML AnchorPane anchorPaneLoginRegisterScreen;
    @FXML Label labelLoginRegister;
    //LOGIN SCREEN
    @FXML TextField textFieldUserName;
    @FXML PasswordField passwordFieldPassword;
    @FXML Label labelForgotPassword;
    @FXML Button buttonLoginRegister;
    @FXML Button buttonSwitchToLoginRegister;

    //REGISTER SCREEN
    @FXML Pane paneRepeatPassword;
    @FXML PasswordField passwordFieldPassword1;
    @FXML AnchorPane anchorPanePerson;
    @FXML ComboBox<String> comboUserType;
    @FXML TextField textFieldFirstName;
    @FXML TextField textFieldSurname;
    @FXML TextField textFieldBirthday;

    public void initialize() {
        if(loginTrueRegisterFalse) {
            initLoginScreen();
            System.out.println("LoginRegisterScreenController - initialize login screen done");
        } else {
            initRegisterScreen();
            System.out.println("LoginRegisterScreenController - initialize register screen done");
        }
    }
    private void initLoginScreen() {
        labelLoginRegister.setText("Login");
        buttonLoginRegister.setText("Login");
        buttonSwitchToLoginRegister.setText("Register");
        paneRepeatPassword.setVisible(false);
        labelForgotPassword.setVisible(true);
        anchorPanePerson.setVisible(false);
    }
    private void initRegisterScreen() {
        labelLoginRegister.setText("Register");
        buttonLoginRegister.setText("Register");
        buttonSwitchToLoginRegister.setText("Login");
        paneRepeatPassword.setVisible(true);
        labelForgotPassword.setVisible(false);
        anchorPanePerson.setVisible(true);
        initComboUserType();
    }
    private void initComboUserType() {
        String[] userTypeStrings = {"MD", "DMD", "ADMIN", "Physio"};
        ObservableList<String> a = FXCollections.observableArrayList();
        a.addAll(userTypeStrings);
        comboUserType.setItems(a);
    }

    //ON LOGIN SCREEN
    @FXML protected void onLabelForgotPassword() {
        System.out.println("WORKING ON FORGOT PASSWORD FUNCTION");
    }
    @FXML protected void onButtonLoginRegister() {
        String username = textFieldUserName.getText();
        String password = passwordFieldPassword.getText();
        if(loginTrueRegisterFalse) {

            verifyUserLogin(username, password);

            if (ScopeController.userLoggedIn) {
                try {
                    ZorgappGUI.getInstance().reloadZorgapp();
                } catch (Exception e) {
                    System.out.println("Failed to load the Administration FXML file");
                }
            }
        } if(!loginTrueRegisterFalse) {
            boolean userAdded = false;
            String passwordVerify = passwordFieldPassword1.getText();

            passwordCheck(password, passwordVerify);
            userNameCheck(username);

            String comboUserTypeValue = comboUserType.getSelectionModel().getSelectedItem();
            String firstName = textFieldFirstName.getText();
            String surname = textFieldSurname.getText();
            String birthday = textFieldBirthday.getText();
            if(usernameOK && passwordOK) {
                try {
                    if (comboUserTypeValue.equals("MD")) {
                        newDoctor(username, password, firstName, surname, LocalDate.parse(birthday));
                        userAdded = true;
                    }
                    if (comboUserTypeValue.equals("DMD")) {
                        newDentist(username, password, firstName, surname, LocalDate.parse(birthday));
                        userAdded = true;
                    }
                    if (comboUserTypeValue.equals("Physio")) {
                        newPhysiotherapist(username, password, firstName, surname, LocalDate.parse(birthday));
                        userAdded = true;
                    }
                    if (comboUserTypeValue.equals("ADMIN")) {
                        newAdmin(username, password, firstName, surname, LocalDate.parse(birthday));
                        userAdded = true;
                    }
                } catch (Exception e) {
                    userAdded = false;
                    System.out.println("Failed to add User");
                    alertNotAllFields();
                }
            }

            if(userAdded) {
                try {
                    loginTrueRegisterFalse = true;
                    initialize();
                } catch (Exception e) {
                    System.out.println("Failed to load the LoginScreen FXML file");
                }
            }
        }
    }
    @FXML protected void onButtonSwitchToLoginRegister() {
        if(loginTrueRegisterFalse) {
            loginTrueRegisterFalse = false;
            initialize();
            System.out.println("Switched To Register Screen");
        } else {
            loginTrueRegisterFalse = true;
            initialize();
            System.out.println("Switched To Login Screen");
        }
    }

    //LOGIN
    boolean passwordOK = false;
    boolean usernameOK = false;
    private void verifyUserLogin(String username, String password) {
        boolean loginOK = false;

        for(String userKey : ZorgappGUI.getInstance().getUserData().getUserMap().keySet()) {
            usernameOK = false;
            passwordOK = false;

            if(username.equals(userKey)) {
                usernameOK = true;

                if(password.equals(ZorgappGUI.getInstance().getUserData().getUserMap().get(userKey).getPassword())) {
                    passwordOK = true;
                }
            }
            if(usernameOK && passwordOK) {
                loginOK = true;
                ZorgappGUI.getInstance().setCurrentUser(ZorgappGUI.getInstance().getUserData().getUserMap().get(userKey));
                System.out.println(userKey + " is now the currentUser");
                ScopeController.userLoggedIn = true;
            }
        }
        if(!loginOK) {
            alertLoginIncorrect();
        }
    }

    //REGISTER
    private void passwordCheck(String password, String passwordCheck) {
        boolean passwordsAreTheSame = false;
        boolean lengthOK =false;
        boolean letterLowerCaseOK = false;
        boolean letterUpperCaseOK = false;
        boolean numberOK = false;
        boolean specialCharacterOK = false;

        if(password.equals(passwordCheck)) {passwordsAreTheSame = true;}
        else {alertPasswordsDontMatch();}

        if(password.length() >= 7) {lengthOK = true;}
        if(password.matches(".*[a-z].*")) {letterLowerCaseOK = true;}
        if(password.matches(".*[A-Z].*")) {letterUpperCaseOK = true;}
        if(password.matches(".*[0-9].*")) {numberOK = true;}
        if(password.matches(".*[^a-zA-Z0-9].*")) {specialCharacterOK = true;}

        if(passwordsAreTheSame && lengthOK && letterLowerCaseOK && letterUpperCaseOK && numberOK && specialCharacterOK) {
            passwordOK = true;
        } else {
            passwordOK = false;
            alertPasswordNotStrongEnough();
        }
    }
    private void userNameCheck(String username) {
        for(String userNamesTaken : ZorgappGUI.getInstance().getUserData().getUserMap().keySet()) {
            if(!username.equals(userNamesTaken)) {
                usernameOK = true;
            } else {
                alertUserNameAlreadyTaken();
                usernameOK = false;
                break;
            }
        }
    }
    private void newDoctor(String username, String password, String firstName, String surname, LocalDate birthday) {
        Doctor doctor = new Doctor(username, password, "MD", firstName, surname, birthday);
        ZorgappGUI.getInstance().getUserData().getUserMap().put(username, doctor);
    }
    private void newDentist(String username, String password, String firstName, String surname, LocalDate birthday) {
        Dentist dentist = new Dentist(username, password,"DMD", firstName, surname, birthday);
        ZorgappGUI.getInstance().getUserData().getUserMap().put(username, dentist);
    }
    private void newPhysiotherapist(String username, String password, String firstName, String surname, LocalDate birthday) {
        Physiotherapist physiotherapist = new Physiotherapist(username, password, "Physio", firstName, surname, birthday);
        ZorgappGUI.getInstance().getUserData().getUserMap().put(username, physiotherapist);
    }
    private void newAdmin(String username, String password, String firstName, String surname, LocalDate birthday) {
        Admin admin = new Admin(username, password, "ADMIN", firstName, surname, birthday);
        ZorgappGUI.getInstance().getUserData().getUserMap().put(username, admin);
    }

    //ALERTS
    private void alertLoginIncorrect() {
        Alert loginIncorrect = new Alert(Alert.AlertType.WARNING);
        loginIncorrect.setTitle("Login Incorrect");
        loginIncorrect.setContentText("Incorrect username or password, please try again");
        loginIncorrect.show();
    }
    private void alertUserNameAlreadyTaken() {
        Alert userNameTaken = new Alert(Alert.AlertType.WARNING);
        userNameTaken.setTitle("Please Choose Another UserName");
        userNameTaken.setContentText("Please Choose Another UserName, the chosen username is already taken");
        userNameTaken.show();
    }
    private void alertPasswordsDontMatch() {
        Alert passwordDontMatch = new Alert(Alert.AlertType.WARNING);
        passwordDontMatch.setTitle("Passwords Don't Match");
        passwordDontMatch.setContentText("These passwords don't match. Please try again.");
        passwordDontMatch.show();
    }
    private void alertPasswordNotStrongEnough() {
        Alert passwordNotStrongEnough = new Alert(Alert.AlertType.WARNING);
        passwordNotStrongEnough.setTitle("Passwords Not Strong");
        passwordNotStrongEnough.setContentText("Please enter a secure password\n" +
                "New passwords must meet the password policy requirements\n" +
                " - It must be longer than 7 characters\n" +
                " - It must include at least one lower case letter\n" +
                " - It must include at least one upper case letter\n" +
                " - It must include at least one number\n" +
                " - It must contain at least on special character (% $ # @ & * ! ?");
        passwordNotStrongEnough.show();
    }
    private void alertNotAllFields() {
        Alert registerIncorrect = new Alert(Alert.AlertType.WARNING);
        registerIncorrect.setTitle("Enter all fields");
        registerIncorrect.setContentText("Not all field are entered, no new user was registered. Please try again, or login if you already have an account");
        registerIncorrect.show();
    }
}
