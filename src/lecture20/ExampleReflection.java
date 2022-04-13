package lecture20;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExampleReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<ExampleReflection> clazz = ExampleReflection.class;
        System.out.println(clazz.getName());
        System.out.println(clazz.getModifiers());

        Class<Cat> catClass = Cat.class;
        Field[] fields = catClass.getFields();
        System.out.println("FIELDS");
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("DECLARED FIELDS");
        Field[] declaredFields = catClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field.getName());
        }

        System.out.println("PRIVATE FIELD ACCESS");
        Cat cat = new Cat("cat", "Fluffy", 3);
        Field nameField = catClass.getDeclaredField("name");
        nameField.setAccessible(true);
        Object catName = nameField.get(cat);
        System.out.println(catName);

        Method printNameMethod =
                catClass.getDeclaredMethod("printName", String.class);
        printNameMethod.setAccessible(true);
        printNameMethod.invoke(cat, "Cat");

        System.out.println("ANNOTATION PROCESSING");
        AnnotationProcessor.processNameField(cat);

    }
}
