package Tema1.ejemploClaseRunTime;

import java.io.IOException;

public class ClaseRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Runtime rt = Runtime.getRuntime();
				String[] informacionProceso = {"notePad.exe","miFichero.txt"};
				Process proceso;
				try {
					proceso = rt.exec(informacionProceso);
					int codigoRetorno = proceso.waitFor(); //Espero a que termine
					System.out.println("Fin" + codigoRetorno);
				} catch (IOException e) {
					e.getMessage();
				} catch (InterruptedException e) {
					e.getMessage();
				}

				
				System.out.println("Memoria Libre:" + rt.freeMemory());
				System.out.println("Total Memoria:" + rt.totalMemory());
				System.out.println("Max Memoria:" + rt.maxMemory());
				System.out.println("Nº Procesadores" + rt.availableProcessors());
				System.out.println("JRE Version:" + rt.version());
				System.out.println("Terminando programa...");
				rt.exit(1); //Termina la ejecución de la máquina virtual
		}

}
