// Q5 Implement Bridge Design Pattern for Color and Shape
// such that Shape and Color can be combined together e.g BlueSquare, RedSquare, PinkTriangle etc.


// Implementor
interface colour {
    String getcolourtype();
}

// Concrete Implementor
class blue implements colour{
    @Override
    public String getcolourtype() {

        return "Blue";
    }
    public String toString(){
        return "Blue";
    }
}
// Concrete Implementor
class pink implements colour{
    @Override
    public String getcolourtype() {

        return "Pink";
    }
    public String toString(){
        return "Pink";
    }
}

// Abstraction
abstract class shape {
    String shapetype;
    colour colourtype;

    public shape(String shapetype, colour colourtype) {
        this.shapetype = shapetype;
        this.colourtype = colourtype;
    }
}

// Refined Abstraction
class triangle extends shape {
    public triangle(String shapetype, colour colourtype) {

        super(shapetype,colourtype);
    }

    @Override
    public String toString() {
        return "triangle{" +
                "shapetype='" + shapetype + '\'' +
                ", colourtype=" + colourtype +
                '}';
    }
}

// Refined Abstraction
class square extends shape {
    public square(String shapetype, colour colourtype) {

        super(shapetype,colourtype);
    }

    @Override
    public String toString() {
        return "square{" +
                "shapetype='" + shapetype + '\'' +
                ", colourtype=" + colourtype +
                '}';
    }
}

class Q5 {
    public static void main(String[] args) {

        square obj1= new square("Square",new blue() );
        triangle obj2= new triangle("Triangle", new pink());

        System.out.println(obj1);
        System.out.println(obj2);


    }
}
