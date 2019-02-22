//WAP to convert seconds into days, hours, minutes and seconds.
public class Q7 {
    public static void main(String[] args) {


        long sec = 864080999;
        int days = (int) sec / (60 * 60 * 24);
        int rem_sec = (int) sec % (60 * 60 * 24);
        int hrs = rem_sec / (60 * 60);
        int rem_hr_sec=rem_sec % (60 * 60);
        int min = (rem_hr_sec) / 60;
        int s = (rem_hr_sec) % 60;
        System.out.println(sec + " Seconds = "+ days + " Days " + hrs +" Hours " + min+" Minutes " + s+" seconds " );


    }

}
