import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

/**
 * Базовый класс
 */
public class Main {
    public static void main(String[] args) throws Exception{
        /*Client client1 = new Client();
        client1.setName("John");
        client1.setPhone("+05522332344");

        Client client2 = new Client();
        client2.setName("Bill");
        client2.setPhone("+05565666545");

        Clients clients = new Clients();
        clients.getClients().add(client1);
        clients.getClients().add(client2);

        for (Client client : clients.getClients()) {
            System.out.println(client.getName() + "\t" + client.getPhone());
        }*/

        /*
        JAXBContext context = JAXBContext.newInstance(Clients.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(clients, new FileWriter("test.xml"));
        */
        File file = new File("test.xml");

        JAXBContext context = JAXBContext.newInstance(Clients.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Clients clients = (Clients) unmarshaller.unmarshal(new FileInputStream(file));

        for (Client client : clients.getClients()) {
            System.out.println(client.getName() + "\t" + client.getPhone());
        }
    }
}
