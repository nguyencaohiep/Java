import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Long> a = new LinkedHashSet<Long>();
        List<Long> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            String string = sc.nextLine();
            if (string.equals(""))
                break;
            String[] tmp = string.trim().split("\\s+");
            for (String t : tmp) {
                if (check(t)) {
                    long l = Long.parseLong(t);
                    a.add(l);
                    list.add(l);
                }
            }
        }
        List<Long> aList = new ArrayList<>(a);
        List<Number> arr = new ArrayList<>();
        for (int i = 0; i < aList.size(); i++) {
            long t = aList.get(i);
            int cou = count(list, t);
            Number number = new Number(t, cou, i);
            arr.add(number);
        }
        arr.sort(((o1, o2) -> {
            int c1 = o1.getCou();
            int c2 = o2.getCou();
            int ind1 = o1.getInd();
            int ind2 = o2.getInd();
            if (c1 == c2)
                return Integer.compare(ind1, ind2);
            else
                return Integer.compare(c1, c2) * -1;
        }));
        for (Number number : arr) {
            System.out.println(number);
        }
        sc.close();
    }

    public static boolean check(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            int s1 = (int) (str.charAt(i));
            int s2 = (int) (str.charAt(i + 1));
            if (s1 > s2)
                return false;
        }
        return true;
    }

    public static int count(List<Long> a, long t) {
        int count = 0;
        for (Long l : a) {
            if (t == l)
                count++;
        }
        return count;
    }
}
/*
123 321 23456 123 123 23456 3523 123 321
4567 8988 78 7654 9899 3456 123 678
999 78 3456 987654321 4546 63543 4656
13432 4563 123471 659837 454945 34355
9087 9977 98534 3456 23134
 */