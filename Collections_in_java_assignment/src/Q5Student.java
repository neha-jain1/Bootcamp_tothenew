import java.util.Arrays;
import java.lang.*;
import java.util.Comparator;
public class Q5Student {
    String name;
    int age;
    int score;
    Q5Student(String name, int age, int score){
        this.name=name;
        this.age= age;
        this.score= score;
    }
    public int getScore(){
        return this.score;
    }
    public String getname(){
        return this.name;
    }
    public static Comparator<Q5Student> Score_Name_Comparator = new Comparator<Q5Student>() {
        @Override
        public int compare(Q5Student s1, Q5Student s2) {
            int flag = s1.getScore() - s2.getScore();
            if(flag==0)
                flag = s1.getname().compareTo(s2.getname());
            return flag;
        }
    };
    public String toString(){
        return " [name=" + this.name + ", age=" + this.age + ", salary=" + this.score + "]";
    }
}
class main5{
    public static void main(String[] args) {
        Q5Student[] students=new Q5Student[4];
        students[0]=new Q5Student("Arun", 24, 90);
        students[1]=new Q5Student("Arnav", 26, 70);
        students[2]=new Q5Student("Kanak", 25, 55);
        students[3]=new Q5Student("Daksh", 23, 55);
        Arrays.sort(students, Q5Student.Score_Name_Comparator);
        System.out.println(Arrays.toString(students));
    }
}

