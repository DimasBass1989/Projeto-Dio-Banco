import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;

	

	public Banco(String nome, List<Conta> contas) {
		super();
		this.nome = nome;
		this.contas = contas;
	}



	public void setNome(String nome) {
		
		this.nome = nome;
	}



	@Override
	public String toString() {
		return "Banco [nome=" + nome + ", contas=" + contas + "]";
	}
	
	

}
