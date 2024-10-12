package mru.lab2.problemdomain;

// The purpose of this class is to model a television
// John Lowen David Feburary 19, 2024

public class Television {
	
	final String MANUFACTURER; // Name of the manufacturer of the TV
	final int SCREEN_SIZE; // Size of the screen of the TV
	boolean powerOn; // Variable that will tell you if the power is on or off
	int channel; // Holds the value of the station that the TV is showing
	int volume; // Holds the value that respresents the loudness of the TV
	
	
	// The purpose of this constructor is to find the brand of the TV, the screen size, and to give default values to the TV
	public Television(String brand, int screen_size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = screen_size;
		powerOn = false;
		volume = 20;
		channel = 2;
		
	}

	public int getVolume() {
		return volume;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	public void power() {
		powerOn = !powerOn;
	}
	
	public void setChannel(int setChannel) {
		channel = setChannel;
	}
	
	/**
	 * This method increases the volume variable by 1
	 */
	public void increaseVolume() {
		volume += 1;
	}
	
	/**
	 * This method decreases the volume variable by 1
	 */
	public void decreaseVolume() {
		volume -= 1;
	}
	
	
	
	
}
