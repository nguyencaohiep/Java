public class Words {
    private String content;
    private int len;

    public Words(String content, int len) {
        this.content = content;
        this.len = len;
    }

    public String getContent() {
        return content;
    }

    public int getLen() {
        return len;
    }

    public String toString() {
        return content + " " + len;
    }
}
