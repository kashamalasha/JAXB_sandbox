package local.me.parser;

import java.io.File;

/**
 * Интерфейс для маршаллинга и демаршаллинга данных
 */
public interface Parser {

    /**
     * Демаршализация - Получает объект на основе данных файла XML
     * @param file файл со структорой данных
     * @param c целевой класс данных
     * @return сохраненный ранее объект данных
     * @throws Exception (FileNotFoundException, JAXBException)
     */
    Object getObject(File file, Class c) throws Exception;

    /**
     * Маршализация - Сохраняет XML файл на основе полученного объекта
     * @param file файл со структурой данных
     * @param o объект данных, который требуется сохранить
     * @throws Exception (IOException, JAXBException)
     */
    void saveObject(File file, Object o) throws Exception;

}
