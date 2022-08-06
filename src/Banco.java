import java.util.List;

public class Banco {
	public Banco(String nome) {
		this.nome = nome;
	}

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	protected void listarClientes() {
		System.out.println("============================================================");
		System.out.println(String.format("Listando clientes do banco %s", this.nome));
		System.out.println("---");
		for(int i = 0 ; i < contas.size(); i++){
			Conta conta = contas.get(i);
			System.out.println(String.format("%s", contas.get(i).cliente.getNome()));
		}
	}

}
