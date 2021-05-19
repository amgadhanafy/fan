package com.cgi;

import static com.cgi.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FanTest {

	private Fan fan;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		fan = new Fan();
	}

	@Test
	void testSpeedUp() {
		assertEquals(FORWARD, fan.getDirection());
		assertEquals(0, fan.getSpeed());
		
		fan.speedUp();
		assertEquals(1, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());
		System.out.println(fan.toString());

		fan.speedUp();
		assertEquals(2, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());

		fan.speedUp();
		assertEquals(3, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());
		
		fan.speedUp();
		assertEquals(0, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());
	}

	@Test
	void testReverseSpeedupDirection() {
		assertEquals(0, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());
		
		fan.reverseDirection();
		assertEquals(0, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());
		
		fan.speedUp();
		assertEquals(1, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());
		
		fan.reverseDirection();
		assertEquals(1, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());
		
		fan.speedUp();
		assertEquals(2, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());

		fan.reverseDirection();
		assertEquals(2, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());
		
		fan.speedUp();
		assertEquals(3, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());
		
		fan.reverseDirection();
		assertEquals(3, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());
		
		fan.speedUp();
		assertEquals(0, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());
		
		fan.reverseDirection();
		assertEquals(0, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());
		
	}
	@Test
	void testReverseDirection() {
		assertEquals(FORWARD, fan.getDirection());
		assertEquals(0, fan.getSpeed());
		
		fan.reverseDirection();
		assertEquals(BACKWARD, fan.getDirection());
		assertEquals(0, fan.getSpeed());
		
		fan.speedUp();
		assertEquals(1, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());
		
		fan.speedUp();
		assertEquals(2, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());

		fan.speedUp();
		assertEquals(3, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());
		
		fan.speedUp();
		assertEquals(0, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());
	}

}
