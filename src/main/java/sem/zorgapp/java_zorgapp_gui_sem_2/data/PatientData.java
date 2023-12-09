package sem.zorgapp.java_zorgapp_gui_sem_2.data;

import sem.zorgapp.java_zorgapp_gui_sem_2.ZorgappGUI;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.ConsultNotes;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.MedNotes;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.Medication;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.person.Patient;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class PatientData {

    private Map<Integer, Patient> patientMap = new HashMap<>();
    public Map<Integer, Patient> getPatientMap() {
        return patientMap;
    }

    //MEDICATION DATA
    MedicationData medicationData = new MedicationData();
    public MedicationData getMedicationData() {
        return medicationData;
    }


    {
        patientMap.put(10000, new Patient(10000,"Patient", "Zero", LocalDate.of(1950, 1, 1), 80f, 1.85f));
        patientMap.put(9999, new Patient(9999,"Sem", "Koldewijn", LocalDate.of(1999, 6, 1), 75f, 1.83f));
        patientMap.put(9998, new Patient(9998,"Barack", "Obama", LocalDate.of(1961, 8, 4), 80f, 1.86f));
        patientMap.put(9997, new Patient(9997,"Steve", "Carell", LocalDate.of(1962, 8, 16), 78f, 1.75f));
        patientMap.put(9996, new Patient(9996,"Xi", "Jinping", LocalDate.of(1953, 6, 15), 73f, 1.75f));
        patientMap.put(9995, new Patient(9995,"Vladimir", "Putin", LocalDate.of(1952, 10, 7), 68f, 1.70f));
        patientMap.put(9994, new Patient(9994,"Justin", "Bieber", LocalDate.of(1994, 3, 1), 67f, 1.72f));
        patientMap.put(9993, new Patient(9993,"Donald", "Trump", LocalDate.of(1946, 6, 14), 107.5f, 1.90f));
        patientMap.put(9992, new Patient(9992,"Felix", "Kjellberg", LocalDate.of(1989, 10, 24), 82.5f, 1.8f));

        //CHAT MY FRIEND (+40)
        patientMap.put(9991, new Patient(9991, "Bill", "Gates", LocalDate.of(1955, 10, 28), 75f, 1.77f));
        patientMap.put(9990, new Patient(9990, "Angela", "Merkel", LocalDate.of(1954, 7, 17), 65f, 1.64f));
        patientMap.put(9989, new Patient(9989, "Elon", "Musk", LocalDate.of(1971, 6, 28), 80f, 1.88f));
        patientMap.put(9988, new Patient(9988, "Michelle", "Obama", LocalDate.of(1964, 1, 17), 72f, 1.80f));
        patientMap.put(9987, new Patient(9987, "Taylor", "Swift", LocalDate.of(1989, 12, 13), 55f, 1.78f));
        patientMap.put(9986, new Patient(9986, "Jeff", "Bezos", LocalDate.of(1964, 1, 12), 70f, 1.71f));
        patientMap.put(9985, new Patient(9985, "Emma", "Watson", LocalDate.of(1990, 4, 15), 60f, 1.65f));
        patientMap.put(9984, new Patient(9984, "Cristiano", "Ronaldo", LocalDate.of(1985, 2, 5), 80f, 1.87f));
        patientMap.put(9983, new Patient(9983, "Oprah", "Winfrey", LocalDate.of(1954, 1, 29), 70f, 1.68f));
        patientMap.put(9982, new Patient(9982, "Kanye", "West", LocalDate.of(1977, 6, 8), 75f, 1.73f));
        patientMap.put(9981, new Patient(9981, "Emma", "Stone", LocalDate.of(1988, 11, 6), 58f, 1.68f));
        patientMap.put(9980, new Patient(9980, "Lionel", "Messi", LocalDate.of(1987, 6, 24), 67f, 1.70f));
        patientMap.put(9979, new Patient(9979, "Adele", "Adkins", LocalDate.of(1988, 5, 5), 70f, 1.75f));
        patientMap.put(9978, new Patient(9978, "Tom", "Cruise", LocalDate.of(1962, 7, 3), 68f, 1.70f));
        patientMap.put(9977, new Patient(9977, "Serena", "Williams", LocalDate.of(1981, 9, 26), 72f, 1.75f));
        patientMap.put(9976, new Patient(9976, "Mark", "Zuckerberg", LocalDate.of(1984, 5, 14), 65f, 1.70f));
        patientMap.put(9975, new Patient(9975, "Natalie", "Portman", LocalDate.of(1981, 6, 9), 55f, 1.60f));
        patientMap.put(9974, new Patient(9974, "Brad", "Pitt", LocalDate.of(1963, 12, 18), 75f, 1.80f));
        patientMap.put(9973, new Patient(9973, "Ariana", "Grande", LocalDate.of(1993, 6, 26), 55f, 1.55f));
        patientMap.put(9972, new Patient(9972, "Dwayne", "Johnson", LocalDate.of(1972, 5, 2), 100f, 1.96f));

        //'REAL FAMOUS HISTORICAL PEOPLE'
        patientMap.put(9971, new Patient(9971, "Albert", "Einstein", LocalDate.of(1879, 3, 14), 67f, 1.75f));
        patientMap.put(9970, new Patient(9970, "Leonardo", "da Vinci", LocalDate.of(1452, 4, 15), 70f, 1.80f));
        patientMap.put(9969, new Patient(9969, "Nelson", "Mandela", LocalDate.of(1918, 7, 18), 75f, 1.85f));
        patientMap.put(9968, new Patient(9968, "Winston", "Churchill", LocalDate.of(1874, 11, 30), 80f, 1.78f));
        //patientMap.put(9967, new Patient(9967, "Cleopatra", "", LocalDate.of(-69, 69, 12), 60f, 1.62f));
        patientMap.put(9966, new Patient(9966, "Galileo", "Galilei", LocalDate.of(1564, 2, 15), 68f, 1.70f));
        patientMap.put(9965, new Patient(9965, "Joan", "of Arc", LocalDate.of(1412, 1, 6), 55f, 1.62f));
        patientMap.put(9964, new Patient(9964, "Marilyn", "Monroe", LocalDate.of(1926, 6, 1), 50f, 1.65f));
        //patientMap.put(9963, new Patient(9963, "Alexander", "the Great", LocalDate.of(-356, 7, 20), 70f, 1.73f));
        patientMap.put(9962, new Patient(9962, "William", "Shakespeare", LocalDate.of(1564, 4, 26), 65f, 1.68f));
        patientMap.put(9961, new Patient(9961, "Mahatma", "Gandhi", LocalDate.of(1869, 10, 2), 72f, 1.68f));
        patientMap.put(9960, new Patient(9960, "Amelia", "Earhart", LocalDate.of(1897, 7, 24), 58f, 1.68f));
        patientMap.put(9959, new Patient(9959, "Queen", "Victoria", LocalDate.of(1819, 5, 24), 70f, 1.55f));
        patientMap.put(9958, new Patient(9958, "Martin", "Luther King Jr.", LocalDate.of(1929, 1, 15), 65f, 1.73f));
        patientMap.put(9957, new Patient(9957, "Mao", "Zedong", LocalDate.of(1893, 12, 26), 80f, 1.75f));
        patientMap.put(9956, new Patient(9956, "Catherine", "the Great", LocalDate.of(1729, 5, 2), 68f, 1.70f));
        patientMap.put(9955, new Patient(9955, "Frederick", "Douglass", LocalDate.of(1818, 2, 14), 55f, 1.77f));
        patientMap.put(9954, new Patient(9954, "Marie", "Curie", LocalDate.of(1867, 11, 7), 60f, 1.66f));
        patientMap.put(9953, new Patient(9953, "Christopher", "Columbus", LocalDate.of(1451, 10, 31), 75f, 1.78f));
        patientMap.put(9952, new Patient(9952, "Rosa", "Parks", LocalDate.of(1913, 2, 4), 55f, 1.55f));

        //'MUSIC LEGENDS'
        patientMap.put(9951, new Patient(9951, "Elvis", "Presley", LocalDate.of(1935, 1, 8), 78f, 1.82f));
        patientMap.put(9950, new Patient(9950, "Michael", "Jackson", LocalDate.of(1958, 8, 29), 70f, 1.75f));
        patientMap.put(9949, new Patient(9949, "John", "Lennon", LocalDate.of(1940, 10, 9), 67f, 1.80f));
        patientMap.put(9948, new Patient(9948, "Bob", "Marley", LocalDate.of(1945, 2, 6), 73f, 1.68f));
        patientMap.put(9947, new Patient(9947, "Freddie", "Mercury", LocalDate.of(1946, 9, 5), 68f, 1.77f));
        patientMap.put(9946, new Patient(9946, "David", "Bowie", LocalDate.of(1947, 1, 8), 70f, 1.81f));
        patientMap.put(9945, new Patient(9945, "Prince", "", LocalDate.of(1958, 6, 7), 65f, 1.60f));
        patientMap.put(9944, new Patient(9944, "Jimi", "Hendrix", LocalDate.of(1942, 11, 27), 73f, 1.80f));
        patientMap.put(9943, new Patient(9943, "Whitney", "Houston", LocalDate.of(1963, 8, 9), 62f, 1.73f));
        patientMap.put(9942, new Patient(9942, "Frank", "Sinatra", LocalDate.of(1915, 12, 12), 75f, 1.77f));
        patientMap.put(9941, new Patient(9941, "Aretha", "Franklin", LocalDate.of(1942, 3, 25), 72f, 1.68f));
        patientMap.put(9940, new Patient(9940, "Kurt", "Cobain", LocalDate.of(1967, 2, 20), 65f, 1.78f));
        patientMap.put(9939, new Patient(9939, "Janis", "Joplin", LocalDate.of(1943, 1, 19), 68f, 1.65f));
        patientMap.put(9938, new Patient(9938, "Amy", "Winehouse", LocalDate.of(1983, 9, 14), 58f, 1.73f));
        patientMap.put(9937, new Patient(9937, "Jim", "Morrison", LocalDate.of(1943, 12, 8), 70f, 1.85f));
        patientMap.put(9936, new Patient(9936, "Tina", "Turner", LocalDate.of(1939, 11, 26), 75f, 1.63f));
        patientMap.put(9935, new Patient(9935, "John", "Coltrane", LocalDate.of(1926, 9, 23), 70f, 1.78f));
        patientMap.put(9934, new Patient(9934, "Beyoncé", "", LocalDate.of(1981, 9, 4), 63f, 1.69f));
        patientMap.put(9933, new Patient(9933, "Stevie", "Wonder", LocalDate.of(1950, 5, 13), 68f, 1.80f));
        patientMap.put(9932, new Patient(9932, "Paul", "McCartney", LocalDate.of(1942, 6, 18), 75f, 1.77f));
        patientMap.put(9931, new Patient(9931, "Mick", "Jagger", LocalDate.of(1943, 7, 26), 72f, 1.78f));
        patientMap.put(9930, new Patient(9930, "Madonna", "", LocalDate.of(1958, 8, 16), 60f, 1.64f));
        patientMap.put(9929, new Patient(9929, "Bruce", "Springsteen", LocalDate.of(1949, 9, 23), 70f, 1.79f));
        patientMap.put(9928, new Patient(9928, "Ella", "Fitzgerald", LocalDate.of(1917, 4, 25), 80f, 1.68f));
        patientMap.put(9927, new Patient(9927, "Bob", "Dylan", LocalDate.of(1941, 5, 24), 75f, 1.80f));
        patientMap.put(9926, new Patient(9926, "Adele", "", LocalDate.of(1988, 5, 5), 65f, 1.75f));
        patientMap.put(9925, new Patient(9925, "Freddy", "Fender", LocalDate.of(1937, 6, 4), 73f, 1.72f));
        patientMap.put(9924, new Patient(9924, "Tupac", "Shakur", LocalDate.of(1971, 6, 16), 67f, 1.76f));
        patientMap.put(9923, new Patient(9923, "Lana", "Del Rey", LocalDate.of(1985, 6, 21), 60f, 1.69f));
        //patientMap.put(9922, new Patient(9922, "Kanye", "West", LocalDate.of(1977, 6, 8), 73f, 1.78f));
        patientMap.put(9921, new Patient(9921, "Nina", "Simone", LocalDate.of(1933, 2, 21), 70f, 1.70f));
        patientMap.put(9920, new Patient(9920, "Johnny", "Cash", LocalDate.of(1932, 2, 26), 75f, 1.80f));
        patientMap.put(9919, new Patient(9919, "Axl", "Rose", LocalDate.of(1962, 2, 6), 68f, 1.85f));
        patientMap.put(9918, new Patient(9918, "Joni", "Mitchell", LocalDate.of(1943, 11, 7), 75f, 1.68f));
        patientMap.put(9917, new Patient(9917, "Chuck", "Berry", LocalDate.of(1926, 10, 18), 80f, 1.75f));
        patientMap.put(9916, new Patient(9916, "Billie", "Holiday", LocalDate.of(1915, 4, 7), 85f, 1.63f));
        patientMap.put(9915, new Patient(9915, "Ray", "Charles", LocalDate.of(1930, 9, 23), 75f, 1.75f));
        patientMap.put(9914, new Patient(9914, "Amy", "Lee", LocalDate.of(1981, 12, 13), 62f, 1.63f));
        patientMap.put(9913, new Patient(9913, "Eminem", "", LocalDate.of(1972, 10, 17), 73f, 1.73f));
        patientMap.put(9912, new Patient(9912, "Natalie", "Cole", LocalDate.of(1950, 2, 6), 70f, 1.68f));
        patientMap.put(9911, new Patient(9911, "Kurtis", "Blow", LocalDate.of(1959, 8, 9), 65f, 1.80f));
        patientMap.put(9910, new Patient(9910, "Dolly", "Parton", LocalDate.of(1946, 1, 19), 75f, 1.55f));
        patientMap.put(9909, new Patient(9909, "Mariah", "Carey", LocalDate.of(1969, 3, 27), 60f, 1.70f));
        patientMap.put(9908, new Patient(9908, "Stevie", "Nicks", LocalDate.of(1948, 5, 26), 72f, 1.62f));
        patientMap.put(9907, new Patient(9907, "Robert", "Plant", LocalDate.of(1948, 8, 20), 73f, 1.85f));
        patientMap.put(9906, new Patient(9906, "Billy", "Joel", LocalDate.of(1949, 5, 9), 70f, 1.68f));
        patientMap.put(9905, new Patient(9905, "Carlos", "Santana", LocalDate.of(1947, 7, 20), 75f, 1.80f));
        patientMap.put(9904, new Patient(9904, "Diana", "Ross", LocalDate.of(1944, 3, 26), 78f, 1.63f));
        patientMap.put(9903, new Patient(9903, "Frank", "Zappa", LocalDate.of(1940, 12, 21), 80f, 1.82f));
        patientMap.put(9902, new Patient(9902, "Paul", "Simon", LocalDate.of(1941, 10, 13), 79f, 1.70f));
        patientMap.put(9901, new Patient(9901, "Tina", "Turner", LocalDate.of(1939, 11, 26), 82f, 1.63f));
        patientMap.put(9900, new Patient(9900, "Ray", "Davies", LocalDate.of(1944, 6, 21), 77f, 1.75f));
        patientMap.put(9899, new Patient(9899, "Roger", "Waters", LocalDate.of(1943, 9, 6), 78f, 1.88f));
        patientMap.put(9898, new Patient(9898, "Björk", "", LocalDate.of(1965, 11, 21), 60f, 1.63f));
        patientMap.put(9897, new Patient(9897, "Johnny", "Rotten", LocalDate.of(1956, 1, 31), 65f, 1.78f));
        patientMap.put(9896, new Patient(9896, "Bon", "Jovi", LocalDate.of(1962, 3, 2), 70f, 1.81f));
        patientMap.put(9895, new Patient(9895, "Steven", "Tyler", LocalDate.of(1948, 3, 26), 73f, 1.80f));
        patientMap.put(9894, new Patient(9894, "Annie", "Lennox", LocalDate.of(1954, 12, 25), 67f, 1.63f));
        patientMap.put(9893, new Patient(9893, "Steven", "Van Zandt", LocalDate.of(1950, 11, 22), 71f, 1.70f));
        patientMap.put(9892, new Patient(9892, "Buddy", "Holly", LocalDate.of(1936, 9, 7), 76f, 1.73f));
        patientMap.put(9891, new Patient(9891, "Neil", "Young", LocalDate.of(1945, 11, 12), 78f, 1.80f));
        patientMap.put(9890, new Patient(9890, "George", "Michael", LocalDate.of(1963, 6, 25), 62f, 1.83f));
        patientMap.put(9889, new Patient(9889, "Billy", "Corgan", LocalDate.of(1967, 3, 17), 65f, 1.87f));
        patientMap.put(9888, new Patient(9888, "Alicia", "Keys", LocalDate.of(1981, 1, 25), 60f, 1.68f));
        patientMap.put(9887, new Patient(9887, "James", "Hetfield", LocalDate.of(1963, 8, 3), 70f, 1.85f));
        patientMap.put(9886, new Patient(9886, "Joe", "Cocker", LocalDate.of(1944, 5, 20), 75f, 1.80f));
        patientMap.put(9885, new Patient(9885, "Jimi", "Page", LocalDate.of(1944, 1, 9), 78f, 1.82f));
        patientMap.put(9884, new Patient(9884, "Etta", "James", LocalDate.of(1938, 1, 25), 83f, 1.65f));
        patientMap.put(9883, new Patient(9883, "Tom", "Petty", LocalDate.of(1950, 10, 20), 72f, 1.78f));
        patientMap.put(9882, new Patient(9882, "Elton", "John", LocalDate.of(1947, 3, 25), 74f, 1.73f));
        patientMap.put(9881, new Patient(9881, "Gwen", "Stefani", LocalDate.of(1969, 10, 3), 60f, 1.68f));
        patientMap.put(9880, new Patient(9880, "George", "Harrison", LocalDate.of(1943, 2, 25), 75f, 1.78f));
        patientMap.put(9879, new Patient(9879, "Neil", "Diamond", LocalDate.of(1941, 1, 24), 80f, 1.78f));
        patientMap.put(9878, new Patient(9878, "Keith", "Richards", LocalDate.of(1943, 12, 18), 78f, 1.77f));
        patientMap.put(9877, new Patient(9877, "Sade", "", LocalDate.of(1959, 1, 16), 62f, 1.76f));
        patientMap.put(9876, new Patient(9876, "Brian", "May", LocalDate.of(1947, 7, 19), 74f, 1.87f));
        patientMap.put(9875, new Patient(9875, "Celine", "Dion", LocalDate.of(1968, 3, 30), 60f, 1.71f));
        patientMap.put(9874, new Patient(9874, "Tony", "Bennett", LocalDate.of(1926, 8, 3), 95f, 1.70f));
        patientMap.put(9873, new Patient(9873, "Eddie", "Vedder", LocalDate.of(1964, 12, 23), 59f, 1.73f));
        patientMap.put(9872, new Patient(9872, "Phil", "Collins", LocalDate.of(1951, 1, 30), 70f, 1.75f));
        patientMap.put(9871, new Patient(9871, "Shakira", "", LocalDate.of(1977, 2, 2), 64f, 1.57f));
        patientMap.put(9870, new Patient(9870, "Eric", "Clapton", LocalDate.of(1945, 3, 30), 76f, 1.77f));
        patientMap.put(9869, new Patient(9869, "Axl", "Rose", LocalDate.of(1962, 2, 6), 61f, 1.85f));
        patientMap.put(9868, new Patient(9868, "Billy", "Idol", LocalDate.of(1955, 11, 30), 66f, 1.75f));
        patientMap.put(9867, new Patient(9867, "Alanis", "Morissette", LocalDate.of(1974, 6, 1), 58f, 1.63f));
        patientMap.put(9866, new Patient(9866, "Barry", "White", LocalDate.of(1944, 9, 12), 79f, 1.93f));
        patientMap.put(9865, new Patient(9865, "Bob", "Seger", LocalDate.of(1945, 5, 6), 76f, 1.78f));
        patientMap.put(9864, new Patient(9864, "Janet", "Jackson", LocalDate.of(1966, 5, 16), 55f, 1.63f));
        patientMap.put(9863, new Patient(9863, "Bruce", "Dickinson", LocalDate.of(1958, 8, 7), 63f, 1.73f));
        patientMap.put(9862, new Patient(9862, "Freddy", "Mercury", LocalDate.of(1946, 9, 5), 73f, 1.77f));
        patientMap.put(9861, new Patient(9861, "Tina", "Weymouth", LocalDate.of(1950, 11, 22), 71f, 1.70f));
        patientMap.put(9860, new Patient(9860, "Paul", "Weller", LocalDate.of(1958, 5, 25), 63f, 1.80f));
        patientMap.put(9859, new Patient(9859, "Grace", "Jones", LocalDate.of(1948, 5, 19), 73f, 1.75f));
        patientMap.put(9858, new Patient(9858, "Rod", "Stewart", LocalDate.of(1945, 1, 10), 78f, 1.83f));
        patientMap.put(9857, new Patient(9857, "Beyoncé", "", LocalDate.of(1981, 9, 4), 63f, 1.69f));
        patientMap.put(9856, new Patient(9856, "Stevie", "Wonder", LocalDate.of(1950, 5, 13), 68f, 1.80f));
        patientMap.put(9855, new Patient(9855, "Paul", "McCartney", LocalDate.of(1942, 6, 18), 75f, 1.77f));
        patientMap.put(9854, new Patient(9854, "Mick", "Jagger", LocalDate.of(1943, 7, 26), 72f, 1.78f));
        patientMap.put(9853, new Patient(9853, "Madonna", "", LocalDate.of(1958, 8, 16), 60f, 1.64f));
        patientMap.put(9852, new Patient(9852, "Bruce", "Springsteen", LocalDate.of(1949, 9, 23), 70f, 1.79f));
        patientMap.put(9851, new Patient(9851, "Ella", "Fitzgerald", LocalDate.of(1917, 4, 25), 80f, 1.68f));
        patientMap.put(9850, new Patient(9850, "Bob", "Dylan", LocalDate.of(1941, 5, 24), 75f, 1.80f));
        patientMap.put(9849, new Patient(9849, "Adele", "", LocalDate.of(1988, 5, 5), 65f, 1.75f));
        patientMap.put(9848, new Patient(9848, "Freddy", "Fender", LocalDate.of(1937, 6, 4), 73f, 1.72f));
        patientMap.put(9847, new Patient(9847, "Tupac", "Shakur", LocalDate.of(1971, 6, 16), 67f, 1.76f));
        patientMap.put(9846, new Patient(9846, "Lana", "Del Rey", LocalDate.of(1985, 6, 21), 60f, 1.69f));
        //patientMap.put(9845, new Patient(9845, "Kanye", "West", LocalDate.of(1977, 6, 8), 73f, 1.78f));
        patientMap.put(9844, new Patient(9844, "Nina", "Simone", LocalDate.of(1933, 2, 21), 70f, 1.70f));

    }

    {
        //MEDICATION NOTES - BARACK OBAMA
        patientMap.get(9998).getMedNotesList().add(new MedNotes(getMedicationData().getMedicationMap().get(7621), "Behoefte aan focus", LocalDate.of(2023,3,6)));
        patientMap.get(9998).getMedNotesList().add(new MedNotes(getMedicationData().getMedicationMap().get(4590), "Door zijn stressvolle baan heeft meneer behoeft aan wat ontspanning",LocalDate.of(2023,3,6)));
        patientMap.get(9998).getMedNotesList().add(new MedNotes(getMedicationData().getMedicationMap().get(2408), "Gebeten door een hond",LocalDate.of(2023,3,31)));
        patientMap.get(9998).getMedNotesList().add(new MedNotes(getMedicationData().getMedicationMap().get(3451), "virus opgelopen",LocalDate.of(2023,3,31)));

    }

//    {
//        //CONSULT NOTES - BARACK OBAMA
//        patientMap.get(9998).getConsultNotesList().add(new ConsultNotes(ZorgappGUI.getInstance().getUserData().getUserMap().get("S").getConsultList().get(2),"Kankerlijah hebt obesitas wss", LocalDate.of(2023,3,31)));
//        patientMap.get(9998).getConsultNotesList().add(new ConsultNotes(ZorgappGUI.getInstance().getUserData().getUserMap().get("Phy").getConsultList().get(3),"30 minuten shiatzu", LocalDate.of(2022,9,23)));
//        patientMap.get(9998).getConsultNotesList().add(new ConsultNotes(ZorgappGUI.getInstance().getUserData().getUserMap().get("Peter").getConsultList().get(1), "Zonder verdoving door verslavingsgeschiedenis", LocalDate.of(2020,6,2)));
//        patientMap.get(9998).getConsultNotesList().add(new ConsultNotes(ZorgappGUI.getInstance().getUserData().getUserMap().get("S").getConsultList().get(0),"Betonvlinder in oog, gedeeltelijk tijdelijke blindheid", LocalDate.of(2022,1,2)));
//
//
//
//    }

}
