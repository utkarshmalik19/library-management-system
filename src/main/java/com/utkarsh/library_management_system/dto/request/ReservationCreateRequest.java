package com.utkarsh.library_management_system.dto.request;

import jakarta.validation.constraints.NotNull;

public record ReservationCreateRequest(
        @NotNull Long bookId,
        @NotNull Long userId
) {
}
