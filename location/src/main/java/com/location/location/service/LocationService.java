package com.location.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.location.entities.Location;
import com.location.location.repository.LocationRepository;
@Service
public class LocationService implements LocationServiceInterface {
	@Autowired // to inject the dependency
  LocationRepository locationRepository;

	@Override
	public Location saveLocation(Location location) {
	return	locationRepository.save(location);
		
	}

	@Override
	public Location updateLocation(Location location) {
	return	locationRepository.save(location);
		
	}

	@Override
	public Location getLocationById(int id) {
	return	locationRepository.getOne(id);
		
	}

	@Override
	public void deleteLocation(Location location) {
		locationRepository.delete(location);
	}

	@Override
	public List<Location> getALl() {
	return	locationRepository.findAll();
		
	}

	@Override
	public Location getLocationByName(String name) {
	return	locationRepository.getLocationByName(name);
		
	}
	

}
