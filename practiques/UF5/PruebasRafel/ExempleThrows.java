/*
 * ExempleThrows.java       23/04/2021
 *
 *
 * ���Copyright 2021 Joan Seculi <jseculi@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package teoria_joan_seculi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Run As > Run Configuration > Common > Enconding > Other > UTF-8
public class ExempleThrows {
    
    public static void main(String[] args)  {
        try {
            String text = readFile("./src/teoria_joan_seculi/metamorphosis.tt");
            System.out.println(text); 
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            //In case the file has been moved, delete, ...
            System.out.println("Error: " + e.getMessage()); 
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("The end"); 
        }
    }
    
    public static String readFile(String file) throws FileNotFoundException, IOException {
        
        FileReader fr = new FileReader(file);
        String text = "";
        int c = fr.read();
        while (c !=- 1) {
            text += (char) c;
            c=fr.read();
        }
        fr.close();
        return text;
    }
    
    
}
