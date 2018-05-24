package evo.classes;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public abstract class Products {
	private String name; 		//term�k neve
	private String producer;	//gy�rt�
	private int quantity;		//term�k mennyis�ge
	private int price;			//�r
	
	private static String fileLocation = "products.xml";
	
	protected String type;
	//protected static int tax;		//ad�, mivel term�k fajt�k�nt lehet v�ltoz� ezten m�g dolgozunk. Nem tudom azt nem besz�lt�k, hogy szeretn�nk felvenni �lelmiszert vagy gy�gyszert egyenl�re, azoknak m�s az ad� kulcsuk
	//de akk�r static t�mb k�nt is t�rolhatjuk itt, az ad� fajt�kat, �s a k�vetkez� gyerekn�l be�llitjuk/kiv�lasztjuk azt a ad� nemet ami oda val�
	
	public Products(String name,String producer,int quantity, int price) {
		this.name = name;
		this.producer = producer;	
		this.quantity = quantity;	
		this.price = price;
		//this.tax = ;
	}
	
	public Products() {
		
	}
	
	public static String getFileLocation() {
		return fileLocation;
	}
	
	public void readTheFileAndWriteDown(Element eElement) {
		if(eElement!=null) {
			System.out.println("\nTippus: " +type);
			System.out.print("Termek neve: " +eElement.getElementsByTagName("name").item(0).getTextContent() +"\n");
			System.out.print("Gy�rt�: " +eElement.getElementsByTagName("producer").item(0).getTextContent() +"\n");
			System.out.print("Darabsz�m: " +eElement.getElementsByTagName("quantity").item(0).getTextContent() +"\n" );
			System.out.print("�r: " +eElement.getElementsByTagName("price").item(0).getTextContent() +"\n" );
		}else {
			System.out.print("false");
		}
	}
	public String getType() {
		return type;
	}
	
}
