public class Cargo3 extends Funcionario{
    public String turno;

    @Override
    protected double calcularSalario(int cargaHoraria, double salarioHora) {
        salario=    (cargaHoraria*salarioHora)+((cargaHoraria*salarioHora)*0.35);
        return salario;
    }
}