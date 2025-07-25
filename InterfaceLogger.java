package Task1;

interface Logger {
	 default void logInfo() {
	 System.out.println("Default Info Log");
	 }
	 static void logError() {
	 System.out.println("Static Error Log");
	 }
	}
	class AppLogger implements Logger {}
	public class InterfaceLogger {
	 public static void main(String[] args) {
	 AppLogger logger = new AppLogger();
	 logger.logInfo();
	 Logger.logError(); // Static method
	 }
	}