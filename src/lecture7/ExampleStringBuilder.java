package lecture7;

public class ExampleStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("str");
        String strFromSB = stringBuilder
                .append(5) // str5
                .append("idjsroihj") // str5idjsroihj
                .replace(0, 1, "ortg") // ortgtr5idjsroihj
                .insert(7, true) // ortgtr5trueidjsroihj
                .delete(2, 8) // orrueidjsroihj
                .toString();
        System.out.println(strFromSB);

        long start = System.currentTimeMillis();
        String[] split = strFromSB.split(" ");

        System.out.println(System.lineSeparator());

        // reyiues ertudore eitfuceso erustchjs ertudore
    }
}
