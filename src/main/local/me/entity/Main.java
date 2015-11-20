package local.me.entity;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by katerinache on 14/11/15.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        /*local.me.entity.Client client1 = new local.me.entity.Client();
        client1.setName("John");
        client1.setPhone("+05522332344");

        local.me.entity.Client client2 = new local.me.entity.Client();
        client2.setName("Bill");
        client2.setPhone("+05565666545");

        local.me.entity.Clients clients = new local.me.entity.Clients();
        clients.getClients().add(client1);
        clients.getClients().add(client2);

        for (local.me.entity.Client client : clients.getClients()) {
            System.out.println(client.getName() + "\t" + client.getPhone());
        }*/

        /*
        JAXBContext context = JAXBContext.newInstance(local.me.entity.Clients.class);
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
