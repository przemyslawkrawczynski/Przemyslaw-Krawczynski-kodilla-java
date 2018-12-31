package patterns.singleton;


public class Logger {
    private String lastLog = "";
    private static Logger settingLoggerInstance = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (settingLoggerInstance == null) {
            synchronized(Logger.class) {
                if (settingLoggerInstance == null) {
                    settingLoggerInstance = new Logger();
                }
            }
        }
        return settingLoggerInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}

