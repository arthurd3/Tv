import java.util.Scanner;

public class Tv {
    Scanner read = new Scanner(System.in);
    private int selectChannel;
    private boolean ligar = false;
    private int canal = 0 ;
    private int volume = 0 ;

    public boolean getTv(){
        return ligar;
    }
    
    public int getCanal() {
        return canal;
    }
    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int volume) {
        this.volume += volume;
    }
    public void setCanal(int canal) {
        this.canal += canal;
    }
    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public void ligarTv(){
        ligar = true;
        setLigar(ligar);

    }
    public void desligarTv(){
        if(getTv())
            System.out.println("TV Já Esta Ligada");
        ligar = false;
        setLigar(ligar);
    }

    public void aumentarVol(){
        setVolume(1);
    }
    public void abaixarVol(){
        setVolume(-1);
    }

    public void selecionarCanal(){
        selectChannel = read.nextInt();
        if(selectChannel > 5 || selectChannel < 0 )
            System.out.print("Canal Invalido");
        setCanal(selectChannel);
    }
    

}
