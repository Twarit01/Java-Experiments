interface X {
    void methodX();
}

interface Y {
    void methodY();
}
interface Z extends X, Y {
    void methodZ();
}

class Demo implements Z {
    public void methodX() {
        System.out.println("Method from interface X");
    }

    public void methodY() {
        System.out.println("Method from interface Y");
    }

    public void methodZ() {
        System.out.println("Method from interface Z");
    }
}

public class TestC {
    public static void main(String[] args) {
        System.out.println("Twarit,24csu331");
        Demo obj = new Demo();
        obj.methodX();
        obj.methodY();
        obj.methodZ();
    }
}
