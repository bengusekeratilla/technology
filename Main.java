//Technology isimli bir sınıf oluşturun.
//id, name, programmingLanguageName list, update, delete, add, getById metodlarını yazın.

import pair2.Technology;
import pair2.TechnologyManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TechnologyManager techManager = new TechnologyManager();


        List<Technology> tech = techManager.getAll();
        for (Technology tech1 : tech) {
            System.out.println(tech1.getName());
        }

        System.out.println("----------");

        techManager.delete(2);
        for (Technology tech1 : tech) {
            System.out.println(tech1.getName()); // Unity silinince kalan çıktı oldu.
        }


    }
}