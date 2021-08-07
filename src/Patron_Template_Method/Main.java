package Patron_Template_Method;

public class Main {
    public static void main(String[] args) {
        Cocinero cocineroVeggie = new CocineroVeggie();
        Cocinero cocineroNoVeggie = new CocineroNoVeggie();

        cocineroVeggie.hacerPizza();
        System.out.println("------------------------------------");
        cocineroNoVeggie.hacerPizza();
    }
}
