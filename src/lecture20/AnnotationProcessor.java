package lecture20;

import java.lang.reflect.Field;

public class AnnotationProcessor {

    public static void processNameField(Cat cat) throws NoSuchFieldException, IllegalAccessException {
        Class<? extends Cat> catClass = cat.getClass();
        Field nameField = catClass.getDeclaredField("name");

        Annotation annotation = nameField.getAnnotation(Annotation.class);

        if (annotation.isPrefixNeeded()) {
            System.out.print(annotation.prefix() + ": ");
        }

        nameField.setAccessible(true);
        System.out.println(nameField.get(cat));

    }

}
