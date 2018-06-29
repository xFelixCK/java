package RPC.RMI;

import org.springframework.stereotype.Component;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

@Component
public class CommonRegistry {
    private static CommonRegistry registry = null;

    public static synchronized CommonRegistry getInstance() {
        if (registry == null) {
            synchronized (CommonRegistry.class) {
                if (registry == null) {
                    registry = new CommonRegistry();
                }
            }
        }
        return registry;
    }

    public Registry createRegistry(int port) {
        Registry registry = null;
        try {
            registry = LocateRegistry.createRegistry(port);
        } catch (RemoteException e) {

        }
        return registry;
    }

    public Registry getRegistry(String host, int port) {
        Registry registry = null;
        try {
            registry = LocateRegistry.getRegistry(host, port);
        } catch (RemoteException e) {

        }
        return registry;
    }
}
