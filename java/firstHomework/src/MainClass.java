public class MainClass {
    private static int class_number = 20;
    private static String class_string = "Hello, World";


    public static void main (String[] args)
    {
        int x = getLocalNumber();
        int y = getClassNumber();
        System.out.println(x);
        System.out.println(y);
        System.out.println(getClassString().contains("Hello"));
        System.out.println(getClassString().contains("hello"));

    }

    public static int getLocalNumber() {
        return 14;
    }

    public static int getClassNumber() {
        return class_number;
    }

    public static String getClassString()
    {
        return class_string;
    }
}
