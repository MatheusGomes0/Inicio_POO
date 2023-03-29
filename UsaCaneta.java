package cursoemvideo_visibilidade;

public class UsaCaneta {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC cristal";
		c1.cor = "Azul";
		c1.carga = 80;
		//c1.tampada = true;
		c1.destampar();
		c1.status();
	

	}

}
