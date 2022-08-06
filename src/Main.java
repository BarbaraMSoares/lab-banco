import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Barbara Bank");

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		List<Conta> contas = new ArrayList<Conta>();
		contas.add(cc);
		contas.add(poupanca);
		banco.setContas(contas);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		banco.listarClientes();
	}

}
