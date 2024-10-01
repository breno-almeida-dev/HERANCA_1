/*Classe para cadastro de pessoas físicas, onde é adicionado o atributo privado para o CPF, sendo o
 * mesmo privado para acesso apenas de dentro da classe, e armazenado em uma String por se tratar de
 * um número de documentoe não um número que sofrerá algum método matemático.
 * Classe que extende a super classe Pessoa.*/
public class PessoaFisica extends Pessoa {
	private String cpf;
	
	
	
	/*Construtor da classe, no qual puxa os atributos da classe pai já instanciados e instancia o CPF.*/
	public PessoaFisica(String nome, String endereco, String email, String cpf) {
		super(nome, endereco, email);
		this.cpf = cpf;
	}
	
	
	/*Setter para instância do valor do CPF vindo da classe Main.*/
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	/*Getter para retorno do valor do CPF para o método de exibição, ou para ser acessado de fora da classe.*/
	public String getCpf() {
		return
				cpf;
	}
	
	/*Método de exibição que puxa o método de exibição da classe pai primeiro e em seguida mostra o dado CPF da pessoa
	 * física.
	 * Utiliza o @Override para indicar e verificar se o método de exibição realmente existem na classe pai e assim
	 * o sobrescreve com os dados únicos desta classe. */
	@Override
	public void dadosPessoa() {
		super.dadosPessoa();
		System.out.println("CPF: " + getCpf());
	}
	
}
