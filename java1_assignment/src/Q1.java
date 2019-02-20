import java.*;
import java.lang.reflect.Array;
import java.util.*;


public class Q1 {

   public  void replace_str() {
       System.out.println("Replacing Substring");
       String s1;
       String s = new String("Java Class");
       System.out.println("Original String " + s);
       s1 = (s.replaceAll("Clas", "Lecture"));
       System.out.println("New String " + s1);
   }

}

class Q2{
    public void count_occurrence (){
        String s=new String("it is as it is");
        List <String> arr= Arrays.asList(s.split(" "));
        Set <String> word=new HashSet<String>(arr);
        for (String w: word) {
            if(Collections.frequency(arr, w) >1)
            System.out.println(w + " " + Collections.frequency(arr, w) );
        }
    }
}

class Q3{

    public void count_char(){
        int c=0;
        String s=new String("smileandshine");
        System.out.println("Enter the character to be searched");
        Scanner sc= new Scanner(System.in);
        char ch= sc.next().charAt(0);
        int cc=count(s,0, c,ch);
        System.out.println("Number of occurrences of "+ ch + " is " + cc);

    }
    public int count(String s, int start, int c , char ch){
        if (s.indexOf(ch, start) == (-1))
        return c;
        if(s.indexOf(ch, start)<= start)
        {
            System.out.println(s.indexOf(ch, start));
            c++;}
        return count(s,start +1,c, ch);

    }
}

class Q4{
    public void percentage (){
        System.out.println("Enter the String");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length();
        int lower=0;
        int upper=0;
        int digit=0;
        int special=0;
        for (int i =0; i<l;i++){
            int temp= (int )str.charAt(i);
            if((temp>=65) && (temp<=90))
                upper++;
            else if ((temp>=97) && (temp<=122))
                lower++;
            else if ((temp>=48) && (temp<=57))
                digit++;
            else
                special++;
        }
        System.out.println("The number and percentage are as follows :");
        System.out.println("UpperCase Letters :"+ upper + " and " + ((float)(upper*100)/l) + "%");
        System.out.println("lowerCase Letters :"+ lower + " and " + ((float)(lower*100)/l) + "%");
        System.out.println("Digits :"+ digit + " and " + ((float)(digit*100)/l) + "%");
        System.out.println("Special Case Char :"+ special + " and " + ((float)(special*100)/l) + "%");

    }
}

class Q5{
    public void common_elements(){
        int[] arr1=new int[]{1,2,2,3,4,5};
        int [] arr2=new int[]{2,2,3,5};
        int i=0;
        int j=0;
        while( i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j])
                i++;
            else if(arr1[i]>arr2[j])
                j++;
            else{
                System.out.print(arr1[i]+" ");
                j=j+1;
                i=i+1;
            }
        }
    }
}

class Q6{
    public void unique(){
        int[] arr=new int[] {1,2,1,2,4,4,5,5,6};
        int num=0;
        for (int i =0; i<arr.length ; i++){
            num=num ^ arr[i];
        }
        System.out.println("Unique number Present is " + num);
    }
}

class Q7{
    // using static variables
    static String FirstName=new String();
    static String LastName=new String();
    static int age;
    public Q7(String FirstName, String LastName , int age){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.age=age;
    }
    public void print_info(){
        System.out.println("The information of specified Student is :");
        System.out.print( FirstName +" "+ LastName+ " "+ age);

    }
    // using static method
    public static void  info(){
        System.out.println("The information of specified Student is :");
        System.out.print( FirstName +" "+ LastName+ " "+ age);
    }
}

class Q8{
    public void reverse_string(){
        StringBuffer sb=new StringBuffer();
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        sb.append(s);
        StringBuffer temp=new StringBuffer(sb.reverse());
        System.out.println("Final String is "+ temp.delete(4,9));

    }
}



class Q10{
    public void add (int a,int b){
        int c=a+b;
        System.out.println("Sum of int:"+ c);
    }
    public void add (Integer a,Integer b){
        Integer c=a+b;
        System.out.println("Sum of Integers :"+ c);
    }
    public void add (float a,float b){
        float c=a+b;
        System.out.println("Sum :"+ c);
    }
    public void multiply (int a,int b){
        int c=a*b;
        System.out.println("Product :"+ c);
    }
    public void multiply (float a,float b){
        float c=a*b;
        System.out.println("Product :"+ c);
    }
    public void concat (String a,String b){
        String c=a+b;
        System.out.println("String after Concatination :"+ c);
    }
    public void concat (String a,String b, String c){
        String d= a +b+c;
        System.out.println("String after Concatination :"+ d);
    }
}


class Q9{
    public enum home_price{
      house1(100000),house2(200000),house3(300000);
      private Integer price;
      home_price(Integer price){
          this.price=price;
      }
      public Integer getPrice(){
          return price;
      }
    }
    public void house_price(){
            home_price[] houses = home_price.values();
            for (home_price h : houses ){
            System.out.println(h +"    "+ (h.getPrice().toString()) );
            }

    }
}
// Question 10
class bankname {
    String name;
    bankname(String name) {
        this.name = name;
    }
    public  void getdetails(){
        System.out.print("Bank Name " + name);
        this.getdetails();
    }
}
class sbi extends bankname{
    int roi;
    int turnover;
    sbi(String bank_name, int roi,int turnover){
        super(bank_name);
        this.roi=roi;
        this.turnover=turnover;
    }
    public  void getdetails(){
        System.out.print("ROI " + roi +" % " + turnover);
        System.out.println();
    }
}
class icici extends bankname{
    int roi;
    int turnover;
    icici(String bank_name, int roi,int turnover){
        super(bank_name);
        this.roi=roi;
        this.turnover=turnover;
    }
    public  void getdetails(){
        System.out.print("ROI " + roi +" % " + turnover);
        System.out.println();
    }
}
class boi extends bankname{
    int roi;
    int turnover;
    boi(String bank_name, int roi,int turnover){
        super(bank_name);
        this.roi=roi;
        this.turnover=turnover;
    }
    public  void getdetails(){
        System.out.print("ROI " + roi +" % " + turnover);
        System.out.println();
    }
}