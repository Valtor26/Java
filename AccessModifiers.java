/* 
🔒 private → only inside the same class
📦 default → anywhere in the same package
🛡️ protected → same package + subclasses outside the package
🌍 public → everywhere
*/


import packs.A;




public class AccessModifiers {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.marks);
        
        Bbee obj1 = new Bbee();
        System.out.println(obj1.marks);

    }
}
