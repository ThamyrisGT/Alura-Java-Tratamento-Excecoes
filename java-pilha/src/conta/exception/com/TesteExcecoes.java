package conta.exception.com;

public class TesteExcecoes {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123,321);
		
		conta.deposita(200);
		conta.saca(210);
		
		System.out.println(conta.getSaldo());

	}

}
