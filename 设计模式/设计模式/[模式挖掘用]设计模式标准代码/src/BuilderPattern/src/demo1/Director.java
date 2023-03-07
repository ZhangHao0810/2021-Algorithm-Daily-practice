package BuilderPattern.src.demo1;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart1();
        //�м���ܴ���
        builder.buildPart2();
    }
}
