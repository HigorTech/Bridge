package padr�oBridgeColor;

import padr�oBridgeColor.Cor;
import padr�oBridgeColor.Forma;

public class Pentagono extends Forma{
	
	public Pentagono (Cor c) {
		super(c);
	}
	
	public void aplicarCor(){
		System.out.print("Pentagono sendo injetado pela cor ");
		cor.aplicarCor();
	}

}
