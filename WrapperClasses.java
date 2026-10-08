public class WrapperClasses {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; // autoboxing
        System.out.println(b);

        int c = b; // autounboxing
        System.out.println(c+4);


        String str = "26";

        int x = Integer.parseInt(str);
        System.out.println(x);
    }
}
