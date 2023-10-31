public class Elevador
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private boolean porta;
    private boolean subir;
    private boolean descer;
    private Piso pisoAtual;
    
    public Elevador(Piso pisoAtual)
    {
        this.pisoAtual = pisoAtual;
        porta = false;
        subir = true;
    }
    
    public void abrirPorta(){
        porta = true;
    }
    
    public void fecharPorta(){
        porta = false;
    }
    
    public boolean isPortaAberta(){
        return porta;
    }
    
    public boolean isSubindo(){
        return subir;
    }
    
    public boolean isDescendo(){
        return descer;
    }
    
    public int getPisoAtual(){
        return pisoAtual.getAndar();
    }
    
    public void pararNoPiso(Piso pisoParar){
        pisoParar.pararElevador();
    }
}
