public class Piso {
    private int andar;
    private boolean subir;
    private boolean descer;
    private Piso proxPiso;
    private Piso pisoAnte;
    private boolean pararElevador;
    private boolean paradaSolicitada;
    public static int contador = 0;
    private boolean receberElevador;

    public Piso(int andar) {
        this.andar = andar;
        contador++;
    }

    public int getAndar() {
        return andar;
    }

    public void queroSubir() {
        subir = true;
    }

    public void queroDescer() {
        descer = true;
    }

    public void setSubirFalsa(){
        subir = false;
    }

    public void setDescerFalsa(){
        descer = false;
    }

    public boolean isQueroSubir() {
        return subir;
    }

    public boolean isQueroDescer() {
        return descer;
    }

    public void setProximoPiso(Piso proxPiso) {
        this.proxPiso = proxPiso;
    }

    public void setPisoAnterior(Piso pisoAnte) {
        this.pisoAnte = pisoAnte;
    }

    public Piso getProximoPiso() {
        return proxPiso;
    }

    public Piso getPisoAnterior() {
        return pisoAnte;
    }

    public void pararElevador() {
        pararElevador = true;
    }

    public boolean getPararElevador(){
        return pararElevador;
    }

    public void solicitarParada() {
        paradaSolicitada = true;
    }

    public void setParadaFalsa(){
        paradaSolicitada = false;
    }

    public boolean isParadaSolicitada() {
        return paradaSolicitada;
    }

    public void receberElevador(boolean elevadorSubindo, boolean elevadorDescendo) {
        if (paradaSolicitada) {
            receberElevador = true;
        } else if (subir == elevadorSubindo) {
            receberElevador = true;
        } else if (descer == elevadorDescendo) {
            receberElevador = true;
        }else{
            receberElevador = false;
        }

    }

    public boolean getReceberElevador(){
        return receberElevador;
    }
    
    public void mostrarPainel(){
        if(subir && descer){
            System.out.println(andar + " ▲▼");
        }else if(!subir && !descer){
            System.out.println(andar + " △▽");
        }else if(subir && !descer){
            System.out.println(andar+" ▲▽");
        }else{
            System.out.println(andar+" △▼");
        }
    }

}
