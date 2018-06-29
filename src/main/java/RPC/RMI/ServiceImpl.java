package RPC.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// 服务实现
public class ServiceImpl  extends UnicastRemoteObject implements IService {
    private static final long serivalVersionUID = 682805210518738166L;

    protected ServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String queryName(String no) throws RemoteException {
        return "hello " + no;
    }
}
