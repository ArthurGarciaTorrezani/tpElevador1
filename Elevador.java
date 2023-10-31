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

   

    public void mostrarPainel(){
        Piso pisoReferencia = pisoAtual;
        System.out.println("*** Painel Elevador ***");
        for(int i = 1;i <= pisoAtual.contador;i++){
            
            if(pisoReferencia == pisoAtual){
                System.out.print(">"+i+"<");
            }else if(pisoReferencia.isParadaSolicitada()){
                System.out.print("*"+i+"*"); 
            }else{
                System.out.print(""+i+""); 
            }

            
                pisoReferencia = pisoReferencia.getProximoPiso();
            
        }   
    }

    
}
