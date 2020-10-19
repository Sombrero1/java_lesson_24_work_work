import java.util.ArrayList;
import java.util.StringTokenizer;

public class Shirt {
    private String number;
    private String name;
    private String color;
    private String size;

    public Shirt(String number, String name, String color, String size) {
        this.number = number;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public static Shirt [] toObject(String []shirt){
        Shirt [] res= new Shirt[shirt.length];

        for (int i = 0; i < res.length ; i++) {
            StringTokenizer reg=new StringTokenizer(shirt[i],",");
            res[i]=new Shirt(reg.nextToken(),reg.nextToken(),reg.nextToken(),reg.nextToken());

        }




        return res;
    };

    @Override
    public String toString() {
        return "Shirt{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
