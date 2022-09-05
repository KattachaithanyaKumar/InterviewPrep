class A {
    public void say()  {
        System.out.println("Hello");
    }
}

class B extends A {
    public void say()  {
        System.out.println("world");
    }
}


public class test {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");

        System.out.print(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
