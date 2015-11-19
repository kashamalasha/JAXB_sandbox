package MyApp;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by katerinache on 14/11/15.
 */
@XmlRootElement(name = "MyApp.Clients")
public class Clients {
    private List<Client> clients = new ArrayList<Client>();

    @XmlElement(name = "MyApp.Client")
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
