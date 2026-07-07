package com.utkarsh.library_management_system.dto.response;

import java.math.BigDecimal;

public record FineReponse(
        Long id,
        Long loanId,
        BigDecimal amount,
        boolean paid
) {
}
