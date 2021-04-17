package ro.ase.cts.flyweight.clase;
import java.util.HashMap;
import java.util.Map;

public class FabricaClienti {
    private Map<String, Client> clientMap;

    public FabricaClienti(){
        clientMap=new HashMap<String, Client>();
    }
    public Client getClient(String email){
        if(clientMap.containsKey(email)){
            return clientMap.get(email);
        }
        else{
            Client client=new Client("Cristina","08001",email);
            clientMap.put(email,client);
            return client;
        }
    }
}
