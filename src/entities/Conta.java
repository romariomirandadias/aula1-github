package entities;

public class Conta {
	private int numero;
	private String titular;
	private double depositoInicial;

	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		this.depositoInicial = depositoInicial;
	}

	public Conta(int numero, String titular) {

		this.numero = numero;
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void depositar(double deposito) {
		depositoInicial += deposito;
		
	}

	public void sacar(double saque ) {
depositoInicial-=saque + 5.00 ;
	}
	public String toString() {
		return 
				"Conta " + numero + ","  
				+ "titular :" + titular + ",saldo : R$ " + String.format("%.2f",depositoInicial);
	}
}
