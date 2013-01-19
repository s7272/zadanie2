package zad2.zad2;

public class Prognoza extends MeteoObserwator implements Wyswietlanie {

	public void aktualizacja(double temp, double cis, double wilg) {
		this.temperatura=temp+Math.random();
		this.cisnienie=cis+Math.random();
		this.wilgotnosc=wilg+Math.random();
		
	}

	public String wyswietlanie() {
		
		return "Prognozowana Temperatura: "+this.temperatura+"\n"+
				"Prognozowane Cisnienie: "+this.cisnienie+"\n"+
				"Prognozowana Wilgotnosc: "+this.wilgotnosc+"\n";
	}

}
