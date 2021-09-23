/**
 * @author Andrew Pierce - ajpierce1
 * CIS175 - Fall 2021
 * Sep 22, 2021
 */
package model;

/**
 * @author Andrew Pierce - ajpierce1
 */
public class TempConverter {
	private static final String fahrenheit = "Convert to Celsius";
	private static final String celsius = "Convert to Fahrenheit";
	private double tempToBeConverted;
	private double fahrenheitTemp;
	private double celsiusTemp;

	/**
	 * 
	 */
	public TempConverter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param temperature
	 */
	public TempConverter(String conversionType,String temperature) {
		// TODO Auto-generated constructor stub
	

		if (conversionType.equalsIgnoreCase(celsius)) {
			setTempToBeConverted(temperature);
			convertToFahrenheit();

		} else if (conversionType.equalsIgnoreCase(fahrenheit)) {
			setTempToBeConverted(temperature);
			convertToCelsius();
		}
	}

	/**
	 * 
	 */
	private void convertToFahrenheit() {
		// TODO Auto-generated method stub
		setCelsiusTemp(tempToBeConverted);
		setFahrenheitTemp(tempToBeConverted * 1.8 + 32);
	}

	/**
	 * 
	 */
	private void convertToCelsius() {
		// TODO Auto-generated method stub
		setFahrenheitTemp(tempToBeConverted);
		setCelsiusTemp(((tempToBeConverted - 32) * 5) / 9);
	}

	/**
	 * @return the tempToBeConverted
	 */
	public double getTempToBeConverted() {
		return tempToBeConverted;
	}

	/**
	 * @return the fahrenheitTemp
	 */
	public double getFahrenheitTemp() {
		return fahrenheitTemp;
	}

	/**
	 * @return the celsiusTemp
	 */
	public double getCelsiusTemp() {
		return celsiusTemp;
	}

	/**
	 * @param tempToBeConverted the tempToBeConverted to set
	 */
	public void setTempToBeConverted(String temperature) {
		this.tempToBeConverted = Double.parseDouble(temperature);
	}

	/**
	 * @param fahrenheitTemp the fahrenheitTemp to set
	 */
	public void setFahrenheitTemp(double fahrenheitTemp) {
		this.fahrenheitTemp = fahrenheitTemp;
	}

	/**
	 * @param celsiusTemp the celsiusTemp to set
	 */
	public void setCelsiusTemp(double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}

	@Override
	public String toString() {
		return this.getCelsiusTemp() + " degrees Celsius equals " + this.getFahrenheitTemp() + " degrees Fahrenheit!";
	}
}
