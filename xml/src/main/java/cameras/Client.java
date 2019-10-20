/**
 * Spring framework part 1. Lesson 1.
 *
 * @author Dmitry Pozdeyev
 * @version 20.10.2019
 */

/*
 Урок 1. Введение в Spring
1. Настроить проект с использованием Spring и прописать различные настройки бинов.
В качестве практического задания можете сдавать тестовый проект либо вопросы,
которые возникли при изучении данной темы.
*/


package cameras;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        //Добавляем контекст
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Camera camera = context.getBean("camera", Camera.class);
        camera.doPhotograph();
    }
}
