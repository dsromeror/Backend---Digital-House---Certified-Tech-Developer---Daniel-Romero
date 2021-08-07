package Patron_Template_Method;

public class CocineroNoVeggie extends Cocinero{
    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando queso y jamón");
    }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando los ingredientes");
    }
}
