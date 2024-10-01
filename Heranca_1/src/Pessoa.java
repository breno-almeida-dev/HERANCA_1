/*Classe Pessoa para dados base que todas pessoas diferentes que serão registradas têm em comum.
 * Sendo seus atributos declarados como privados para serem acessados apenas de dentro da classe.*/
public class Pessoa {
	private String nome;
	private String endereco;
	private String email;
	
	
	
	/*Construtor com os valores dos parâmetros sendo instanciados com o mesmo valor dos atributos da classe.*/
	public Pessoa(String nome, String endereco, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}
	
	
	/*Setters para instanciar os atributos das classe com os dados vindos da classe Main.*/
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	/*Getters para retornarem os valores dos atributos das classe para o método de exibição, ou para
	 * serem acessados de fora da classe.*/
	public String getNome() {
		return
				nome;
	}	
	
	
	public String getEndereco() {
		return
				endereco;
	}	
	
	
	public String getEmail() {
		return
				email;
	}
	
	
	
	/*Método de exibição dos dados da pessoa após serem processados dentro da classe.*/
	public void dadosPessoa() {
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Email: " + getEmail());
	}
	
}
