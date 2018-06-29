package RPC.RMI;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        // 注册管理器
        Registry registry = CommonRegistry.getInstance().getRegistry("127.0.0.1", 33333);

        try {
            // 根据命名获取服务
            IService service = (IService) registry.lookup("vince");
            // 调用远程方法
            String result = service.queryName("Jack");
            System.out.println("result from remote :" + result);
        } catch (AccessException e) {

        } catch (RemoteException e) {

        } catch (NotBoundException e) {

        }

    }
}
