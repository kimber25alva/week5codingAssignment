
interface Logger {
    void log(String message);
    void error(String message);
}

class AsteriskLogger implements Logger {
  
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    public void error(String message) {
        System.out.println("****************");
        System.out.println("***Error: " + message + "***");
        System.out.println("****************");
    }
}

class SpacedLogger implements Logger {

    public void log(String message) {
        StringBuilder spacedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            spacedMessage.append(message.charAt(i)).append(" ");
        }
        System.out.println(spacedMessage.toString().trim());
    }
    
    public void error(String message) {
        StringBuilder spacedErrorMessage = new StringBuilder("ERROR: ");
        for (int i = 0; i < message.length(); i++) {
            spacedErrorMessage.append(message.charAt(i)).append(" ");
        }
        System.out.println(spacedErrorMessage.toString().trim());
    }
}

public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}