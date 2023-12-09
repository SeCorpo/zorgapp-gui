package sem.zorgapp.java_zorgapp_gui_sem_2.data;

import sem.zorgapp.java_zorgapp_gui_sem_2.backend.User;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.person.Dentist;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.person.Doctor;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.person.Person;
import sem.zorgapp.java_zorgapp_gui_sem_2.backend.person.Physiotherapist;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class UserData {

    private Map<String, User> userMap = new HashMap<>();
    public Map<String, User> getUserMap() {
        return userMap;
    }

    {
        User user = new User("Joe", "password", "USER", "Joseph", "Gustavo", LocalDate.now());
        userMap.put(user.getUsername(), user);

        userMap.put("Peter", new Dentist("Peter", "Peter#123", "DMD", "Peter", "Rensink", LocalDate.of(1998,1,15)));
        userMap.put("S", new Doctor("S", "S", "MD", "S", "S", LocalDate.of(1999,9,9)));
        userMap.put("Phy", new Physiotherapist("Phy", "sio", "Physio","Piet", "Zwart", LocalDate.of(1977, 5, 5)));

    }

}
