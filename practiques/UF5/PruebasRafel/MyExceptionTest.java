/*
 * MyExceptionTest.java       10/06/2021
 *
 *
 * �Copyright 2021 Joan Seculi <jseculi@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package teoria_joan_seculi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			test1();
		} catch (MyException e) {
			System.out.println("Error test1(): " + e.getMessage() + e.getCause());
			System.out.println("Error test1(): " + e.getLocalizedMessage());
			
		}
		
		try {
			test2();
		} catch (MyException e) {
			System.out.println("Error test2(): " + e.getMessage() + e.getCause());
			System.out.println("Error test2(): " + e.getLocalizedMessage());
			
		}
		
		
	}

	public static void test1() throws MyException {
		throw new MyException("Something went wrong!! ");
	}
	
	public static void test2() throws MyException {
		try {
			FileReader fr = new FileReader(
					"file.txt");  //Does not exists
		} catch (FileNotFoundException e) {
			System.out.println(e.getCause());
			throw new MyException("Something went wrong!! ", e);
		} catch (IOException e) {
			System.out.println(e.getCause());
			throw new MyException("Something went wrong!! ", e);
		}
		
	}
}
