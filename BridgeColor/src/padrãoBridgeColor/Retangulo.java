package padrãoBridgeColor;

import padrãoBridgeColor.Cor;
import padrãoBridgeColor.Forma;

public class Retangulo extends Forma{

	public Retangulo(Cor c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aplicarCor() {
		System.out.print("Retangulo sendo injetado com a cor ");
		cor.aplicarCor();
		// TODO Auto-generated method stub
		
	}

}
