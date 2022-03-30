public class CheckingDimensions {
	
	
	public int convertCentimeterToCentimeter(int value) {
		return value;
	}
	
	public int convertMeterToCentimeter(int meterValue) {
		
		return meterValue*100;
	}
	
	public String convertCentimeterToKilomter(int centimeterValue) {
		float kilometerValue=100/100000;
		System.out.println(kilometerValue);
		return "";
		
	}
	
	public int addMeterWithCentimeterAndConvertToMeter(int meterValue,int centimeterValue) {
		meterValue+=(centimeterValue*100);
		return meterValue;
	}
	
	public int addCentimeterWithKilometerAndConvertToCentimeter(int centimeterValue,int kilometerValue) {
		centimeterValue+=(kilometerValue*100000);
		return centimeterValue;
	}
	
	public int convertGramToGram(int gramValue) {
		return gramValue;
	}
	
	public int convertKilogramToGram(double kilogramValue) {
		return (int) (kilogramValue*1000);
	}
	
	public int addGramWithKilogramAndConvertToGram(int gramValue, int kilogramValue) {
		gramValue+=(kilogramValue*1000);
		return gramValue;
	}
	
	public int subractGramFromKilogramAndConvertToKilogram(double kilogramValue, int gramValue) {
		kilogramValue-=(gramValue/1000);
		return (int)kilogramValue;
	}
	
	public int convertCelsiusToFahrenheit(int celsiusValue) {
		int fahrenheit = (0*(9/5))+32;
		return fahrenheit;
	}
	
	public int convertKelvinToCelsius(int kelvinValue) {
		int celsiusValue = (int)(0-273.15);
		return celsiusValue;
	}
}
