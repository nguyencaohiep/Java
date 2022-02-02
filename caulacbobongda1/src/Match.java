public class Match implements Comparable<Match>{
    private String id;
    private Integer numberFans;
    private Club cl;

    public Match(String id, Integer numberFans, Club cl) {
        this.id = id;
        this.numberFans = numberFans;
        this.cl = cl;
    }

    public int getTurnover(){ // doanh thu
        return this.cl.getPrice()*this.numberFans;
    }

    public String getName(){
        return this.cl.getName();
    }

    public int compareTo(Match o){
        int t1 = this.getTurnover();
        int t2 = o.getTurnover();
        if(t1 == t2)
            return this.getName().compareTo(o.getName());
        else if(t1 < t2 )
            return 1;
        else
            return -1;
    }

    public String toString(){
        return id + " " + cl.getName() + " " + getTurnover();
    }
}
