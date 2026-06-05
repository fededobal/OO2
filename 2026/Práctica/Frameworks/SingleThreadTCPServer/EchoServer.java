
import java.io.PrintWriter;

public class EchoServer extends SingleThreadTCPServer {
   
    public void handleMessage(String message, PrintWriter out) {
        out.println(message);
    }

    @Override
    protected boolean hayQueCerrar(String inputLine) {
        return inputLine.equals("EXIT") || inputLine.equals("SALIR");
    }

    public static void main(String[] args) {

        new EchoServer().startLoop(args);

    }

}