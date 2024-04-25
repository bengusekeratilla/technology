package pair2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TechnologyManager {

    private List<Technology> technologies;

    public TechnologyManager() {
        technologies = new ArrayList<>();

        technologies.add(new Technology(1, "Angular", "C#"));
        technologies.add(new Technology(2, "Unity", "C++"));

    }

    public void add(Technology technology) {
        technologies.add(technology);
    }

    public List<Technology> getAll() {
        return technologies;
    }

    public void updatedtechnology(Technology technology) {
        for (Technology updateTech : technologies) {
            if (updateTech.getId() == technology.getId()) {
                updateTech.setName(technology.getName());
            }
        }

    }

    public Technology getById(int id) {
        for (Technology listTech : technologies) {
            if (listTech.getId() == id) {
                return listTech;
            }
        }
        return null;
    }

    public void delete(int id) {
        Iterator<Technology> iterator = technologies.iterator();
        while (iterator.hasNext()) {
            Technology delTech = iterator.next(); //delTech index'i atadım.
            if (delTech.getId() == id) {
                iterator.remove();
            }
        }
    }
}

