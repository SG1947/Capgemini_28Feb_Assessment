package com.capg.Spring2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	private int bikeId;
	private String bikeName;
	private String colour;

	public int getBikeId() {
		return bikeId;
	}
	@Value("100")
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
   
	public String getBikeName() {
		return bikeName;
	}
	@Value("Pulsar")
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getColour() {
		return colour;
	}
	@Value("Blue")
	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", bikeName=" + bikeName + ", colour=" + colour + "]";
	}

}
