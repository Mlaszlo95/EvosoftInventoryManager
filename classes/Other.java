package evo.classes;

import org.w3c.dom.Element;

public class Other extends Products{
	static {
		type = "other";
	}
	//ha otheren bel�l szeretn�nk m�g egy gyermeket gy�gyszernek, vagy egy�bb k�l�nleges dolognak
	public Other(String name,String producer,int quantity, int price) {
		super(name,producer,quantity,price);
	}
	
	public Other() {
		
	}
	
	@Override
	public void readTheFileAndWriteDown(Element eElement) {
		if(eElement.getAttribute("type").equals(type)) {
			super.readTheFileAndWriteDown(eElement);
		}
	}
}
