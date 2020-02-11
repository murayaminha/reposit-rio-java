public class Exercicio2 {
    public static void main(String[] args) {
        JogadorDeFutebol jogador1 = new JogadorDeFutebol("josé",100,10,0,1);
        JogadorDeFutebol jogador2 = new JogadorDeFutebol("pelé",100,20,0,1);

        SessaoDeTreinamento treino1 = new SessaoDeTreinamento();
        treino1.treinarA(jogador1);
    }
}
