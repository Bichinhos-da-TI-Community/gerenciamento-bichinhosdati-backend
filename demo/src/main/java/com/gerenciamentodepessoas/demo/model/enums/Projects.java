package com.gerenciamentodepessoas.demo.model.enums;

public enum Projects {
    APRENDER_ENSINANDO("Aprender ensinando");
    private final String description;

    Projects(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
