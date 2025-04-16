
class DataType {
    private byte e;
    private int a;
    private char b;
    private String c;
    private boolean d; //
    private float f;
    private double g;

    //constructor
    public DataType(byte e, int a, char b, String c, boolean d, float f, double g) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
    }

    public void displayInfo(){
        System.out.println("Byte : " + e);
        System.out.println("Integer : " + a);
        System.out.println("Character : " + b);
        System.out.println("String : " + c);
        System.out.println("Boolean : " + d);
        System.out.println("Float : " + f);
        System.out.println("Double : " + g);

    }
}

public class dataTypeObject {
    public static void main(String[] args){
        DataType dt = new DataType(
                (byte) 10,   // byte e
                100,         // int a
                'A',         // char b
                "Bonjour",   // String c
                true,        // boolean d
                3.14f,       // float f
                99.99        // double g
        );

    dt.displayInfo();
    }
}
