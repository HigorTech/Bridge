package padrãoBridgeColor;

public class PadraoBridge {

	public static void main(String[] args) {
		
		Forma tri = new Triangulo(new CorVermelha());
		tri.aplicarCor();
		
		Forma pent = new Pentagono(new CorVerde());
		
			pent.aplicarCor();
			
			
		Forma squaredot = new Retangulo(new CorRose());
		squaredot.aplicarCor();
		
	}

}
