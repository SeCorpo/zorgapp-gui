package sem.zorgapp.java_zorgapp_gui_sem_2.backend;

import java.time.LocalDate;

public class MedNotes extends Notes {

    private Medication medication;

    public MedNotes(Medication medication, String note, LocalDate noteDate) {
        super(note, noteDate);
        this.medication = medication;
    }
    //==================================================
//getters========
    public Medication getMedication() {
        return medication;
    }

}
