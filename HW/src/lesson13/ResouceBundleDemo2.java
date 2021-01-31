package lesson13;

import java.util.ResourceBundle;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
public class ResouceBundleDemo2 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		printInfo("","");
		printInfo("en", "US");
		printInfo("uk", "UA");
	}
	public static void printInfo(String language, String country) throws UnsupportedEncodingException  {
		 	Locale current = new Locale(language, country);
			ResourceBundle rb = ResourceBundle.getBundle("topic", current);
			for (String key:rb.keySet()) {
				String value= rb.getString(key);
				System.out.println(value);
			}
			System.out.println();
		}
	}

