class shape {
    int sides;
}

class box extends shape {
    box()  {
        this.sides = 4;
    }
}

class triangle extends shape {
    triangle()  {
        this.sides = 3;
    }
}


public class inherit {
    public static void main(String[] args) {
        box b = new box();
        triangle t = new triangle();

        System.out.println(b.sides);
        System.out.println(t.sides);
    }
}
