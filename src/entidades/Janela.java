package entidades;

public class Janela {
	private boolean aberto = false;
	
	public Janela(){
	}
	
	Janela(boolean aberto){ //set
		this.aberto = aberto;
	}

	public boolean isAberto() { //get
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
}
