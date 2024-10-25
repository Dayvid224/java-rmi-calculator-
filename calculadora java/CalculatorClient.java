import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class CalculatorClient {
    @SuppressWarnings({ "UseSpecificCatch", "unchecked" })
    public static <Calculator> void main(String[] args) {
        try {
            Calculator calculator = (Calculator) extracted();
            System.out.println("Adição: " + ((Object) calculator).add(20, 15));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static Remote extracted() throws NotBoundException, MalformedURLException, RemoteException {
        return Naming.lookup("rmi://127.0.0.1:1020/CalculatorService");
    }
}

