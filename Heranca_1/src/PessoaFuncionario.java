/*Classe para cadastro de funcionários que extende a sub-classe Pessoa fisica, assim
 * puxando os atributos instanciados nela e somando o atributo salario junto aos dados
 * do funcionário.*/
public class PessoaFuncionario extends PessoaFisica {
	private double salario;
	
	
	
	/*Método construtor dos dados do funcionário, no qual puxa os dados dos atributos vindos da
	 * super classe Pessoa e da sub-classe PessoaFisica, e neste construtor é instanciada o atributo salario.*/
	public PessoaFuncionario(String nome, String endereco, String email, String cpf, double salario) {
		super(nome, endereco, email, cpf);
		this.salario = salario;
	}	
	
	
	/*Setter para instância do atributo salario desta classe com o valor informado na classe Main*/
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	/*Getter para acessar o valor do salário, de fora da classe e no método de exibição dos dados.*/
	public double getSalario() {
		return
				salario;
	}
	
	/*Método de exibição dos dados da pessoa, no qual é puxado os dados vindos da super classe Pessoa
	 * e da sub-classe PessoaFisica. Aqui o @Override verifica se realmente os dados estão sendo sobrescritos
	 * para informar os dados vindos das outras classes.*/
	@Override
	public void dadosPessoa() {
		super.dadosPessoa();
		System.out.println("Salário: R$ " + getSalario());
	}

}
