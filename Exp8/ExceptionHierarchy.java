class A extends Exception {
    void display() throws A {
        throw new A();
    }
}
class B extends A {
    @Override
    void display() throws B {
        throw new B();
    }
}
class C extends B {
    @Override
    void display() throws C {
        throw new C();
    }
}
public class ExceptionHierarchy {
    public static void main(String[] args) {
        System.out.println("Twarit, 24csu331");
        try {
            A obj = new C();
            obj.display(); 
        } 
        catch (C e) {
            System.out.println("Caught Exception from class C");
        } 
        catch (B e) {
            System.out.println("Caught Exception from class B");
        } 
        catch (A e) {
            System.out.println("Caught Exception from class A");
        }
    }
}


