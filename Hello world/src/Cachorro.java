public class Cachorro extends Mamiferos {
    private String nome;
    private String raca;
    private String pelagem;

    @Override
    public String correr() {
        return "cachorro está correndo";
    }
    public String getRaca(){
        return raca;
    }
    public void setRaca(String novaRaca){
        this.raca = novaRaca;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        this.raca = novoNome;
    }
    public String getPelagem(){
        return pelagem;
    }
    public void setPelagem(String novaPelagem){
        this.raca = novaPelagem;
    }
    public Cachorro(String novaRaca, String novoNome,String novaPelagem){
        this.raca=novaRaca;
        this.nome=novoNome;
        this.pelagem=novaPelagem;
    }
    public Cachorro(){}
}
