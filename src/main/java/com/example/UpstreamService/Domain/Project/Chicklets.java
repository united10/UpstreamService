package com.example.UpstreamService.Domain.Project;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Chicklets {
    String projectTitle;
    String fromDate;
    String toDate;
    String url;
    String role;
    String[] technologiesUsed;
    String description;
}
