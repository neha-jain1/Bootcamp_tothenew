import java.text.DateFormat;
import java.time.chrono.JapaneseDate;
import java.util.*;

public class Q9 {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        System.out.println("Today is : "+ d1.toString());
        Locale loc1 = new Locale("it");
        Locale loc2= new Locale("cs");
        Locale loc3= new Locale("ja_JP_JP");
        DateFormat df1 = DateFormat.getDateInstance (DateFormat.FULL, loc1);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,loc2);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,loc3);
        System.out.println("Today is : "+ df1.format(d1));
        System.out.println("Today is : "+ df2.format(d1));
        System.out.println("Today is : "+ df3.format(d1));
    }
}