public class Worker {
    private int id;
    private String fullName;
    private String gender;
    private String dateOfBirth;
    private String adddress;
    private String taxCode;
    private String dateSign;


    public Worker(int id, String fullName, String gender, String dateOfBirth, String adddress, String taxCode,
                  String dateSign) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = setDate(dateOfBirth);
        this.adddress = adddress;
        this.taxCode = taxCode;
        this.dateSign = setDate(dateSign);
    }

    public String convertDateOfBirth() {
        String[] tmp = dateOfBirth.split("/");
        return tmp[2] + "/" + tmp[1] + "/" + tmp[0];
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String setDate(String in) {
        String[] tmp = in.split("/");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - tmp[i].length(); j++) {
                tmp[i] = "0" + tmp[i];
            }
        }
        return tmp[0] + "/" + tmp[1] + "/" + tmp[2];
    }

    public String toString() {
        return String.format("%115d %s %s %s %s %s %s ", id, fullName, gender, dateOfBirth, adddress, taxCode, dateSign);
    }
}
/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha No
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
 */