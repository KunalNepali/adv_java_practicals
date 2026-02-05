import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer implements Hello {

    @Override
    public String sayHello() {
        return "Hello from RMI Server!";
    }

    public static void main(String[] args) {
        try {
            // Create remote object
            HelloServer obj = new HelloServer();

            // Export the object
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            // Start RMI registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the remote object in the registry
            registry.bind("Hello", stub);

            System.out.println("RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
