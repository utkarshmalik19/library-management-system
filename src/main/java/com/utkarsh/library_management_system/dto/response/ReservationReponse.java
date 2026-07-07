package com.utkarsh.library_management_system.dto.response;

import java.time.LocalDate;

public record ReservationReponse(
        Long id,
        BookSummary book,
        Long userId,
        LocalDate reservationDate,
        String status
) {
}
