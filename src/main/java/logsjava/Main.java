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
		
//		#DEBUG. Usado para escribir mensajes de depuración
//		#INFO. Mensajes de estilo verbose. Puramente informativos de determinada acción
//		#WARN. Para alertar de eventos de los que se quiere dejar constancia pero que no afectan al funcionamiento de la aplicación
//		#ERROR. Usado para los mensajes de eventos que afectan al programa pero lo dejan seguir funcionando. Algún parámetro no
//		#es correcto pero se carga el parámetro por defecto, por ejemplo
//		#FATAL. Usado para errores críticos. Normalmente después de guardar el mensaje el programa terminará
		
	}

}
