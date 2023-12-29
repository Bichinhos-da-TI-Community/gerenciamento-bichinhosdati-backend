package com.gerenciamentodepessoas.demo.model.enums;
public enum Seniority {
    JUNIOR("Junior"),
    PLENO("Pleno"),
    SENIOR("Senior");
    private final String description;

    Seniority(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
