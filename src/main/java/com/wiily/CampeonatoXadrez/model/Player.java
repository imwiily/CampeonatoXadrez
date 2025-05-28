package com.wiily.CampeonatoXadrez.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public record Player(@JsonProperty("name") String nome,
                     @JsonProperty("level") String nivel,
                     @JsonProperty("gameStyle") String estiloDeJogo) {
}
