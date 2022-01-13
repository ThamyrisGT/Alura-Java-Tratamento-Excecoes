package exceptionfinally.com;

public class Conexao implements AutoCloseable{
	
	public Conexao() {
		System.out.println("Abrindo conexao");
		throw new IllegalStateException();
	}

	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();
	}
	
//	public void fechaConexao() {
//		System.out.println("Fechando conexão");
//	}

	@Override 
	public void close() { 
		System.out.println("Fechando conexao");
		
	}
}
