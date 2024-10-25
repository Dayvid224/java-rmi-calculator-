import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer<Calculator> {

    public CalculatorServer() {
        try {
            // Cria o registro RMI
            LocateRegistry.createRegistry(1020);

            final Calculator calculator = new CalculatorImpl();
            Naming.rebind("rmi://127.0.0.1:1020/CalculatorService", (Remote) calculator);
            System.out.println("Servidor RMI iniciado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        new CalculatorServer();
    }
}


