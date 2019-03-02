// Q2 Implement Factory Pattern to get the Polygon of differnt type.`

interface get_polygon{
    public void getting_polygon();
}

class pentagon implements get_polygon{
    @Override
    public void getting_polygon(){

        System.out.println("Getting Pentagon");
    }
}

class hexagon implements get_polygon{
    @Override
    public void getting_polygon() {

        System.out.println("Getting Hexagon");
    }
}
class heptagon implements get_polygon{
    @Override
    public void getting_polygon() {

        System.out.println("Getting Heptagon");
    }
}
class Polygon{
    get_polygon polygon;
    public get_polygon getPolygon() {

        return polygon;
    }

    public void setPolygon(get_polygon polygon) {

        this.polygon = polygon;
    }
}

class Polygon_Factory{
    static Polygon get_polygon(int side){
        Polygon polygon= new Polygon();
        switch (side){
            case 5:
                polygon.setPolygon(new pentagon());
                break;
            case 6 :
                polygon.setPolygon(new hexagon());
                break;
            case 7:
                polygon.setPolygon(new heptagon());

        }
        return polygon;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Polygon obj1 = Polygon_Factory.get_polygon(5);
        obj1.getPolygon().getting_polygon();

        Polygon obj2 = Polygon_Factory.get_polygon(7);
        obj2.getPolygon().getting_polygon();

    }
}
