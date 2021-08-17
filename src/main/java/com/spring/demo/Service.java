/**
 * 
 */
package com.spring.demo;

/**
 * @author akalgutk
 *
 */
public class Service {

	private Airtel airtel;

	public void setAirtel(Airtel airtel) {
		this.airtel = airtel;
	}

	public void service() {
		airtel.service();
	}
}
