import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<Cliente> clientes = new ArrayList<>();

    private static int idCliente= 1;

    public static void main(String[] args) {
        System.out.println("===========Cadastro de Cliente===========");

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.println("Digite o e-mail: ");
        String email= sc.nextLine();

        System.out.print("Digite o endereco: ");
        String endereco = sc.nextLine();

        System.out.println("Digite o telefone:");
        String telefone = sc.nextLine();

        System.out.println("Digite o CPF: ");
        String cpf = sc.nextLine();

        System.out.println("Digite a senha");
        String senha = sc.nextLine();

        String tipoUsuario ="Cliente";

        Cliente cliente = new Cliente(idCliente,nome,cpf,email, telefone, endereco, senha, tipoUsuario);
        clientes.add(cliente);

        idCliente++;

        System.out.println("Cliente cadastro com sucesso!");

        System.out.println("Clientes: " + cliente);
    }
}