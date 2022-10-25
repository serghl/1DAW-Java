/*
 * FinchMove.java        1.0 Feb 1, 2022
 *
 * Models the program.
 *
 * Copyright 2022 Rafel Botey Agusti <rbotey@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package part2;
import finchRobot.Finch;

public class FinchMove extends FinchAction {

 public FinchMove(String action, Finch finch) {
  super(action, finch); 
 }

 public void execute() {
	 String [] parametros = getAction().split(" ");
		int miliSeconds = Integer.parseInt(parametros[0]);
		int left = Integer.parseInt(parametros[1]);		
		int right = Integer.parseInt(parametros[2]);
	    // Lanzamos la orden 	
		getFinch().setWheelVelocities(left,right,miliSeconds);
 }
 
 @Override
 public String toString() {
  // TO DO
  return null;
 }
 

}
