package com.eventostec.api.domain.event;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(String title, String description, Date date, String city, String state, Boolean remote, String eventUrl, MultipartFile image) {
    
}
