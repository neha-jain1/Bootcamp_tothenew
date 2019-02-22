import java.util.*;
class Q8read_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        String t = "";
        System.out.println("Enter something");
        Q8read_words r = new Q8read_words();
        do {
            t = sc.next();
            if(t.equals("done")){
                break;
            }
            int j = t.length();
            if (t.charAt(0) == t.charAt(j - 1)) {
                System.out.println("The First and last character of the entered string is same");
            } else {
                System.out.println("The First and last character of the entered string is not same");
            }
            System.out.println("Enter something more");
        } while (!t.equals("done"));
    }
}
