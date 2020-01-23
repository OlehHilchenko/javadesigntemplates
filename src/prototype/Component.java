package prototype;

public class Component implements CopyComponent {

    String material;
    int length;
    int width;
    int height;

    public Component(String material, int length, int width, int height) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Component{" +
                "material='" + material + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public Object copyComponent() {
        Component component = new Component(material, length, width, height);
        return component;
    }
}
