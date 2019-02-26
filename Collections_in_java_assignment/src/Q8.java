// Q8 Write a program to format date as example "21-March-2016"
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Q8 {
    public static void main(String[] args) throws FileNotFoundException {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy : "+strDate);
        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy : "+strDate);
    }
}
