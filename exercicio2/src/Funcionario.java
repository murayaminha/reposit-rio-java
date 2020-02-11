public class Funcionario {
protected double salario;
protected int cargaHoraria;
protected double salarioHora;
protected double calcularSalario(int cargaHoraria,double salarioHora){
      salario =  cargaHoraria*salarioHora;
    return salario;
}
}
