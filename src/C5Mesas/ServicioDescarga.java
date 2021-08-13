package C5Mesas;

public class ServicioDescarga implements IServicioDescarga {
    @Override
    public void descargar(int id, String tipoUsuario) {
        System.out.println("Descargando la cancion del usuario nº " + id+ " que es de tipo " + tipoUsuario);
    }
}
