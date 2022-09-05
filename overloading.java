class bot {
    public void speak()  {
        System.out.println("hello");
    }
    public void speak(int a)  {
        for (int i = 0; i < a; i++)  {
            System.out.println(i + " : hello");
        }
    }
}

public class overloading {
    public static void main(String[] args) {
        bot b = new bot();
        b.speak(10);

    }    
}
