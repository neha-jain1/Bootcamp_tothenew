// Q7 Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(),
// isFull() and an additional operation getMin()
// which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
import java.util.*;
class SpecialStack{
    static final int size= 10;
    private  int min_element= Integer.MAX_VALUE;
    private  LinkedList<Integer> l= new LinkedList<>();
    private  LinkedList<Integer> temp= new LinkedList<>();
    void push(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to entered");
        int val= sc.nextInt();
        if(val< min_element){
            min_element=val;
        }
        else{min_element= min_element;}
        l.push(val);
        temp.push(min_element);
    }
    void pop(){
        l.pop();
        temp.pop();
    }
    int mininum_element(){
        return temp.getFirst();
    }
    Boolean isfull(){
        if(l.size()==size){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
    Boolean is_empty(){
        if(l.isEmpty()){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
    String view_stack(){
        return l.toString();
    }
    String view_templist(){
        return  temp.toString();
    }
}
public class Q7 {

    public static void main(String[] args) {
        SpecialStack s=new SpecialStack();
        s.push();
        s.push();
        s.push();
        s.push();
        s.pop();
        System.out.println("Minimum element is "+s.mininum_element());
        System.out.println(s.view_stack());
        System.out.println(s.view_templist());
        System.out.println("Minimum Element is "+ s.mininum_element());
        System.out.println("Is the stack empty  "+ s.is_empty());
        System.out.println("Is the stack full  "+ s.isfull());

    }
}

