/*Classe PessoaJuridica que extende a super classe Pessoa, puxando seus atributos.
 * Aqui é declarado o atributo cnpj para adicionar a característica única desta classe.*/
public class PessoaJuridica extends Pessoa {
	private String cnpj;
	
	
	
	/*Método construtor para instanciar os atributos vindos da super classe e dos atributos únicos
	 * desta classe.*/
	public PessoaJuridica(String nome, String endereco, String email, String cnpj) {
		super(nome, endereco, email);
		this.cnpj = cnpj;
	}
	
	
	/*Setter para instanciar o atributo desta classe com o valor do atributo vindo da classe Main.*/
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	/*Getter para quando chamado dentro e fora da classe retorne o valor do atributo depois de processado
	 * durante a classe.*/
	public String getCnpj() {
		return 
				cnpj;
	}
	
	/*Método de exibição dos dados da pessoa jurídica, onde puxando os dados vindos da super classe Pessoa
	 * e adicionando o atributo único, no caso o CNPJ, desta classe, para exibição dos dados da pessoa.
	 * Aqui o @Override verifica se realmente os dados estão sendo sobrescritos
	 * para informar os dados vindos das outras classes.*/
	@Override
	public void dadosPessoa() {
		super.dadosPessoa();
		System.out.println("CNPJ: " + getCnpj());
	}
	
}
