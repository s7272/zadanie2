package zad2.zad2;

import java.util.ArrayList;
import java.util.List;

public class DanePogodowe implements PodmiotObserwowany{

	private double temperatura;
	private double cisnienie;
	private double wilgotnosc;
	
	private List<Wyswietlanie> obserwatorzy = new ArrayList<Wyswietlanie>();
	
	public void dodajWyswietlacz(Wyswietlanie w) {
			obserwatorzy.add(w);	
		
	}

	public void usunWyswietlacz(Wyswietlanie w) {
		obserwatorzy.remove(w);
		
	}

	public void wyslijDane() {
		for(Wyswietlanie w : obserwatorzy)
			w.aktualizacja(temperatura, cisnienie, wilgotnosc);
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
		wyslijDane();
	}

	public void setCisnienie(double cisnienie) {
		this.cisnienie = cisnienie;
		wyslijDane();
	}

	public void setWilgotnosc(double wilgotnosc) {
		this.wilgotnosc = wilgotnosc;
		wyslijDane();
	}

}
