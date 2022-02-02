public class Pupil{
    private String id;
    private String name;
    private String cla;
    private String mail;

    public Pupil(String id, String name, String cla, String mail) {
        this.cla = cla;
        String[] line = name.trim().toLowerCase().split("\\s+");
        String tmp = "";
        for(String str : line){
            tmp += (str.charAt(0) + "").toUpperCase() + str.substring(1) + " ";
        }
        this.name = tmp.trim();
        this.id = id;
        this.mail = mail;
    }

    public String getId(){
        return id;
    }

    public String toString() {
        return id + " " + name + " " + cla + " " + mail;
    }
}
