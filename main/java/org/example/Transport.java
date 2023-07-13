package org.example;

abstract public class Transport {

    private String model;

    public Transport(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println(model + " готов к работе");
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

}
