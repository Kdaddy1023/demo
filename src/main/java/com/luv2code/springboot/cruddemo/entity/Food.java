package com.luv2code.springboot.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "food_name")
    private String food_name;

    @Column(name = "weight")
    private int weight;

    @Column(name = "category")
    private int category;

    @Column(name = "type")
    private int type;

    @Column(name = "calorie")
    private int calorie;

    @Column(name = "meal")
    private int meal;


    public Food() {
    }

    public Food(int id, String food_name, int weight, int category, int type, int calorie, int meal) {
        this.id = id;
        this.food_name = food_name;
        this.weight = weight;
        this.category = category;
        this.type = type;
        this.calorie = calorie;
        this.meal = meal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getMeal() {
        return meal;
    }

    public void setMeal(int meal) {
        this.meal = meal;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", food_name='" + food_name + '\'' +
                ", weight=" + weight +
                ", category=" + category +
                ", type=" + type +
                ", calorie=" + calorie +
                ", meal=" + meal +
                '}';
    }
}
