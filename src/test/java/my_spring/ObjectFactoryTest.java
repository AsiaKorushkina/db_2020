package my_spring;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactoryTest {


    @Test(expected = IllegalArgumentException.class)
    public void injectRandomIntForIncorrectValuesIsFailing() {
        ObjectFactory.getInstance().createObject(Developer.class);
    }

    @Test
    public void injectRandomIntIsWorking() {

        Soldier soldier = ObjectFactory.getInstance().createObject(Soldier.class);
        Assert.assertTrue(soldier.getPower() < 15 && soldier.getPower() > 7);
    }

    @Test
    public void objectWasCreatedFromConfiguredClass() {

        Config config = Mockito.mock(Config.class);

        Mockito.when(config.getImpl(SuperHero.class)).then(invocation -> Batman.class);


        ObjectFactory.getInstance().setConfig(config);
        SuperHero superHero = ObjectFactory.getInstance().createObject(SuperHero.class);
        Assert.assertEquals(Batman.class, superHero.getClass());
    }

    @Test
    public void testIfSingleton() {
        ObjectFactoryContext applicationContext = new ObjectFactoryContextImpl();
        Speaker speaker1 = applicationContext.getObjectFactoryInstance(ConsoleSpeaker.class);
        Speaker speaker2 = applicationContext.getObjectFactoryInstance(ConsoleSpeaker.class);

        Assert.assertEquals(speaker1, speaker2);
    }

    @Test
    public void testIfNotSingleTon() {
        ObjectFactoryContext applicationContext = new ObjectFactoryContextImpl();
        Cleaner cleaner1 = applicationContext.getObjectFactoryInstance(CleanerImpl.class);
        Cleaner cleaner2 = applicationContext.getObjectFactoryInstance(CleanerImpl.class);

        Assert.assertNotEquals(cleaner1, cleaner2);
    }
}























