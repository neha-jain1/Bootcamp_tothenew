
public class Q3 {
    public static void main(String[] args) {
//        sample_class onj=new sample_class();
//        System.out.println("Object created successfully");

        try{
            Class.forName("ABC");
        }
        catch (ClassNotFoundException e){
            System.out.println("The accessed class does not exist");
        }
    }
}

