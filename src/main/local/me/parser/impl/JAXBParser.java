package local.me.parser.impl;

import local.me.parser.Parser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

/**
 * Реализация интерфейса парсера
 */
public class JAXBParser implements Parser{
    @Override
    public Object getObject(File file, Class c) throws Exception {
        JAXBContext context = JAXBContext.newInstance(c);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object object = unmarshaller.unmarshal(new FileInputStream(file));
        return object;
    }

    @Override
    public void saveObject(File file, Object o) throws Exception {
        JAXBContext context = JAXBContext.newInstance(o.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(o, new FileWriter(file));
    }
}
