package model;

public class Client {
    private String id, name, phone, email;
    private int countOfVisit, articlesAccumulator;

    public Client(String id, String name, String phone, String email, int countOfVisit, int articlesAccumulator) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.countOfVisit = countOfVisit;
        this.articlesAccumulator = articlesAccumulator;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCountOfVisit() {
        return countOfVisit;
    }

    public void setCountOfVisit(int countOfVisit) {
        this.countOfVisit = countOfVisit;
    }

    public int getArticlesAccumulator() {
        return articlesAccumulator;
    }

    public void setArticlesAccumulator(int articlesAccumulator) {
        this.articlesAccumulator = articlesAccumulator;
    }
}
