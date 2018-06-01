package com.location.location.service;

import java.util.List;
import java.util.Optional;

import com.location.location.entities.Location;

public interface LocationServiceInterface {

	
Location saveLocation(Location location);
Location updateLocation(Location location);
Location getLocationById(int id);
List<Location> getALl();
Location getLocationByName(String name);
void deleteLocation(Location location);
}
