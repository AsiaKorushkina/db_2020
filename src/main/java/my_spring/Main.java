package my_spring;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        Map<Class<?>, Class<?>> map = Map.of(
                Speaker.class, ConsoleSpeaker.class
                );



        ObjectFactoryContext objectFactoryContext = new ObjectFactoryContextImpl(new JavaConfig(map, "my_spring"));

        IRobot iRobot = objectFactoryContext.getObjectFactoryInstance(IRobot.class);
        iRobot.cleanRoom();
    }
}
