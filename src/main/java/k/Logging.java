package k;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class Logging {

    private static final Logger logger = LoggerFactory.getLogger(Logging.class);

    void dontConcatenate(String name) {
        logger.info("processing " + name);
    }

    void missingPlaceholders(String name) {
        logger.info("processing", name);
    }

    void extraPlaceholders(String name) {
        logger.info("processing {} {}", name);
    }

    void logException(String name) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // todo log exception
            logger.error("interrupted while processing {}", name);
        }
    }

}
