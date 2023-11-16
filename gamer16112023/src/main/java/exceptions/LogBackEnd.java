package exceptions;

import com.sun.net.httpserver.HttpsConfigurator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class LogBackEnd {

    private static Logger log = LogManager.getLogger(LogBackEnd.class);

    public static void main(String[] args) {
        Configurator.setRootLevel(Level.ALL);

        log.info("Programa iniciado");
        log.warn("O Jhin está com a 4 bala!!!!!!!!!!!!");
    }
}
