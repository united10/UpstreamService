package com.example.UpstreamService.Domain.Location;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Chicklets {
    PastLocation pastLocation;
    CurrentLocation currentLocation;
}
