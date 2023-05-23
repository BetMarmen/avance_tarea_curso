package misc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class controlador{
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static String texto() {
	try {
	
	return br.readLine();
	} 
	catch(Exception e) {
		return "Usuario";
	}
	
}
public static double decimales() {
	try {
	
	return Double.parseDouble(br.readLine());
	}catch(Exception e) {
		return 0.0;
	}
	
}
public static int entero() {
	try {

	return Integer.parseInt(br.readLine());
	}catch (Exception e) {
		return 0;
	}
}
}
