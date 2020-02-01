package main.java.com.olehhilchenko.javadesigntemplates.behavioral.visitor;

public class Product implements ProductElement {
    ProductElement [] productElements;

    public Product() {
        this.productElements = new ProductElement[]{
                new Weld(),
                new ChopParts(),
                new ReadTheDrawinds()
        };
    }

    @Override
    public void beDone(Welder welder) {
        for(ProductElement element: productElements)
            element.beDone(welder);
    }
}
