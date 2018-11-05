package com.example.UpstreamService.Domain.Location;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PastLocation {
    String pastLocationId;
    String cityName;
    String stateName;
    String pin;
}
