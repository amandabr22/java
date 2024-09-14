package projeto_revisao_ed;

public class Salario {
    private double salarioAtual;
    private double reajuste;
    private double salarioNovo;

    public Salario() {
    }

    public Salario(double salarioAtual, double reajuste) {
        this.salarioAtual = salarioAtual;
        this.reajuste = reajuste;
        calcularSalarioNovo();
    }


    public double getsalarioAtual() {
        return salarioAtual;
    }


    public void setsalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
        calcularSalarioNovo();
    }


    public double getreajuste() {
        return reajuste;
    }


    public void setReajuste(double reajuste) {
        this.reajuste = reajuste;
        calcularSalarioNovo();
    }


    public double getsalarioNovo() {
        return salarioNovo;
    }


    private void calcularSalarioNovo() {
        this.salarioNovo = this.salarioAtual + (this.salarioAtual * this.reajuste / 100);
    }


    @Override
    public String toString() {
        return "Salario{" +
                "salarioAtual=" + salarioAtual +
                ", reajuste=" + reajuste +
                "%, salarioNovo=" + salarioNovo +
                '}';
    }
}
