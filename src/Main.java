import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.FileWriter;

/**
 * Created by katerinache on 14/11/15.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Client client1 = new Client();
        client1.setName("Dima");
        client1.setPhone("89261580974");

        Client client2 = new Client();
        client2.setName("Katya");
        client2.setPhone("89030014484");

        Clients clients = new Clients();
        clients.getClients().add(client1);
        clients.getClients().add(client2);

        JAXBContext context = JAXBContext.newInstance(Clients.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(clients, new FileWriter("test.xml"));

    }
}
