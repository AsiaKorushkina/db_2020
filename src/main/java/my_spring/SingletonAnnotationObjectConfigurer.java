package my_spring;

public class SingletonAnnotationObjectConfigurer implements ObjectConfigurer {
    @Override
    public void configure(Object t) {
        Class<?> implClass = t.getClass();
        if (implClass.isAnnotationPresent(Singleton.class)) {
            ObjectFactory.addSingleton(implClass, t);
        }
    }
}
