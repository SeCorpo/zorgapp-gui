module sem.zorgapp.java_zorgapp_gui_sem_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sem.zorgapp.java_zorgapp_gui_sem_2 to javafx.fxml;
    opens sem.zorgapp.java_zorgapp_gui_sem_2.backend.person to javafx.base;
    opens sem.zorgapp.java_zorgapp_gui_sem_2.backend to javafx.base;
    exports sem.zorgapp.java_zorgapp_gui_sem_2;
}