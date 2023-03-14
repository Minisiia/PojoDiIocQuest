package quest;

import quest.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import quest.impl.DarkForest;
import quest.impl.GoldenGrail;
import quest.impl.IslandOfCurses;
import quest.interfaces.Quest;
import quest.pojo.Knight;

/**
 * Створіть інтерфейс Quest і кілька його реалізацій, а також клас Knight.
 * Лицар може приймати будь-яку реалізацію інтерфейсу Quest і виконувати цей Quest успішно.
 * Під час виконання завдання використовувати нові знання про POJO, DI & IoC.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println((char) 27 + "[35m" + "Xml Config" + (char) 27 + "[38m");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        Quest quest1 = applicationContext.getBean("darkForest", DarkForest.class);
        Quest quest2 = applicationContext.getBean("goldenGrail", GoldenGrail.class);
        Quest quest3 = applicationContext.getBean("island", IslandOfCurses.class);
        System.out.println((char) 27 + "[34m" + "Unknown Human Knight" + (char) 27 + "[38m");
        Knight knightHuman = new Knight(quest1);
        knightHuman.doingQuest();
        System.out.println((char) 27 + "[34m" + "Unknown Elf Knight" + (char) 27 + "[38m");
        Knight knightElf = new Knight(quest2);
        knightElf.doingQuest();
        System.out.println((char) 27 + "[34m" + "Unknown Dwarf Knight" + (char) 27 + "[38m");
        Knight knightDwarf = new Knight(quest3);
        knightDwarf.doingQuest();

        System.out.println((char) 27 + "[35m" + "Java Config" + (char) 27 + "[38m");
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println((char) 27 + "[34m" + "Unknown Dragon Knight" + (char) 27 + "[38m");
        Knight knightDragon = context.getBean(Knight.class);
        knightDragon.doingQuest();

    }
}
