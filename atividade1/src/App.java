import java.text.DecimalFormat;
import java.util.Scanner;

import controls.Seguranca;
import controls.Sessao;
import models.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Seguranca seg = new Seguranca(); // garantido separação entre o main e manipulação de dados (precisava pra agora? Não, mas já tinha feito)
        double[] saldos = {1000, 250, 3000}; // mock de saldo de usuários
        Scanner scanner = new Scanner(System.in); // instaciando, abrindo, scanner pra leitura de dados
        DecimalFormat format = new DecimalFormat("#.00"); // instanciando formatação para garantir que o saldo seja exibido como: xxx,00 (windows pt-br).

        // lendo o nome dos usuários de teste
        do {
            System.out.println("Informe o nome do usuário " + (Sessao.usuarios.size()+1) + ": ");
            String nome = scanner.nextLine();
            seg.adicionarUsuario(nome, nome+"@email.com", nome, saldos[Sessao.usuarios.size()]); // Adicionando os dados necessarios para o usuário 
                                                                                            // baseados no nome fornecido e saldo mockado
        } while(Sessao.usuarios.size() < 3);

        // exibindo o estado inicial das contas bancarias dos usuarios criados.
        System.out.println("Estado Inicial:");
        for (Usuario u : Sessao.usuarios) {
            System.out.println("Nome Usuário: " + u.getNome() + " - Saldo: " + format.format(seg.getContaUsuario(u.getId()).getSaldo()));
        }

        // gerando uma operação de recebimento de 250 (usuario 1)

        // pagando a requisição do usuário 1 (usu 2, usu 3 e usu 2 [de novo])

        // gerando uma operação de recebimento de 1000 (usuario 2)

        // pagando a requisição do usuário 2 (usu 3)


        // exibindo o estado das contas bancarias dos usuarios criados após operações.
        System.out.println("Estado Final:");
        for (Usuario u : Sessao.usuarios) {
            System.out.println("Nome Usuário: " + u.getNome() + " - Saldo: " + format.format(seg.getContaUsuario(u.getId()).getSaldo()));
        }

        scanner.close(); // fechando o scanner de dados
    }
}
