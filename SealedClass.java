/*
    Sealed Class: A sealed class is a class that cannot be subclassed without giving permission to the subclass.

    The subclasses of a sealed class must be declared as final/sealed/non-sealed.
*/


sealed class A permits B,C{

}

final class B extends A{

}

non-sealed class C extends A{

}

sealed interface X permits Y{

}

non-sealed interface Y extends X{

}




public class SealedClass {
    public static void main(String[] args) {

    }
}
