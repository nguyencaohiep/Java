public class MonHoc {
    private String ten, ma;

    public MonHoc(String data) {
        String[] arr = data.trim().split("\\s+");
        this.ma = arr[0];
        this.ten = "";
        for (int i = 1; i < arr.length; i++) {
            this.ten += arr[i] + " ";
        }
    }
}
