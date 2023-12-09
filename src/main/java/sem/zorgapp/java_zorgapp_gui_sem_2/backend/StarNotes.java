package sem.zorgapp.java_zorgapp_gui_sem_2.backend;

import java.time.LocalDate;

public class StarNotes extends Notes {

    private double liters;

    public StarNotes(double liters, String note, LocalDate noteDate) {
        super(note, noteDate);
        this.liters = liters;
    }

    public double getLiters() {
        return liters;
    }
}