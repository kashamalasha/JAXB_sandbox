package local.me;

import local.me.entity.Client;
import local.me.entity.Clients;
import local.me.parser.Parser;
import local.me.parser.impl.JAXBParser;

import java.io.File;
import java.util.Scanner;


/**
 * Тестовый класс
 */
public class JAXBParserTest {
    public static void main(String[] args) throws Exception {

        //Объявление переменных
        Scanner scanner = new Scanner(System.in);
        Parser parser = new JAXBParser();
        File file = new File("test.xml");

         //Считывание информации из XML файла и вывод на экран
        Clients clients = (Clients) parser.getObject(file, Clients.class);
        for (Client client : clients.getClients()) {
            System.out.println(client.getName() + "\t" + client.getPhone());
        }

        //Добавление двух новых записей
        System.out.print("Add: Press any key");
        scanner.nextLine();

        Client client1 = new Client();
        client1.setName("Ekaterina12");
        client1.setPhone("+79030014484");

        Client client2 = new Client();
        client2.setName("Dmitry5");
        client2.setPhone("+79261580974");

        clients.getClients().add(client1);
        clients.getClients().add(client2);

        parser.saveObject(file, clients);

        //Удаление двух первых записей
        System.out.print("Delete: Press any key");
        scanner.nextLine();

        for (int i = 0; i < 2; i++) {
            clients.getClients().remove(0);
        }

        parser.saveObject(file, clients);

         //Считывание информации из XML файла и вывод на экран
        clients = (Clients) parser.getObject(file, Clients.class);
        for (Client client : clients.getClients()) {
            System.out.println(client.getName() + "\t" + client.getPhone());
        }

    }

}

