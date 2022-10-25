/*
 * FinchActionList.java        1.0 Feb 1, 2022
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

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FinchActionList {

	private final String fileName;
	private ArrayList<FinchAction> actions;
	private final Finch finch;

	public FinchActionList(String fileName) {
		this.fileName = fileName;
		this.actions = new ArrayList<FinchAction>();
		this.finch = null;
	}

	public ArrayList<FinchAction> getActions() {
		return actions;
	}

	public Finch getFinch() {
		return this.finch;
	}

	public void setActions(ArrayList<FinchAction> actions) {
		this.actions = actions;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void addAction(FinchAction finchAction) {
		this.actions.add(finchAction);
	}

	public void removeAction(FinchAction finchAction) {
		this.actions.remove(finchAction);
	}

	public void removeFile(String filename) {
		final File file = new File(filename);
		file.delete();
	}

	public void importOrders() {
		Reader r = new Reader(this.fileName);
		String orderLine = r.readLine();
		while (orderLine != null) {
			String orders[] = orderLine.split(" ", 2);
			if (orders[0].equals("MOVE")) {
				FinchMove fM = new FinchMove(orders[1], finch);
				addAction(fM);
			} else if (orders[0].equals("NOSE")) {
				FinchNose fN = new FinchNose(orders[1], finch);
				addAction(fN);
			}
			orderLine = r.readLine();
		}
		r.close();
	}

	public void exportOrders() {
		Scanner o = new Scanner(System.in);
		System.out.println("¿Nombre del archivo para exportar? (Sin fecha ni extensión)");
		String str = o.nextLine();
		Writer wr = new Writer("./src/orders/" + str + "_" + LocalDate.now() + ".txt");
		for (FinchAction f : actions) {
			System.out.println(f.toString());
			wr.println(f.toString());
		}
		System.out.println("Ordenes exportadas al archivo : " + str + "_" + LocalDate.now() + ".txt");
		wr.close();
	}

	public void displayOrders() {
		for (FinchAction f : this.actions) {
			System.out.println(f.toString());
		}
	}

	public void displayOrders2() {
		int i = 1;
		for (FinchAction f : this.actions) {
			System.out.println(i + " - " + f.toString());
			i++;
		}
	}

	public void removeOrders() {
		this.actions = new ArrayList<FinchAction>();
	}

	public void execute(int seconds) {
		for (FinchAction f : this.actions) {			
			f.execute();
			getFinch().sleep(seconds);
		}
	}

	public void executeOrder(String order) {

	}

}
