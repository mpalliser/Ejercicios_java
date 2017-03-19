import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDniNie {
	//static String expresion = "(\\d{8})([^ÑOUI])|([X-Z])(\\d{7})([^ÑOUI])";
	// String expresion = "(\\d{8})([A-Z&&[^ÑOUI]])|([XYZ])(\\d{7})([A-Z&&[^ÑOUI]])";
	static String expresion = "(^\\d{8}[A-Z&&[^IÑOU]])|(^[XYZ]\\d{7}[A-Z&&[^IÑOU]])";
	static Pattern expresionRegular = Pattern.compile(expresion);
	static ArrayList<String> listaDniErroneos = new ArrayList<>();
	static ArrayList<String> listaNieErroneos = new ArrayList<>();
	
	public static void main(String[] args) {
		String testDni = "12345678D";
		String testNie = "X1234567D";
		String dniError = "1234567Ñ";
		String nieError = "123456N";
		testearIdentificacion(testDni);
		testearIdentificacion(testNie);
		testearIdentificacion(dniError);
		testearIdentificacion(nieError);
		String[] casosTest = { // casos DNI PASS
		 		"78484464T","72376173A","01817200Q","95882054E","63587725Q",
		 		"26861694V","21616083Q","26868974Y","40135330P","89044648X",
		 		"80117501Z","34168723S","76857238R","66714505S","66499420A",
		 		// casos NIE PASS
		 		"X1234567T", "Y1234567T", "Z1234567T",
		 		// casos NIE FAIL
		 		"J1234567T", "H1234567T", "R1234567T",
		 		"X12345678X", "X1234T", "X1234567I"
		 		};
		for (String test : casosTest){
			testearIdentificacion(test);
		}
		System.out.println("***************************");
		System.out.println("Test DNI erroneos");
		for(int i= 0; i <15; i++){
			crearDni();
		}
		for(String dni : listaDniErroneos){
			testearIdentificacion(dni);
		}
		for (int i = 0; i<15; i++){
			crearNie();
		}
		System.out.println("***************************");
		System.out.println("Test NIE erroneos");

		for(String nie : listaNieErroneos){
			testearIdentificacion(nie);
		}
	}
	
	public static void testearIdentificacion(String documento){
		Matcher matcher = expresionRegular.matcher(documento);
		if (matcher.find()){
			String matchEncontrado = matcher.group();
			if (matchEncontrado == documento){
				System.out.println(matchEncontrado + ": PASS");
			} else {
				System.out.println(matchEncontrado + ":FAIL");
			}
		}else{
				System.out.println("Match no encontrado");
		}
	}
	
	public static void crearDni(){
		String[] letrasErroneas = {"Ñ","O","U","I"};
		String dni = "";
		Integer indiceRandom = ThreadLocalRandom.current().nextInt(0,3);
		for (int i = 0; i< 8; i++){
			Integer numeroRandom = ThreadLocalRandom.current().nextInt(0,9);
			dni = dni + String.valueOf(numeroRandom);
		}
		dni = dni + letrasErroneas[indiceRandom];
		listaDniErroneos.add(dni);
	}
	public static void crearNie(){
		char[] letrasErroneas = {'Ñ','I','O','U'};
		String nie = ""; 
		Integer indiceRandom = ThreadLocalRandom.current().nextInt(0,3);
		Integer primeraLetra = ThreadLocalRandom.current().nextInt(65,88);
		nie = nie + String.valueOf(Character.toChars(primeraLetra));
		for (int i = 0; i< 7; i++){
			Integer numeroRandom = ThreadLocalRandom.current().nextInt(0,9);
			nie = nie + String.valueOf(numeroRandom);
		}
		nie = nie + letrasErroneas[indiceRandom];
		listaNieErroneos.add(nie);
	}
	
}
