package com.masai;

public class Engine {

	int rmp;
	int Power;
	String manufacturer;
	Boolean hasTurbo =false;
	
	void hadTurbo() {
		hasTurbo=true;
	}
	public Engine(int rmp,int power,String manufacturer,Boolean hasTurbo ) {
		setRmp(rmp);
		setPower(power);
		setManufacturer( manufacturer);
		setHasTurbo( hasTurbo);
	}
	public int getRmp() {
		return rmp;
	}
	public void setRmp(int rmp) {
		this.rmp = rmp;
	}
	public int getPower() {
		return Power;
	}
	public void setPower(int power) {
		Power = power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Boolean getHasTurbo() {
		return hasTurbo;
	}
	public void setHasTurbo(Boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}

}
