public class Surchage {

    public String somme(int x, int y) {
        return "int x + int y = " + (x + y);
    }

    public String somme(double x, double y) {
        return "double x + double y = " + (x + y);
    }

    public String somme(float x, float y) {
        return "float x + float y = " + (x + y);
    }

    public String somme(double x, float y) {
        return "double x + float y = " + (x + y);
    }

    public static void main(String[] args) {
        Surchage obj = new Surchage();

        String s1 = obj.somme(10, 20);
        String s2 = obj.somme(10.0, 20.0);
        String s3 = obj.somme(10.0f, 20.0f);
        String s4 = obj.somme(10.0, 20.0f);
      
        

        System.out.println("s1 = " + s1 + "\ns2 = " + s2);
        System.out.println("s3 = " + s3 + "\ns4 = " + s4);
        
    }
}