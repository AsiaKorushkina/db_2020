package heroes;


import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class HeroFactory{

    public static Set<Class<?>> loadClasses(String packageName)
            throws ClassNotFoundException {
        Set<Class<?>> classes = new HashSet<>();
        URL resource = Thread.currentThread()
                .getContextClassLoader()
                .getResource(packageName.replace('.', '/'));
        File directory
                = new File(resource.getFile());
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            return classes;
        }
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".class")) {
                classes.add(Class
                        .forName(String.format("%s.%s",
                                packageName,
                                file.getName().substring(0, file.getName().indexOf(".")))));
            }
        }
        return classes;
    }
    public static boolean checkAllParents(Class<?> type) {
        Class<?> parent = type.getSuperclass();

        return parent != Object.class;
    }

    public Hero createHero(String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        List<Class<?>> s = loadClasses("heroes").stream()
                .filter(HeroFactory::checkAllParents)
                .filter(i -> i != Human.class)
                .collect(Collectors.toList());
        Class<?> randomHeroType = s.get(ThreadLocalRandom.current().nextInt(0, s.size()));
        Constructor<?> c = randomHeroType.getConstructor(String.class);

        return (Hero) c.newInstance(name);
        }
}
