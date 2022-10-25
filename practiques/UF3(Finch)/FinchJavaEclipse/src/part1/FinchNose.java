/*
 * FinchNose.java        1.0 Feb 1, 2022
 *
 * Models the program.
 *
 * Copyright 2022 Rafel Botey Agusti <rbotey@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package part1;

import finchRobot.Finch;

public class FinchNose extends FinchAction {

	public FinchNose(String action, Finch finch) {
		super(action, finch);
	}

	public void execute() {
		String [] parametros = getAction().split(" ");
		int r = Integer.parseInt(parametros[0]);
		int g = Integer.parseInt(parametros[1]);		
		int b = Integer.parseInt(parametros[2]);
	    // Lanzamos la orden 	
		getFinch().setLED(r,g,b);
	}

	@Override
	public String toString() {
		return "NOSE " + getAction();

	}

}
