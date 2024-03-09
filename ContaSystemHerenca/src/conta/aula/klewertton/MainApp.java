package conta.aula.klewertton;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
				
		Scanner numConta = new Scanner(System.in);
		Conta x;
		x = new Conta();
		
		System.out.println("Digite o numero da conta:");
		x.numero = numConta.nextInt();
		x.saldo = 1000.00;
		
		System.out.println("Quanto voce deseja sacar?");
		if (x.sacar(numConta.nextDouble())) {
			System.out.printf("O valor atual da conta e de R$ %.2f.", x.getSaldo());
			
		} else {
			System.out.println("Nao tem saldo!");
		}
		
		
	}

}
