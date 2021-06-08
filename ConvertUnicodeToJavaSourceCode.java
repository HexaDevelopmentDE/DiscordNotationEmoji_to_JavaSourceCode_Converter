
public class ConvertUnicodeToJavaSourceCode {
	/**
	 * Transform an unicode to java source code
	 * @param unicode
	 * @return
	 */
	public String convertToJava(String unicode){
		String javaSourceCode = "\\u";

		char[] uniArray = unicode.toCharArray();
		for(int i = 3; i < uniArray.length; i++) {
			javaSourceCode = javaSourceCode + uniArray[i];
		}
		
		return javaSourceCode;
	}
}
