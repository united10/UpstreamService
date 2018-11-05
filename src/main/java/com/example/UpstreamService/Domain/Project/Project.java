package com.example.UpstreamService.Domain.Project;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    String sectionId;
    String userId;
    String operationType;
    Chicklets chicklets;
}
