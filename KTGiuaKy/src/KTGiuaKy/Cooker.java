package KTGiuaKy;

public class Cooker extends ElectricalDevice {
	protected boolean cooking;

	public Cooker(String manuFacture, int price, String id, boolean switcher, boolean cooking) {
		this.manuFacture = manuFacture;
		this.price = price;
		this.id = id;
		this.switcher = switcher;
		this.cooking = cooking;
	}

	public boolean isCooking() {
		return cooking;
	}

	public void setCooking(boolean cooking) {
		this.cooking = cooking;
	}

	public void Cook() {
		cooking = true;
	}

	public void narm() {
		cooking = false;
	}

	public void update() {

	}
}
