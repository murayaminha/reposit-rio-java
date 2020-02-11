public class Gato extends Mamiferos {
    private String raca;
    private Number peso;

    public String correr() {
        return "Estou correndo";
    }

    public String brincar() {
        return "brincando";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String novaRaca) {
        this.raca = novaRaca;
    }

    public Number getPeso() {
        return peso;
    }

    public void setPeso(Number novoPeso) {
        this.peso = novoPeso;
    }

    public Gato(String novaRaca){
        this.raca=novaRaca;
    }
    public Gato(Number novoPeso){
        this.peso=novoPeso;
    }
    public Gato(String novaRaca,Number novoPeso){
        this.peso = novoPeso;
        this.raca=novaRaca;
    }
}