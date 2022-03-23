package junittesting;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidateTesting {
	@Test
	public void validatingTestOne() {
		assertFalse(ValidateIPv4Address.validate("3.4.5.255"));
	}
	@Test
	public void validatingTestTwo() {
		assertFalse(ValidateIPv4Address.validate("3.4.5.0"));
	}
	@Test
	public void validatingTestSix() {
		assertFalse(ValidateIPv4Address.validate("3.0.225"));
	}
	@Test
	public void validatingTestThree() {
		assertTrue(ValidateIPv4Address.validate("3.4.5.9"));
	}
	@Test
	public void validatingTestFour() {
		assertTrue(ValidateIPv4Address.validate("3.78.5.6"));
	}
	}
