package com.projectshorturl.shorturl.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Shorturl {
    private int id;
    private String original_url;
    private String short_url;
}
