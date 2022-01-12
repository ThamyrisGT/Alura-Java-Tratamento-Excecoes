package conta.exception.com;

public class TesteExcecoes {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123,321);
		
		conta.deposita(200);
		try{
			conta.saca(210);
		}catch(Exception ex) {
			System.out.println("Exception tratada: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());

	}

}
