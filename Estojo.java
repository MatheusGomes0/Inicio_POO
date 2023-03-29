package cursoemvideo;

public class Estojo {
   private int QUANTIDADE_MAXIMA_CANETA = 10;
	String modelo;
	String cor;
	int qtdlapis;
	int qtdcaneta;
	boolean fechado;
	
	void status() {
	System.out.println("O modelo � " + modelo);
	System.out.println("A cor � " + cor);
	System.out.println("Quantidade de caneta no estojo �  " + qtdcaneta);
	System.out.println("O estojo est� fechado? " + fechado);

	}
	
	void abrir() {
		this.fechado = false;
	}
	
	void fechar() {
		this.fechado = true;
	}
	
	void guardar() {
		if(this.fechado == true) {
			System.out.println("N�o posso guardar nada, estou fechado");
		} else {
			System.out.println("Itens guardados com sucesso");
		}
		
	
	}
	
	void guardarcaneta() {
		if(this.qtdcaneta<=QUANTIDADE_MAXIMA_CANETA) {
			
			System.out.println("Caneta guardada com sucesso");
			qtdcaneta++;
		} 
	}
}
