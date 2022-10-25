/*
 * FinchMove.java        1.0 Feb 1, 2019
 *
 * Models the program.
 *
 * Copyright 2018 Rafel Botey Agusti <rbotey@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package part3;

import finchRobot.Finch;

public class FinchMove {

	private Finch finch;

	public FinchMove(Finch finch) {
		this.finch = finch;
	}

	public void moveForward() {
		this.finch.setWheelVelocities(180,180,1800);
	}

	public void moveRight() {
		this.finch.setWheelVelocities(80,-80,800);
	}

	public void moveLeft() {
		this.finch.setWheelVelocities(-80,80,800);
	}

}
