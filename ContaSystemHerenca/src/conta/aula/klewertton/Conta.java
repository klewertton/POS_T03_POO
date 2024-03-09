package conta.aula.klewertton;

public class Conta {

	int numero;
	double saldo;

	boolean sacar(double val) {
		if (this.saldo >= val) {
			this.saldo = this.saldo - val;
			return true;
		} else {
			//System.out.println("Nao ha saldo para a operacao!");
			return false;
		}
	}

	boolean depositar(double val) {
		if (val>=0) {
			this.saldo = this.saldo+val;
			return true;
		} else {
			System.out.println("Valor abaixo de 0.");
			return false;
		}
	}

	double getSaldo() {
		return this.saldo;
	}

}
