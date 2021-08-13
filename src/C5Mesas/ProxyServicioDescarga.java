package C5Mesas;

public class ProxyServicioDescarga implements IServicioDescarga {
    @Override
    public void descargar(int id, String tipoUsuario) {
        boolean comprobar = comprobarUsuario(tipoUsuario);

        if(comprobar){
            ServicioDescarga servicioDescarga= new ServicioDescarga();
            servicioDescarga.descargar(id, tipoUsuario);
        }else{
            System.out.println("El usuario no tiene acceso a las descargas");
        }
    }

    private boolean comprobarUsuario(String tipoUsuario) {
        return tipoUsuario=="premium";
    }
}
