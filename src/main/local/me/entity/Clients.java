package local.me.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by katerinache on 14/11/15.
 */
@XmlRootElement(name = "local.me.entity.Clients")
public class Clients {
    private List<Client> clients = new ArrayList<Client>();

    @XmlElement(name = "local.me.entity.Client")
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
