/*
 * Exemple09.java       09/06/2021
 *
 *
 * ���Copyright 2021 Joan Seculi <jseculi@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package teoria_joan_seculi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Exemple09 {

	public static void main(String[] args) {

		String file = "./src/teoria_joan_seculi/metamorphosis.txt";
		TextFile myTextFile = new TextFile();
		System.out.println("Read opcio 1");
		 try {
			System.out.println(myTextFile.readFile(file));
			return;
			
		} catch (FileNotFoundException e) {
				System.out.println("File not found: " + e.getMessage());
		
		} catch (IOException e) {
			System.out.println("File can't be read: " + e.getMessage());
		} finally {
			System.out.println("The end!");
		}
		System.out.print("Unreacheable code!");
	
	}
}


