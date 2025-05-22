package com.Apilojistsimplificado.API.Projeto.Lojistas.dtos;

import com.Apilojistsimplificado.API.Projeto.Lojistas.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
}
