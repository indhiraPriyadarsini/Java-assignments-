public class CheckingDimensionsTest{
	
	CheckingDimensions checkingDimensions = new CheckingDimensions();
	

	@Test
	public void testCentimterToCentimeter() {
		Assert.assertEquals(1,checkingDimensions.convertCentimeterToCentimeter(1));
	}
	
	@Test
	public void testMeterToCentimeter() {
		Assert.assertEquals(100,checkingDimensions.convertMeterToCentimeter(1));
	}
	
	@Test
	public void testCentimeterToKilometer() {
		Assert.assertEquals("0.001",checkingDimensions.convertCentimeterToKilomter(100));
	}
	
	@Test
	public void testAddMeterWithCentimeterAndConvertToMeter() {
		Assert.assertEquals(2,checkingDimensions.addMeterWithCentimeterAndConvertToMeter(1,100));
	}
	
	@Test
	public void testAddCentimeterWithKilometerAndConvertToCentimeter() {
		Assert.assertEquals(100200,checkingDimensions.addCentimeterWithKilometerAndConvertToCentimeter(200,1));
	}
	
	@Test
	public void testConvertGramToGram() {
		Assert.assertEquals(1,checkingDimensions.convertGramToGram(1));
	}
	
	@Test
	public void testConvertKilogramToGram() {
		Assert.assertEquals(100,checkingDimensions.convertKilogramToGram(0.1));
	}
	
	@Test
	public void testAddGramWithKilogramAndConvertToGram() {
		Assert.assertEquals(1010,checkingDimensions.addGramWithKilogramAndConvertToGram(10, 1));
	}
	
	@Test
	public void testSubractGramFromKilogramAndConvertToKilogram() {
		Assert.assertEquals(1,checkingDimensions.subractGramFromKilogramAndConvertToKilogram(1.5,500));
	}
	
	@Test
	public void testConvertCelsiusToFahrenheit() {
		Assert.assertEquals(32,checkingDimensions.convertCelsiusToFahrenheit(0));
	}
	
	@Test
	public void testConvertKelvinToCelsius() {
		Assert.assertEquals(-273,checkingDimensions.convertKelvinToCelsius(0));
	}
}
