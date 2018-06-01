package com.location.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.location.location.entities.Location;
import com.location.location.repository.LocationRepository;
import com.location.location.service.LocationService;


@RestController
@RequestMapping("/locations")
public class LocationRestCtrl {
	@Autowired
	LocationRepository locationRepository;
	@Autowired
	LocationService locationService;
	
	
	
	//@RequestMapping(value="/", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@GetMapping
	public  ResponseEntity<List<Location>> GetLocations(){
	//return locationService.getALl();
		return new ResponseEntity<List<Location>> (locationService.getALl() , HttpStatus.OK);

		
	}
	
	@PostMapping
	public Location AddLocation(@RequestBody Location location) {
		locationService.saveLocation(location);
		return location;
		
	}
	@DeleteMapping("/{id}")
	public void DeleteLocation(@PathVariable int id) {
		locationRepository.delete(id);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Location> GetOneLocation(@PathVariable("id") int id) {
//	return	locationService.getLocationById(id);
		//return locationRepository.findOne(id);
		return new ResponseEntity<Location> (locationService.getLocationById(id) , HttpStatus.OK);
	
	}
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Location GetLocationByName(@PathVariable(value="name") String name) {
		return  locationService.getLocationByName(name);
	}


}
