// Parent class Library
abstract public class Q1 {
    public static int book_id;
    abstract  public void  student_info(int sid, String name, int age);
    public  void borrow(int book_id){
        this.book_id=book_id;
    }
}
// Child Class Student
class student extends Q1{
    int sid;
    String name;
    int age;

    @Override
    public void student_info(int sid, String name, int age) {
        this.sid=sid;
        this.name=name;
        this.age=age;
    }
    @Override
    public void borrow(int book_id) {
        super.borrow(book_id);
        System.out.println("The book with borrow id "+ book_id +" is issued to "+ name +" successfully");
    }
}

class main1{
    public static void main(String[] args) {
        student s=new student();
        s.student_info(12,"Neha jain", 20);
        s.borrow(2345);
    }
}