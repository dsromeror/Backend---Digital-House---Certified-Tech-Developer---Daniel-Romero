package C7S;

public class Computador {
    private String id;
    private int ram;
    private int discoDuro;
    public static int instanciasActivas;

    public Computador(String id, int ram, int discoDuro){
        this.id = id;
        this.ram = ram;
        this.discoDuro = discoDuro;
        instanciasActivas++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public void describirse(){
        System.out.println("Computador "+this.id+", RAM= "+this.ram+", DD= "+this.discoDuro);
    }
}
