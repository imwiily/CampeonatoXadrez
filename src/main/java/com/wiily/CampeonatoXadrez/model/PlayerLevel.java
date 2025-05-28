package com.wiily.CampeonatoXadrez.model;

public enum PlayerLevel {

    INICIANTE("Iniciante"),
    INTERMEDIARIO("Intermediario"),
    AVANCADO("Avançado");

    final String description;

    PlayerLevel(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

}
