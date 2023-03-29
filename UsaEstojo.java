package cursoemvideo_visibilidade;

public class UsaEstojo {
	public static void main(String[] args) {
		
		Estojo e1 = new Estojo();
		
		e1.cor = "Preto";
		e1.modelo = "Faber";
		e1.qtdcaneta = 2;
		e1.abrir();
		e1.guardarcaneta();
		e1.status();
	}
}
