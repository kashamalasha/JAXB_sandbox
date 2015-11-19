package MyApp;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by katerinache on 14/11/15.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        /*MyApp.Client client1 = new MyApp.Client();
        client1.setName("John");
        client1.setPhone("+05522332344");

        MyApp.Client client2 = new MyApp.Client();
        client2.setName("Bill");
        client2.setPhone("+05565666545");

        MyApp.Clients clients = new MyApp.Clients();
        clients.getClients().add(client1);
        clients.getClients().add(client2);

        for (MyApp.Client client : clients.getClients()) {
            System.out.println(client.getName() + "\t" + client.getPhone());
        }*/

        /*
        JAXBContext context = JAXBContext.newInstance(MyApp.Clients.class);
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
