package BuilderPattern.src.demo1;

public class ConcreteBuilder extends Builder {
    /**
     * @label Creates
     */
    private Product product = new Product();

    public void buildPart1() {
        product.setPart1("buildPart1");
    }

    public void buildPart2() {
        product.setPart2("buildPart1");
    }

    public Product retrieveResult() {
        return product;
    }
}
