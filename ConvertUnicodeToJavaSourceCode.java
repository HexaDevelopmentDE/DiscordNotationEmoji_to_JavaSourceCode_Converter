/**
 * @version 1.0.0
 * @author Konstantin Koark
 *
 */

public class ConvertUnicodeToJavaSourceCode {
	/**
	 * Transform an unicode to java source code
	 * @param unicode
	 * @return
	 */
	public String convertToJava(String unicode){
		return unicode.replace("U", "\\").replace("+", "u").replaceFirst("1", "");
	}
}
