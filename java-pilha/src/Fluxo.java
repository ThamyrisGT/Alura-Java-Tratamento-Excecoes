
public class Fluxo {
	
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        }catch(ArithmeticException | NullPointerException | MinhaExcecaoChecked ex) {
        	System.out.println(ex.getMessage());
        	ex.printStackTrace();
        } 
        System.out.println("Fim do main");
    }

    private static void metodo1()throws MinhaExcecaoChecked {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecaoChecked{
        System.out.println("Ini do metodo2");
      throw new MinhaExcecaoChecked("deu ruim aaqui");

//        ArithmeticException exception = new ArithmeticException("deu ruim aaqui");
//        throw exception;
        
        //System.out.println("Fim do metodo2");        
    }

}
