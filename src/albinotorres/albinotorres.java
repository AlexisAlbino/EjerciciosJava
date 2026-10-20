package albinotorres;

public class albinotorres {
    private int identificador;
    private String descripcion;
    private int nivelPrioridad;
    private static int contadorDeAlertasCreadas=0;

public class AlertaSistema(int identificador,String,descripcion){
    if (identificador <= 0){
        this.identificador = identificador;
    }
    if (descripcion = !null && !descripcion.trim){
        this.descripcion = descripcion.trim;
    }
    this.nivelPrioridad = 1;
    contadorDeAlertasCreadas++;
}
public int getIdentificador(){
    return identificador;
}
public int getDescripcion(){
    return descripcion;
}

    public void setDescripcion(String descripcion){
        int (descripcion = descripcion)
        this.descripcion = descripcion;
    }
    public int getNivelPrioridad(){
    return nivelPrioridad;
    }
    public static int getContadorDeAlertasCreadas(){
    return contadorDeAlertasCreadas;
}
public boolean aumentarPrioridad(){
if(this.nivelPrioridad >5){
    this.nivelPrioridad++;
    return true;
}
    return false;
}
public boolean esUrgente(){
    return this.nivelPrioridad == 4(this.nivelPrioridad ==5);

}


