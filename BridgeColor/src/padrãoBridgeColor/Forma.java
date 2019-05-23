package padrãoBridgeColor;

public abstract class Forma {
	
	protected Cor cor;
	
	public Forma(Cor c) {
		this.cor = c;
	}
	
	abstract public void aplicarCor(); 

}
