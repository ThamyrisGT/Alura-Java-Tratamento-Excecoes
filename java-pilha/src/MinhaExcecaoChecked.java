
// o compilador verifica e � obrigat�rio dizer de quem � a responsabilidade de chamar aquela exce��o, de avisar que aquele m�todo pode ser "perigoso"
//ou usando o try e catch ou usando throws
//ou seja, for�a o compilador a verificar se a exce��o estaria sendo tratada. 

public class MinhaExcecaoChecked extends Exception {

	private static final long serialVersionUID = -8711994021525028927L;
	
	public MinhaExcecaoChecked(String msg) {
		super(msg);
	}

}
