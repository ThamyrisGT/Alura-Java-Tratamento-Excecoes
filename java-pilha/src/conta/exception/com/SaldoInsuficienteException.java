package conta.exception.com;

public class SaldoInsuficienteException extends RuntimeException {

	private static final long serialVersionUID = -8335761730194621797L;

	public SaldoInsuficienteException (String msg) {
		super(msg);
	}
}
