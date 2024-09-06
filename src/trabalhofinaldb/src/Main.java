import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    static Connection conexao = null;
    static Scanner ler = new Scanner(System.in);
    static Scanner nomeScanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        int Cpf;
        String nome, sexo;
        double salarioFixo;
        int dataNascimento;

        System.out.println("Digite os dados da Pessoa");
        System.out.println("Digite o CPF");
        Cpf = ler.nextInt();
        System.out.println("Digite o Nome");
        nome = nomeScanner.nextLine();
        System.out.println("Digite o Sexo");
        sexo = ler.next();
        System.out.println("Digite o Salario fixo");
        salarioFixo = ler.nextDouble();
        System.out.println("Digite a Data de Nascimento");
        dataNascimento = ler.nextInt();

        Garcom p = new Garcom(Cpf,nome,sexo,salarioFixo,dataNascimento);

        inserirGarcom(p);

    }

    private static void inserirGarcom(Garcom plida) throws SQLException, ClassNotFoundException {
        try{
            conexao = ConexaoBD.getInstance();
            String sql = "insert into Garcom (Cpf, nome, sexo, salarioFixo,dataNascimento) values (?,?,?,?,?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, plida.getCpf());
            stmt.setString(2, plida.getNome());
            stmt.setString(3, plida.getSexo());
            stmt.setDouble(4, plida.getSalarioFixo());
            stmt.setInt(5, plida.getDataNascimento());
            stmt.execute();
            stmt.close();
            System.out.println("Garçom Cadastrado com Sucesso");
        } catch (Exception e){
            System.out.println("NÃO FOI POSSIVEL CADASTRAR O GARÇOM");
            e.printStackTrace();
        }

    }
}
