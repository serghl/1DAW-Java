/*
 * FinchAction.java        1.0 Feb 1, 2022
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
public abstract class  FinchAction {
  
 protected final Finch finch; 
 protected final String action;  
 
 public FinchAction(String action, Finch finch) {
  this.action = action;
  this.finch = finch;
 }

 public String getAction() {
  return action;
 }
 
 public Finch getFinch() {
		return this.finch;
	}
    
 public abstract void execute();
 
 @Override
 public String toString() {
  return null;
 }

}
