package RPC.RMI;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;

// RMI服务端
public class Server {
    public static void main(String[] args){
        // 注册管理器
        Registry registry = CommonRegistry.getInstance().createRegistry(33333);

        try {
            // create a server
            ServiceImpl service = new ServiceImpl();
            registry.rebind("vince", service);
            System.out.println("bind server");
        }catch (RemoteException e){

        }
    }
}
