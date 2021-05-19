package com.cgi;

import static com.cgi.Direction.BACKWARD;
import static com.cgi.Direction.FORWARD;

import lombok.Getter;

@Getter
public class Fan {
	public static final int OFF = 0;
	
	private int speed = OFF;
	private Direction direction = FORWARD;

	public void speedUp() {
		if (speed == 3) {
			speed = OFF;
		} else {
			speed++;
		}
	}

	public void reverseDirection() {
		direction = (direction == FORWARD) ? BACKWARD : FORWARD;
	}

	@Override
	public String toString() {
		return String.format("The fan is working on %d speed in %s direction", speed, direction);
	}
}

enum Direction {
	FORWARD,
	BACKWARD;
}