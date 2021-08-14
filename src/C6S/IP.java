package C6S;

public class IP {
    private String direccion;


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais(){
        return validarIP(this.direccion);
    }


    private String validarIP(String direccionAValidar){ //225.225.225.225
        String digitosIp = direccionAValidar.substring(0, 3);
        Integer numeroDePais = Integer.parseInt(digitosIp);
        String respuesta = "";

        if(numeroDePais >= 0 && numeroDePais <= 49){
            respuesta = "Argentina";
        }else if(numeroDePais >= 50 && numeroDePais <= 99){
            respuesta = "Brasil";
        }else if(numeroDePais >= 100 && numeroDePais <= 149){
            respuesta = "Colombia";
        }else{
            respuesta = "Unknown";
        }

        return respuesta;
    }
}