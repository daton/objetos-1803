
package abstraccion;

public class Conversion {
    private Grados grados;
    
    private Longitudes longitudes;

    public float centigradosAFarenheit(){
        //ESte metodo tiene lógica
        
         float resultado= grados.getCentigrados()*1.8f+32;
         return resultado;
    }
    
    public float metrosAPies(){
        //ESte metodo tiene lógica
        
         float resultado= longitudes.getMetros()*3.28f;
         return resultado;
    }
    
    
    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }

    public Longitudes getLongitudes() {
        return longitudes;
    }

    public void setLongitudes(Longitudes longitudes) {
        this.longitudes = longitudes;
    }
    
}
