package controller;

import model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Habitat implements ConvertToIncome {
    private String id, name, description;
    private float pricePerAnimal;
    private List<Animal> listAnimales;

    public Habitat(String id, String name, String description, float pricePerAnimal) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.pricePerAnimal = pricePerAnimal;
        this.listAnimales = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPricePerAnimal() {
        return pricePerAnimal;
    }

    public void setPricePerAnimal(float pricePerAnimal) {
        this.pricePerAnimal = pricePerAnimal;
    }

    public void addAnimalToList(Animal animal){
        listAnimales.add(animal);
    }

    public boolean removeAnimalToList(String code){
        for (int i = 0; i < listAnimales.size(); i++){
            if(listAnimales.get(i).getCode().equals(code)){
                listAnimales.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public float calculatePrice() {
        return (listAnimales.size() * pricePerAnimal);
    }
}
