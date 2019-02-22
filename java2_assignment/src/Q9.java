abstract public class Q9 {
    public abstract void fire_test();
    public abstract void stress_test();

    public Q9(){
        System.out.println("Object of Abstract class created");
    }
}
class wooden_chair_table extends Q9{
    public void fire_test(){
        System.out.println("Fire test Done successfully for wooden_chair and wooden_table");
    }
    public void stress_test(){
        System.out.println("Stress test Done successfully for wooden_chair and wooden_table");
    }
}
class metal_chair_table extends Q9{
    public void fire_test(){
        System.out.println("Fire test Done successfully for metal_chair and metal_table");
    }
    public void stress_test(){
        System.out.println("Stress test Done successfully for Metal_chair and metal_table");
    }
}

class Main9{
    public static void main(String[] args) {
        wooden_chair_table sample1=new wooden_chair_table();
        metal_chair_table sample2=new metal_chair_table();
        sample1.fire_test();
        sample1.stress_test();
        sample2.fire_test();
        sample2.stress_test();
    }
}
