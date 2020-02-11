public class JogadorDeFutebol {
    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;

    public JogadorDeFutebol(String nome,int energia,int alegria,int gols,int experiencia){
        this.nome=nome;
        this.energia=energia;
        this.alegria=alegria;
        this.gols=gols;
        this.experiencia=experiencia;
    }
    public void fazerGol() {

        if (this.energia > 4) {
            this.energia = -5;
            this.alegria = +10;
            this.gols = +1;
            System.out.println("GOOOOOOOOOOOOOL");
        }
        else{
            System.out.println("jogador está cansado, não participará mais do jogo");
        }
    }
    public void correr(){
        if(this.energia>9) {
            this.energia = -10;
            System.out.println("cansei");
        }
        else{
            System.out.println("jogador está cansado, não participará mais do jogo");
        }
    }

    public int getEnergia() {
        return energia;
    }
    public int getExperiencia() {
        return energia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
