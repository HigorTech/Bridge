package padrãoBridgeColor;

import padrãoBridgeColor.Cor;
import padrãoBridgeColor.Forma;

public class Triangulo extends Forma {
	
	
	public Triangulo (Cor c) {
		super(c);
	}
	
	public void aplicarCor() {
		System.out.print("Triangulo sendo injetado com a cor ");
		cor.aplicarCor();
	}

}
