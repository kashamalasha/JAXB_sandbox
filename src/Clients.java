import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by katerinache on 14/11/15.
 */
@XmlRootElement(name = "Clients")
public class Clients {
    private List<Client> clients = new ArrayList<Client>();

    @XmlElement(name = "Client")
    public List<Client> getClients() {
        return clients;
    }
}
