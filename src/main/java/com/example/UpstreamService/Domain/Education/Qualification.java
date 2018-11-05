package com.example.UpstreamService.Domain.Education;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Qualification {
    String qualificationId;
    String title;
}
