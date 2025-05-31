package com.wiily.CampeonatoXadrez.model;

public enum PlayerGameStyle {

    AGRESSIVO("Agressivo"),
    DEFENSIVO("Defensivo"),
    EQUILIBRADO("Equlibrado");

    final String description;
    PlayerGameStyle(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

}
