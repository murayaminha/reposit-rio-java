public class Cargo1 extends Funcionario{

    public String sprint;

    @Override
    protected double calcularSalario(int cargaHoraria, double salarioHora) {
         salario=   (cargaHoraria*salarioHora)+((cargaHoraria*salarioHora)*0.2);
        return salario;
    }
}
