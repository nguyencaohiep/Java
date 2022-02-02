import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name = "";
    private String role;
    private String number;
    private String wage;//bậc lương

    public Employee(String name, String role, String number, String wage) {
        this.name = chuanHoa(name);
        this.role = role;
        this.number = number;
        this.wage = wage;
    }

    private String chuanHoa(String name) {
        String res = "";
        String[] ten = name.trim().split("\\s+");
        for (String i : ten) {
            res += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        return res;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getWage() {
        return wage;
    }

    public static void findByName(String name, List<Employee> arr) {
        List<Employee> a = new ArrayList<>(arr);
        String tmp = name.toLowerCase();
        for (Employee employee : a) {
            String n = employee.getName().toLowerCase();
            if (n.contains(tmp))
                System.out.println(employee);
        }
    }

    public String toString() {
        return name + role + " " + number + " " + wage;
    }
}
