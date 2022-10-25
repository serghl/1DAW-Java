/*
 * MyException.java       10/06/2021
 *
 *
 * �Copyright 2021 Joan Seculi <jseculi@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package teoria_joan_seculi;

public class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
	}

	public String getLocalizedMessage() {
		String error = super.getMessage();
		error += "Personilize message.";
		return error;
	}
}
