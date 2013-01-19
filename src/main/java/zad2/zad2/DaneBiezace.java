package zad2.zad2;

public class DaneBiezace extends MeteoObserwator implements Wyswietlanie{

	public void aktualizacja(double temp, double cis, double wilg) {
		this.temperatura=temp;
		this.cisnienie=cis;
		this.wilgotnosc=wilg;
		
	}

	public String wyswietlanie() {
	
		return "Biezaca Temperatura: "+this.temperatura+"\n"+
				"Biezaca Cisnienie: "+this.cisnienie+"\n"+
				"Biezaca Wilgotnosc: "+this.wilgotnosc+"\n";
	}

}
