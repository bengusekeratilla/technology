package pair2;

public class Technology {


    private int id;
    private String name;
    private String programmingLanguageName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgrammingLanguageName() {
        return programmingLanguageName;
    }

    public void setProgrammingLanguageName(String programmingLanguageName) {
        this.programmingLanguageName = programmingLanguageName;
    }

    public Technology(int id, String name, String programmingLanguageName){
        this.id=id;
        this.name=name;
        this.programmingLanguageName=programmingLanguageName;
    }

    public Technology(){

    }

}
