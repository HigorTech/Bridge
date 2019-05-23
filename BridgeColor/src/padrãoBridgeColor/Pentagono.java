package padrãoBridgeColor;

import padrãoBridgeColor.Cor;
import padrãoBridgeColor.Forma;

public class Pentagono extends Forma{
	
	public Pentagono (Cor c) {
		super(c);
	}
	
	public void aplicarCor(){
		System.out.print("Pentagono sendo injetado pela cor ");
		cor.aplicarCor();
	}

}
