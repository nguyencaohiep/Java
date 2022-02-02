import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        String tmp = sc.nextLine();
        for(Character c : tmp.toCharArray()){
            if(c == '<'){
                if(!left.empty()){
                    right.push(left.pop());
                }
            }
            else if(c == '>'){
                if(!right.empty()){
                    left.push(right.pop());
                }
            }
            else if(c == '-'){
                if(!left.empty()){
                    left.pop();
                }
            }
            else{
                left.push(c);
            }
        }

        while(!right.empty()){
            left.push(right.pop());
        }

        StringBuilder res = new StringBuilder();

        while(!left.empty()){
            res.append(left.pop());
        }
        System.out.println(res.reverse().toString());
        sc.close();
    }
}