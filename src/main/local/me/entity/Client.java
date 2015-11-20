package local.me.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Класс Модель, содержащий данные о клиентах
 */
@XmlType
public class Client {
    private String name;
    private String phone;

    @XmlElement(name = "Name")
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
