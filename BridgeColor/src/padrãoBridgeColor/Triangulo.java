package padr�oBridgeColor;

import padr�oBridgeColor.Cor;
import padr�oBridgeColor.Forma;

public class Triangulo extends Forma {
	
	
	public Triangulo (Cor c) {
		super(c);
	}
	
	public void aplicarCor() {
		System.out.print("Triangulo sendo injetado com a cor ");
		cor.aplicarCor();
	}

}
