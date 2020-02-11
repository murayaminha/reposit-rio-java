public class Cargo2 extends Funcionario{
    public String setor;

    @Override
    protected double calcularSalario(int cargaHoraria, double salarioHora) {
        salario =    (cargaHoraria*salarioHora)+((cargaHoraria*salarioHora)*0.15);
        return salario;
    }
}