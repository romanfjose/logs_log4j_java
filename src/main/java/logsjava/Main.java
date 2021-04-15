package logsjava;

import org.apache.log4j.Logger;

public class Main {

	private static Logger logJava = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		logJava.debug("LOG DEBUG");
		logJava.info("LOG INFO");
		logJava.warn("LOG WARN");
		logJava.error("LOG ERROR");
		logJava.fatal("LOG FATAL");
		
//		#DEBUG. Usado para escribir mensajes de depuraci�n
//		#INFO. Mensajes de estilo verbose. Puramente informativos de determinada acci�n
//		#WARN. Para alertar de eventos de los que se quiere dejar constancia pero que no afectan al funcionamiento de la aplicaci�n
//		#ERROR. Usado para los mensajes de eventos que afectan al programa pero lo dejan seguir funcionando. Alg�n par�metro no
//		#es correcto pero se carga el par�metro por defecto, por ejemplo
//		#FATAL. Usado para errores cr�ticos. Normalmente despu�s de guardar el mensaje el programa terminar�
		
	}

}
