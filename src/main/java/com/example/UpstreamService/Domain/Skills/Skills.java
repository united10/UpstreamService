package com.example.UpstreamService.Domain.Skills;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Skills {
    String sectionId;
    String userId;
    String operationType;
    Chicklets chicklets;
}
