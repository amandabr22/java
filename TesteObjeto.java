package projeto_revisao_ed;

public class TesteObjeto {
    public static void main(String[] args) {
        VetorObjeto<Salario> vetor = new VetorObjeto<>(5);

        Salario salario1 = new Salario(3000, 10);
        Salario salario2 = new Salario(4500, 5);
        Salario salario3 = new Salario(5000, 8);

        vetor.adiciona(salario1);
        vetor.adiciona(salario2);
        vetor.adiciona(salario3);

        System.out.println("Número de salários registrados: " + vetor.tamanho());
        System.out.println("Salários registrados: " + vetor.toString());
    }
}
