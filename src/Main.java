import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Dimas");
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Mario");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Raisa");
		Conta cc = new ContaCorrente(cliente);		
		Conta cc1 = new ContaCorrente(cliente1);
		Conta cc2 = new ContaPoupanca(cliente2);
		
		
		
		List<Conta> contas = new ArrayList<>();
		contas.add(cc);
		System.out.println(" Quando vc quer depositar ? ");
		int valor = sc.nextInt();
		cc.depositar(valor );
		contas.add(cc1);
		cc1.depositar(3000);
		contas.add(cc2);
		cc2.depositar(27);
		cc.sacar(25000);
		
		
		
		Banco bc = new Banco("Brasil", contas);
		System.out.println(bc);
		for(int i = 0; i<contas.indexOf(contas); i++) {
			System.out.println(contas);
			
		}
		
		
			sc.close();
			
			
		}
			
			
			
			
			
			
			
		
		
		
		
		
	

		
		
		
		

	}


