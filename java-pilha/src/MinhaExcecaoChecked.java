
// o compilador verifica e é obrigatório dizer de quem é a responsabilidade de chamar aquela exceção, de avisar que aquele método pode ser "perigoso"
//ou usando o try e catch ou usando throws
//ou seja, força o compilador a verificar se a exceção estaria sendo tratada. 

public class MinhaExcecaoChecked extends Exception {

	private static final long serialVersionUID = -8711994021525028927L;
	
	public MinhaExcecaoChecked(String msg) {
		super(msg);
	}

}
