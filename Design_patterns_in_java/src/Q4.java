// Q4 Implement Builder pattern to create a student object with more than 6 fields.

class Student{
    private String name;
    private Integer age;
    private Integer sid;
    private String gender;
    private String course;
    private String branch;
    private String club_associated_with;

     public Student(Student_builder student_builder){
        sid=student_builder.getSid();
        name=student_builder.getName();
        age=student_builder.getAge();
        gender=student_builder.getGender();
        course=student_builder.getCourse();
        branch=student_builder.getBranch();
        club_associated_with= student_builder.getClub_associated_with();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getClub_associated_with() {
        return club_associated_with;
    }

    public void setClub_associated_with(String club_associated_with) {
        this.club_associated_with = club_associated_with;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sid=" + sid +
                ", gender='" + gender + '\'' +
                ", course='" + course + '\'' +
                ", branch='" + branch + '\'' +
                ", club_associated_with='" + club_associated_with + '\'' +
                '}';
    }
}

class Student_builder{
    private String name;
    private Integer age;
    private Integer sid;
    private String gender;
    private String course;
    private String branch;
    private String club_associated_with;

    public Student_builder(String name, Integer age){
        this.name=name;
        this.age=age;
    }

    public Integer getAge() {
        return age;
    }

    public  Student_builder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public  Student_builder setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getSid() {
        return sid;
    }

    public  Student_builder with_student_id(Integer sid) {
        this.sid= sid;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public  Student_builder having_gender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public  Student_builder of_course(String course) {
        this.course =course;
        return this;
    }

    public String getBranch() {
        return branch;
    }

    public  Student_builder of_branch(String branch) {
        this.branch=branch;
        return this;
    }

    public String getClub_associated_with (){
        return club_associated_with;
    }

    public  Student_builder namesof_club_associated_with(String club_associated_with) {
        this.club_associated_with = club_associated_with;
        return this;
    }
    public Student build() {
        return new Student(this);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Student student= new Student_builder("Neha",21)
                .with_student_id(121)
                .having_gender("Female")
                .namesof_club_associated_with("Literary")
                .of_course("B.tech")
                .of_branch("CSE")
                .build();
        System.out.println(student);
    }
}
