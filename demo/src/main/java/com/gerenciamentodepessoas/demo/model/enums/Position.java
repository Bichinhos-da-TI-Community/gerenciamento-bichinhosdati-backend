package com.gerenciamentodepessoas.demo.model.enums;
public enum Position {
    MANAGER("Manager"),
    QUALITY_ANALYST("Quality Analyst"),
    DEVELOPER_BACKEND("Developer Backend"),
    DEVELOPER_FRONTEND("Developer Frontend"),
    Team_Leader("Team Leader");

    private final String description;

    Position(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
