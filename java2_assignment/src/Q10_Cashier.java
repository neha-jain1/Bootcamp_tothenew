class barista {
    static int token=0;
    barista(){
        token++;
        System.out.println("Order under process");
    }

}
public class Q10_Cashier extends barista {
    int payment;
    String order;
    Q10_Cashier(int payment,String order){
        this.payment=payment;
        this.order=order;
    }
    private int getToken(){
        return this.token;
    }
}
class customer extends Q10_Cashier{
    String name;
    customer(String name, int payment,String order){
        super(payment,order);
        this.name=name;
    }
}
class main19{
    public static void main(String[] args) {
        customer c1=new customer("Neha",100, "Cold Coffee");
        System.out.println(c1.name+" with order_id "+barista.token + " order_name " +c1.order+" recieved successfully");
//        System.out.println("Order received successfully");
    }
}