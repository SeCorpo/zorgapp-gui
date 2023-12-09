package sem.zorgapp.java_zorgapp_gui_sem_2.backend;

public class Consult {

    private String specialty;
    private String category;
    private String type;
    private float tariff;

    public Consult(String specialty, String category, String type, float tariff) {
        this.specialty = specialty;
        this.category = category;
        this.type = type;
        this.tariff = tariff;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public float getTariff() {
        return tariff;
    }

}
