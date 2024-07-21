package factory;

public class ElectronicFactory extends ProductFactory {
    @Override
    public Product createProduct() {
        return new Electronic();
    }
}
