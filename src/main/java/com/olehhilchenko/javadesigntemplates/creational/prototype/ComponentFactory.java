package main.java.com.olehhilchenko.javadesigntemplates.creational.prototype;

public class ComponentFactory {

    Component component;

    public ComponentFactory(Component component) {
        this.component = component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    Component cloneComponent() {
        return (Component) component.copyComponent();
    }
}
