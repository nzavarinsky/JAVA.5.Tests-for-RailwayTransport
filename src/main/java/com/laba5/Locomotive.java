package com.laba5; /**
 * @author Zavarynskyi Nazarii
 * @since 22.02.17
 */

/**
 * Represents com.laba5.Locomotive-type
 * of train and shows basic info.
 */

class Locomotive  {


	public  String nameOfLocomotive,
			departure,
			arrival;

	public Locomotive(String nameOfLocomotive, String departure, String arrival) {
		this.nameOfLocomotive = nameOfLocomotive;
		this.departure = departure;
		this.arrival = arrival;
	}

	/**
	 * 	@return info about arrival
	 *  and departure of locomotive.
	 */

	@Override
	public String toString() {
		return "Name of locomotive is : " + nameOfLocomotive + "\n"
				+ "com.laba5.Locomotive departure is  " + departure
				+ " and arrival is " + arrival
				+ "\n__________________________";

	}


}
