package local.me.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс модель, обертка для клиентов
 */
@XmlRootElement(name = "Clients")
public class Clients {
    private List<Client> clients = new ArrayList<>();

    @XmlElement(name = "Client")
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
