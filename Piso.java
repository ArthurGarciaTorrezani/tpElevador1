public class Piso
{   
    private int andar;
    private boolean subir;
    private boolean descer;
    private Piso proxPiso;
    private Piso pisoAnte;
    private boolean pararElevador;
    private boolean paradaSolicitada;
    
    public Piso(int andar)
    {
    this.andar = andar;
    }

    public int getAndar(){
        return andar;
    }
    
    public void queroSubir(){
        subir = true;
    }
    
    public void queroDescer(){
        descer = true;
    }
    
    public boolean isQueroSubir(){
        return subir;
    }
    
    public boolean isQueroDescer(){
        return descer;
    }
    
    public void setProximoPiso(Piso proxPiso){
        this.proxPiso = proxPiso;
    }
    
    public void setPisoAnterior(Piso pisoAnte){
        this.pisoAnte = pisoAnte;
    }
    
    public int getProximoPiso(){
        return proxPiso.andar;
    }
    
    public int getPisoAnterior(){
        return proxPiso.andar;
    }
    
    public void pararElevador(){
        pararElevador = true;
    }
    
    public void solicitarParada(){
        paradaSolicitada = true;
    }
    
    public boolean isParadaSolicitada(){
        return paradaSolicitada;
    }
}
