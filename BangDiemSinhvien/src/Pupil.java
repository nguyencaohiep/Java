public class Pupil {
    private String id;
    private String name;
    private String cla;
    private String email;

    public Pupil(String id, String name, String cla, String email) {
        this.id = id;
        String[] str = name.trim().toLowerCase().split("\\s+");
        String tmp = "";
        for(String s : str){
            tmp += (s.charAt(0) + "").toUpperCase() + s.substring(1) + " ";
        }
        this.name = tmp.trim();
        this.cla = cla;
        this.email = email;
    }

    public String getId(){
        return id;
    }
    public String toString(){
        return id + " " + name + " " + cla;
    }
}
