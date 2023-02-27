package entities;

public class BaixaRenda {
	
	private int tusd;
	private int te;
	private float VALUE_TE = 0.26046f;
	private float VALUE_TUSD = 0.39603f;
	private int energia;
	private float pis = 0.79f;
	private float cofins = 3.62f;
	private float cosip = 0;
	
	
	//Construtores
	public BaixaRenda(){	
	}

	 public BaixaRenda(int tusd, int te, int energia) {
		this.tusd = tusd;
		this.te = te;
		this.energia = energia;
	}

	 //Métodos getters e setters
	public int getTusd() {
		return tusd;
	}

	public void setTusd(int tusd) {
		this.tusd = tusd;
	}

	public int getTe() {
		return te;
	}

	public void setTe(int te) {
		this.te = te;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public float getPis() {
		return pis;
	}

	public void setPis(float pis) {
		this.pis = pis;
	}

	public float getCofins() {
		return cofins;
	}

	public void setCofins(float cofins) {
		this.cofins = cofins;
	}

	public float getCosip() {
		return cosip;
	}

	public void setCosip(float cosip) {
		this.cosip = cosip;
	}
	
	//Métodos
	


	public int verificandoDesconto_TUSD() {
		if(energia < 30) {
			return 70;
		}else if(energia >= 31 && energia <= 100) {
			return 50;
		}else if(energia >= 101 && energia <= 220) {
			return 30;
		}else if(energia > 220) {
			return 25;
		}else {
			System.out.println("Deu ruim na funcao verificandoDesconto()");
		}
	return verificandoDesconto_TUSD();
	}
	
	public int verificandoDesconto_TE() {
		if(energia < 30) {
			return 65;
		}else if(energia >= 31 && energia <= 100) {
			return 40;
		}else if(energia >= 101 && energia <= 220) {
			return 10;
		}else if(energia > 220) {
			return 0;
		}else {
			System.out.println("Deu ruim na funcao verificandoDesconto()");
		}
	return verificandoDesconto_TUSD();
	}
	
	public float icms() {

		int icms;
		if(energia >= 0 && energia <= 90) {
			return icms = 0; 
		}else if(energia >= 91 && energia <= 200) {
			return icms = 12;
		}else if(energia > 200) {
			return icms = 25;
		}else {
			System.out.println("Deu ruim na funcao imposto()");
		}
		return icms();
	}
	
	public float calculoBaixaRendaTE() {
		return (verificandoDesconto_TE() / (energia * VALUE_TE))* 100;
	}
	public float calculoBaixaRendaTUSD() {
		return (energia * VALUE_TUSD) * icms() * pis * cofins + cosip;
	}
}
