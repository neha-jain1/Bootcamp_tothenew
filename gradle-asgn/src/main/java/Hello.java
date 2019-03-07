import org.apache.commons.lang3.StringUtils;


public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello class executed");
        test obj= new test();
        System.out.println(obj.s);
       String var= StringUtils.capitalize("abc");
        System.out.println(var);
    }
}