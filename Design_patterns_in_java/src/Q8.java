// Q8 Implement proxy design for accessing Record of a student and allow the access only to Admin.


interface  access{
    void get_access();
}

class person{
    private  String type;

    public person(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class student_record implements access{
    protected person p;

    public student_record(person p) {
        this.p = p;
    }

    @Override
    public void get_access() {
        System.out.println("You can access the record of the students .....");
    }
}

class student_record_proxy extends student_record{
    public student_record_proxy(person p) {

        super( p );
    }
    @Override
    public void get_access() {
        if(p.getType()=="admin"){
            System.out.println("Permission to view the records of the students Granted....");
            super.get_access();
        }
        else {
            System.out.println("Permission to view the records of the students failed....");
        }

    }
}

public class Q8 {
    public static void main(String[] args) {
        student_record s1=new student_record(new person ("student"));
        student_record_proxy s2=new student_record_proxy(new person ("student"));
        s1.get_access();
        System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
        s2.get_access();

//        person s3= new person("student");
//        student_record s4= new student_record(s3);
//        s4.get_access();


    }
}
