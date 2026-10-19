package Tema1.ejemploClaseRunTime;

import java.io.IOException;


	public class EjecutaClase {
		
		private final static String directorioGenerarClasses = "target\\classes";
		private final static String rutaSourceJava = "src\\main\\java\\Tema1.ejemploClaseRunTime\\EjecutaJava.java";

		public int lanzaCompilador(String rutaFicheroFuente, String rutaParaGenerarClass) {
			ProcessBuilder pb;
			int exit = 0;
			try {
				String[] comando = { "javac", "-d", directorioGenerarClasses, rutaSourceJava};
				pb = new ProcessBuilder(comando);
				pb.inheritIO(); // La salidas y los errores se ven por consola
				Process proceso = pb.start();
				exit = proceso.waitFor(); //esperamos a que javac termine 
				System.out.println("javac terminó con código {}" + exit); 

			} catch (Exception e) { 			
				System.out.println(e.getMessage()); 		}
			return exit;
		}
			
	public int ejecutaClase (String clase) {
	    int resultado = -1;
	    String claseCompleta =  clase;
	   try {
			String[] comando = {"java", "-cp",directorioGenerarClasses, claseCompleta };
			ProcessBuilder pb  = new ProcessBuilder(comando);
			pb.redirectErrorStream(true);
			pb.inheritIO();
			Process proceso = pb.start();
			int exit = proceso.waitFor();
			System.out.println(exit);
		} catch (Exception e) { //OjO estoy capturando Exception, para que quepa. Habría que capturar diferentes excepciones

			System.out.println(e.getMessage());
			
		}
	   return resultado;

	 
}
	public static void main(String[] args) {
		EjecutaClase l = new EjecutaClase();
		//int codigo= l.lanzaCompilador(rutaSourceJava, directorioGenerarClasses);      
		int resultado = l.ejecutaClase(rutaSourceJava);
		
		if (args.length == 2) {
			System.out.println("Recibo : " + " " + args[0] + " " + args[1]);
		}else {
			System.out.println("No recibo nada");
		}
	
	
	
	} 

	
	}
