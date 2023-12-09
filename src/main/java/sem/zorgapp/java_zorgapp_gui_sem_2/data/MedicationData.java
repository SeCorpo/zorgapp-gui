package sem.zorgapp.java_zorgapp_gui_sem_2.data;

import sem.zorgapp.java_zorgapp_gui_sem_2.backend.Medication;

import java.util.HashMap;
import java.util.Map;

public class MedicationData {

    private Map<Integer, Medication> medicationMap = new HashMap<>();
    public Map<Integer, Medication> getMedicationMap() {
        return medicationMap;
    }

    {
        medicationMap.put(3451, new Medication(false, "Parazetamol", "Painkiller", "500 mg"));
        medicationMap.put(7032, new Medication(false, "Ibuprofen", "Painkiller", "400 mg"));
        medicationMap.put(4590, new Medication(true, "Oxycodon", "Painkiller", "10 mg"));
        medicationMap.put(7621, new Medication(true, "Methylfenidaat", "Stimulant", "5 mg"));
        medicationMap.put(2408, new Medication(true, "Penicilline", "Antibiotica", "10 tabletten"));

        //CHAT MY FRIEND (+70)
        medicationMap.put(1234, new Medication(false, "Aspirin", "Painkiller", "325 mg"));
        medicationMap.put(5678, new Medication(true, "Lisinopril", "Antihypertensive", "20 mg"));
        medicationMap.put(9012, new Medication(false, "Loratadine", "Antihistamine", "10 mg"));
        medicationMap.put(3456, new Medication(true, "Metformin", "Antidiabetic", "500 mg"));
        medicationMap.put(7890, new Medication(false, "Simvastatin", "Statins", "20 mg"));
        medicationMap.put(2345, new Medication(true, "Alprazolam", "Anxiolytic", "0.5 mg"));
        medicationMap.put(6789, new Medication(false, "Amlodipine", "Antihypertensive", "5 mg"));
        medicationMap.put(9123, new Medication(true, "Prednisone", "Corticosteroid", "10 mg"));
        medicationMap.put(4567, new Medication(false, "Omeprazole", "Proton Pump Inhibitor", "20 mg"));
        medicationMap.put(8901, new Medication(true, "Levothyroxine", "Thyroid Hormone", "100 mcg"));
        medicationMap.put(5432, new Medication(false, "Diazepam", "Anxiolytic", "5 mg"));
        medicationMap.put(9876, new Medication(true, "Tramadol", "Painkiller", "50 mg"));
        medicationMap.put(3210, new Medication(false, "Metoprolol", "Beta Blocker", "25 mg"));
        medicationMap.put(6543, new Medication(true, "Sertraline", "Antidepressant", "50 mg"));
        medicationMap.put(2987, new Medication(false, "Atorvastatin", "Statins", "10 mg"));
        medicationMap.put(4321, new Medication(true, "Hydrochlorothiazide", "Diuretic", "25 mg"));
        medicationMap.put(7654, new Medication(false, "Cetirizine", "Antihistamine", "10 mg"));
        medicationMap.put(1098, new Medication(true, "Warfarin", "Anticoagulant", "5 mg"));
        medicationMap.put(5932, new Medication(false, "Metronidazole", "Antibiotic", "250 mg"));
        medicationMap.put(1111, new Medication(false, "Acetaminophen", "Painkiller", "500 mg"));
        medicationMap.put(3222, new Medication(false, "Naproxen", "Anti-inflammatory", "220 mg"));
        medicationMap.put(3383, new Medication(true, "Codeine", "Narcotic", "15 mg"));
        medicationMap.put(4044, new Medication(true, "Adderall", "Stimulant", "10 mg"));
        medicationMap.put(5555, new Medication(true, "Amoxicillin", "Antibiotic", "500 mg"));
        medicationMap.put(6666, new Medication(false, "Diphenhydramine", "Antihistamine", "25 mg"));
        medicationMap.put(7777, new Medication(true, "Ritalin", "Stimulant", "20 mg"));
        medicationMap.put(8888, new Medication(false, "Ciprofloxacin", "Antibiotic", "250 mg"));
        medicationMap.put(9999, new Medication(false, "Lansoprazole", "Proton Pump Inhibitor", "30 mg"));
        medicationMap.put(1010, new Medication(true, "Hydrocodone", "Narcotic", "5 mg"));
        medicationMap.put(1212, new Medication(false, "Ibuprofen", "Painkiller", "200 mg"));
        medicationMap.put(1313, new Medication(true, "Zoloft", "Antidepressant", "50 mg"));
        medicationMap.put(1414, new Medication(false, "Esomeprazole", "Proton Pump Inhibitor", "40 mg"));
        medicationMap.put(1515, new Medication(true, "Morphine", "Narcotic", "10 mg"));
        medicationMap.put(1616, new Medication(false, "Doxycycline", "Antibiotic", "100 mg"));
        medicationMap.put(1717, new Medication(true, "Vyvanse", "Stimulant", "30 mg"));
        medicationMap.put(1818, new Medication(false, "Fexofenadine", "Antihistamine", "180 mg"));
        medicationMap.put(1919, new Medication(true, "Oxycontin", "Narcotic", "20 mg"));
        medicationMap.put(2020, new Medication(false, "Prednisolone", "Corticosteroid", "5 mg"));
        medicationMap.put(2121, new Medication(false, "Metformin", "Antidiabetic", "1000 mg"));
        medicationMap.put(2222, new Medication(true, "Xanax", "Anxiolytic", "0.25 mg"));
        medicationMap.put(2323, new Medication(false, "Lisinopril", "Antihypertensive", "10 mg"));
        medicationMap.put(2424, new Medication(true, "Percocet", "Narcotic", "2.5 mg"));
        medicationMap.put(2525, new Medication(false, "Pantoprazole", "Proton Pump Inhibitor", "20 mg"));
        medicationMap.put(2626, new Medication(true, "Dilaudid", "Narcotic", "2 mg"));
        medicationMap.put(2727, new Medication(false, "Fluticasone", "Corticosteroid", "50 mcg"));
        medicationMap.put(2828, new Medication(true, "Concerta", "Stimulant", "36 mg"));
        medicationMap.put(2929, new Medication(false, "Cephalexin", "Antibiotic", "500 mg"));
        medicationMap.put(3030, new Medication(true, "Fentanyl", "Narcotic", "100 mcg"));
        medicationMap.put(3131, new Medication(false, "Sulfamethoxazole/Trimethoprim", "Antibiotic", "800/160 mg"));
        medicationMap.put(3232, new Medication(true, "Strattera", "ADHD Medication", "40 mg"));
        medicationMap.put(3333, new Medication(false, "Ranitidine", "Antacid", "150 mg"));
        medicationMap.put(3434, new Medication(true, "Demerol", "Narcotic", "50 mg"));
        medicationMap.put(3535, new Medication(false, "Ampicillin", "Antibiotic", "250 mg"));
        medicationMap.put(3636, new Medication(false, "Atenolol", "Beta Blocker", "50 mg"));
        medicationMap.put(3737, new Medication(true, "Adderall XR", "Stimulant", "30 mg"));
        medicationMap.put(3838, new Medication(false, "Diphenoxylate/Atropine", "Antidiarrheal", "2.5/0.025 mg"));
        medicationMap.put(3939, new Medication(true, "Opana", "Narcotic", "10 mg"));
        medicationMap.put(4040, new Medication(false, "Montelukast", "Antiasthmatic", "10 mg"));
        medicationMap.put(4141, new Medication(true, "Methadone", "Narcotic", "10 mg"));
        medicationMap.put(4242, new Medication(false, "Budesonide", "Corticosteroid", "200 mcg"));
        medicationMap.put(4343, new Medication(true, "Conzip", "Narcotic", "100 mg"));
        medicationMap.put(4444, new Medication(false, "Cetirizine", "Antihistamine", "10 mg"));
        medicationMap.put(4545, new Medication(true, "Risperdal", "Antipsychotic", "2 mg"));
        medicationMap.put(4646, new Medication(false, "Metronidazole", "Antibiotic", "500 mg"));
        medicationMap.put(4747, new Medication(true, "Adderall IR", "Stimulant", "20 mg"));
        medicationMap.put(4848, new Medication(false, "Esomeprazole", "Proton Pump Inhibitor", "20 mg"));
        medicationMap.put(4949, new Medication(true, "Oxytocin", "Hormone", "10 units"));
        medicationMap.put(5050, new Medication(false, "Flonase", "Corticosteroid", "50 mcg"));
        medicationMap.put(5151, new Medication(false, "Clindamycin", "Antibiotic", "300 mg"));


    }


}
