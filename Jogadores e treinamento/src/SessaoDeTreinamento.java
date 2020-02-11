public class SessaoDeTreinamento {
   private JogadorDeFutebol jogador;
    private int experiencia;

    public SessaoDeTreinamento() {

    }

    private void experiencia() {
        this.experiencia = +1;
    }

    public void treinarA(JogadorDeFutebol jogador) {
        System.out.println("experiencia inicial = "+jogador.getExperiencia());
        for (int i = 0; i < 10; i++) {
            if (jogador.getEnergia() > 25) {
                this.experiencia=jogador.getExperiencia();
                jogador.correr();
                jogador.fazerGol();
                jogador.correr();
                this.experiencia++;
                jogador.setExperiencia(this.experiencia);
            }
            else {
                System.out.println("experiencia final = "+ jogador.getExperiencia());
            }
        }
    }
}