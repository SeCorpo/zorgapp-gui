package sem.zorgapp.java_zorgapp_gui_sem_2.backend.person;

import sem.zorgapp.java_zorgapp_gui_sem_2.ZorgappGUI;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.*;

import java.util.ArrayList;

import java.time.LocalDate;


public class Patient extends Person {

    private Integer patientNumber;
    private float weight;
    private float length;
    private ArrayList<Notes> notesList;
    private ArrayList<MedNotes> medNotesList;
    private ArrayList<ConsultNotes> consultNotesList;
    private ArrayList<StarNotes> starNotesList;


    public Patient(Integer patientNumber, String firstName, String surname, LocalDate birthday, float weight, float length) {
        super(firstName, surname, birthday);
        this.patientNumber = patientNumber;
        this.weight = weight;
        this.length = length;
        this.notesList = new ArrayList<>();
        this.medNotesList = new ArrayList<>();
        this.consultNotesList = new ArrayList<>();
        this.starNotesList = new ArrayList<>();
    }
    //==================================================
    // getters===========
    public Integer getPatientNumber() {
        return patientNumber;
    }
    public float getWeight() {
        return weight;
    }
    public float getLength() {
        return length;
    }
    public ArrayList<Notes> getNotesList() {return notesList;}
    public ArrayList<MedNotes> getMedNotesList() {return medNotesList;}
    public ArrayList<ConsultNotes> getConsultNotesList() {return consultNotesList;}
    public ArrayList<StarNotes> getStarNotesList() {return starNotesList;}
    //==================================================
//setters===========

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setLength(float length) {
        this.length = length;
    }
    //==================================================
    //====FN_===========================================
    public double calculateBmi() {
        return weight / (length * length);
    }

    public void addNote(String note) {
        notesList.add(new Notes(note, LocalDate.now()));
    }
    public void addMedNote(String note) {
        medNotesList.add(new MedNotes(ZorgappGUI.getInstance().getCurrentUser().getSelectedMedication(), note, LocalDate.now()));
    }

    public void addConsultNote(Consult consult, String note, LocalDate noteDate) {
        consultNotesList.add(new ConsultNotes(consult, note, noteDate));
    }

    public void addStarNote(double liters, String note, LocalDate noteDate) {
        starNotesList.add(new StarNotes(liters, note, noteDate));
    }
}
