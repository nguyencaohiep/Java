public class Word {
    private String content;
    private int cnt;

    public Word(String content, int cnt) {
        this.content = content;
        this.cnt = cnt;
    }

    public int getCnt(){
        return cnt;
    }

    public String getContent(){
        return content;
    }

    public String toString(){
        return content+" "+cnt;
    }
}
