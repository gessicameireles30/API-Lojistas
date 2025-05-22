package com.Apilojistsimplificado.API.Projeto.Lojistas.dtos;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long senderId, Long receiverId) {

}
