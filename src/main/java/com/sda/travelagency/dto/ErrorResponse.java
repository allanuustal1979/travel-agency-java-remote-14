package com.sda.travelagency.dto;

import java.time.LocalDateTime;

public record ErrorResponse(
        LocalDateTime timestamp,
        int status,
        String errorMessage,
        String path
) {

}
