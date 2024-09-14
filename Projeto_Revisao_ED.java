import java.util.Scanner;

public class Projeto_Revisao_ED {
    public static void main(String[] args) {
       Vetor vetor = new Vetor()
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Salário");
            System.out.println("2. Buscar Salário");
            System.out.println("3. Alterar Salário");
            System.out.println("4. Remover Salário");
            System.out.println("5. Mostrar Todos os Salários");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o salário atual: ");
                        String salarioAtual = scanner.nextLine();
                        System.out.print("Digite o valor do reajuste: ");
                        String reajuste = scanner.nextLine();
                        System.out.print("Digite o salário novo: ");
                        String salarioNovo = scanner.nextLine();
                        vetor.adiciona(salarioAtual);
                        vetor.adiciona(reajuste);
                        vetor.adiciona(salarioNovo);
                        break;

                    case 2:
                        System.out.print("Digite a posição para buscar: ");
                        int posicao = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Elemento na posição " + posicao + ": " + vetor.busca(posicao));
                        break;

                    case 3:
                        System.out.print("Digite a posição para alterar: ");
                        int posicaoAlterar = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite o novo valor: ");
                        String novoValor = scanner.nextLine();
                        vetor.adicionaInicio(posicaoAlterar, novoValor);
                        break;

                    case 4:
                        System.out.print("Digite a posição para remover: ");
                        int posicaoRemover = scanner.nextInt();
                        scanner.nextLine();
                        vetor.remove(posicaoRemover);
                        break;

                    case 5:
                        System.out.println("Conteúdo do vetor: " + vetor.toString());
                        break;

                    case 6:
                        System.out.println("Saindo...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
