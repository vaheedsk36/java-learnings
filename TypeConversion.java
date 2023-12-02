// Type conversion

public class TypeConversion {
    public static void main(String[] args){
        int a = 123;
        byte b = 127;
        System.out.println("Implicit type conversion");
        System.out.println(a);
        System.out.println(b);
        a = b;
        System.out.println(a);
        System.out.println("Explicit type conversion");
        int c = 129;
        byte d = 127;
        System.out.println(c);
        System.out.println(d);
        d = (byte)c;
        System.out.println(d);
    }
    
}
