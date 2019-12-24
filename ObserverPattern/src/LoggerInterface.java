import java.util.logging.Logger;

public class LoggerInterface implements Observer {
    private Subject subject;
    final static Logger LOGGER = Logger.getLogger(LoggerInterface.class.getName());

    public void log() {
        LOGGER.info("LoggerInterface log: " + subject.toString());
    }

    @Override
    public void update(Subject subject) {
        this.subject = subject;
        log();
    }
}
