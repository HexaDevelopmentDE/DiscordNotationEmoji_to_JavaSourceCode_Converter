import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * @version 1.0.0
 * @author konst
 *
 */

public class ConvertDiscordNotationToJavaSourceCode {
    /**
     * Transform an unicode to java source code
     * using https://www.fileformat.info/ as emoji database
     * 
     * @param notation		discord notation of an emoji
     * @return				java source code version of this emoji
     * @throws IOException 
     */
    public String convertToJava(String notation) throws IOException{
		
		URL url1 = new URL("https://www.fileformat.info/info/emoji/"+ notation.replaceAll(":", "").toLowerCase() +"/index.htm"); 
    	HttpURLConnection con = (HttpURLConnection) url1.openConnection();
    	con.setRequestMethod("GET");
    	con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
    	BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
    	String line;
    	ArrayList<String> arr = new ArrayList<String>();
    	while ((line = reader.readLine()) != null) {
    		arr.add(line);
    	}
    	con.disconnect();
    	reader.close();
    	
    	URL url2 = new URL("https://www.fileformat.info/"+ arr.get(91).substring(17, 50));
    	HttpURLConnection con2 = (HttpURLConnection) url2.openConnection();
    	con2.setRequestMethod("GET");
    	con2.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
    	reader = new BufferedReader(new InputStreamReader(con2.getInputStream()));
    	arr = new ArrayList<String>();
    	while ((line = reader.readLine()) != null) {
    		arr.add(line);
    	}
    	con2.disconnect();
    	reader.close();
    	
    	return arr.get(191).substring(26, 38);
	}
}
