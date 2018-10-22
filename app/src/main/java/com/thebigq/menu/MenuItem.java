package com.thebigq.menu;

public class MenuItem {

    String id;
    String name;
    String description;

    public MenuItem() { }

    public MenuItem(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
