package com.example.UpstreamService.Domain.Location;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrentLocation {
    String currentId;
    String cityName;
    String stateName;
    String pinCode;
}
