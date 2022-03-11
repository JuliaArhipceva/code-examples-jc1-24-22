package lecture9.generics;

public class GenericClassImpl<ID> extends GenericClass<String, Integer, ID> {

    public GenericClassImpl(String field1, Integer field2, ID id) {
        super(field1, field2, id);
    }
}
