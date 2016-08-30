package reflection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * Created by WEO on 8/23/16.
 */
public class ReflectionTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        User user = new User("U S E R _ N A M E", "S U R N A M E");

        System.out.println("class -> type of object: " + user.getClass().getName());

        Class userClass = user.getClass();

        Method[] methods = userClass.getMethods();

        for (Method method : methods) {
           /* System.out.println(method.getName());*/
            if (method.getName().equals("publicUserMethod")) {
                method.invoke(user, " ALOHA");       // выполни метод

            }
        }

        methods = userClass.getDeclaredMethods();        //забирает приватные методы

        for (Method method : methods) {
            System.out.println(method.getName());
            if (method.getName().equals("privateMethod")) {
                method.setAccessible(true);             // измени модификатор доступа
                method.invoke(user, " ALOHA");
            }
        }

        Field[] declaredFields = userClass.getDeclaredFields();

        for (Field field : declaredFields) {
            field.setAccessible(true);

            System.out.println(field.getName());
            System.out.println(field.get(user));
            int modifiers = field.getModifiers();

            System.out.println(user);

            field.set(user, "new_value");

            System.out.println(user);

            if (Modifier.isPublic(modifiers)) {
                System.out.println("field is public");
            }
            if (Modifier.isPrivate(modifiers)) {
                System.out.println("field is private");
            }
        }

        Constructor [] contstructors = userClass.getConstructors();

        for (Constructor constructor : contstructors) {
            System.out.println(constructor.getName());
            String constructorParameters = Arrays.toString(constructor.getParameterTypes());
            System.out.println(constructorParameters);
        }

        Constructor userClassConstructor = userClass.getConstructor(new Class[]{String.class, String.class});
        User user2 = (User)userClassConstructor.newInstance("user2_name", "user2_surname");
        System.out.println(user2);
    }

}

