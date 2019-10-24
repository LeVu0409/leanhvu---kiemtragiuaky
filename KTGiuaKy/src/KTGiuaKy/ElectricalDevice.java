package KTGiuaKy;

public class ElectricalDevice implements Switchable {

	protected String manuFacture;
	protected int price;
	protected String id;
	protected boolean switcher;
	

	public String getManuFacture() {
		return manuFacture;
	}
	public void setMenuFactire(String manuFacture) {
		this.manuFacture = manuFacture;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isSwicher() {
		return switcher;
	}
	public void setSwicher(boolean switcher) {
		this.switcher = switcher;
	}
	
	public String toString() {
		return "nha san xuat : "+ manuFacture +
				"\ngia ban : " + price +
				 "\nID : " + id +
				 "\ncong tac : " + switcher;
	}
	public void update() {
		
	}
	public void turnOn() {

	}
	public void turnOff() {

	}
}
