package lecture9.generics;

public class GenericClass<T, ENTRY, ID> {

    private T field1;

    private ENTRY field2;

    private ID id;

    public GenericClass(T field1, ENTRY field2, ID id) {
        this.field1 = field1;
        this.field2 = field2;
        this.id = id;
    }

    public T method1(ENTRY entry, ID id) {
        this.field2 = entry;
        this.id = id;
        return field1;
    }

    public int method2(ENTRY entry) {
        return 1;
    }

    public ENTRY method3(String parameter) {
        System.out.println(parameter);
        return field2;
    }
}
