/*Classe principal que define os valores dos atributos para cada uma das opções de cadastro que o
 * código executa, sendo uma pessoa física, uma jurídica e um funcionário.*/
public class Main {
    public static void main(String[] args) {
        // Criando uma Pessoa Física
        PessoaFisica pessoaFisica1 = new PessoaFisica("Iggor Cavalera ", "Rua Arise, 123", "iggor.cavalera@dominio.com", "123.456.789-55");
        pessoaFisica1.dadosPessoa();
        
        //Quebra de linha para melhor leitura dos dados no terminal.
        System.out.println();

        // Criando uma Pessoa Jurídica
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Empresa Syno", "Rua Floriano Peixoto, 512", "empresa.syno@dominio.com", "12.345.678/0001-11");
        pessoaJuridica1.dadosPessoa();

        //Quebra de linha para melhor leitura dos dados no terminal.
        System.out.println();

        // Criando um Funcionário
        PessoaFuncionario pessoaFuncionario1 = new PessoaFuncionario("Marty Friedman", "Rua Lucretia, 92", "marty.friedman@dominio.com", "123.456.789-55", 3500.00);
        pessoaFuncionario1.dadosPessoa();
        
    }
    
}