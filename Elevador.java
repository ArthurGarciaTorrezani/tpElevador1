public class Elevador {
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private boolean porta;
    private boolean subir;
    private boolean descer;
    private Piso pisoAtual;
    private Piso piso1;

    public Elevador(Piso pisoAtual) {
        this.pisoAtual = pisoAtual;
        this.piso1 = pisoAtual;
        porta = false;
        subir = true;
    }

    public void abrirPorta() {
        porta = true;
    }

    public void fecharPorta() {
        porta = false;
    }

    public boolean isPortaAberta() {
        return porta;
    }

    public void subir(){
        subir = true;
        descer = false;
    }

    public void descer(){
        subir = false;
        descer = true;
    }

    public boolean isSubindo() {
        return subir;
    }

    public boolean isDescendo() {
        return descer;
    }

    public int getPisoAtual() {
        return pisoAtual.getAndar();
    }

    public void pararNoPiso(Piso pisoParar) {
        pisoParar.pararElevador();
    }

    public void mostrarPainel() {
        Piso pisoReferencia = piso1;
        System.out.println("*** Painel Elevador ***");
        for (int i = 1; i <= pisoAtual.contador; i++) {

            if(pisoReferencia == pisoAtual) {
                System.out.print(">" + i + "<");
            }else if (pisoReferencia.isParadaSolicitada()) {
                System.out.print("*" + i + "*");
            } else {
                System.out.print("" + i + "");
            }
            pisoReferencia = pisoReferencia.getProximoPiso();
        }
    }

    public void mover(){
        if(subir){
            pisoAtual = pisoAtual.getProximoPiso();
        }else{
            pisoAtual = pisoAtual.getPisoAnterior();
        }
        
    }

}
