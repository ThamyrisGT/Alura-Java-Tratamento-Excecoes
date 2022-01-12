
// compilador não verifica , nao precisa especificar de quem é a responsabilidade
public class MinhaExcecaoUnchecked extends RuntimeException {

	private static final long serialVersionUID = -8711994021525028927L;
	
	public MinhaExcecaoUnchecked(String msg) {
		super(msg);
	}

}
