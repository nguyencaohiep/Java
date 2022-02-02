import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Date dateOfBirth;

    public Person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String toString() {
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        dateOfBirth = dateFormat.format(dateOfBirth);
        return name;
    }
}
