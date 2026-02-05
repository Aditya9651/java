public class constructor {
    int id;
    String name;

    constructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        constructor c1 = new constructor(1, "aditya");
        constructor c2 = new constructor(2, "billu");
        c1.display();
        c2.display();
    }
}
