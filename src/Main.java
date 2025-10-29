public class Main {
    public static void main(String[] args) throws Exception { // Add 'throws Exception' because SimpleHTTPServer.main throws it
        // **CORRECT WAY:** Call the static main method directly using the class name.
        System.out.println("Starting Simple HTTP Server from Main...");
        SimpleHTTPServer.main(new String[]{});

        // Note: The execution will not proceed past the above line
        // because SimpleHTTPServer.main runs an infinite 'while(true)' loop
    }
}