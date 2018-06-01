package com.location.location.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.location.entities.Location;
import com.location.location.service.LocationService;
import com.location.location.util.EmailSender;
import com.location.location.util.EmailSenderInterface;

@Controller
public class LocationCtrl {
	@RequestMapping("/ShowCreate")
	public String ShowCreatLocation() {
		return "CreateLocation"; // return the view
	}

	@Autowired
	LocationService locationService;
	
@Autowired
EmailSender send;

	@RequestMapping("/saveLoc")
	public String SaveLocation(@ModelAttribute("location") Location location, ModelMap map) {
		Location savedLocation = locationService.saveLocation(location);

		String msg = " done" + savedLocation.getId();
		;
		map.addAttribute("msg", msg); // to send to the view "name" ,object
//		send.sendEmail("assatayoussef@gmail.com", "test", "hey you");
		send.send("assatayoussef@gmail.com", "assatayoussef@gmail.com", "heyyou","");
		return "CreateLocation"; // return the view
	}

	@RequestMapping("/DisplayLocations")
	public String displayAllLocations(ModelMap map) {

		List<Location> locations = locationService.getALl();
		map.addAttribute("locations", locations);
		
		return "DisplayLocations";
	}

	@RequestMapping("/DeleteLocation")
	public String DeleteLocation(@RequestParam("id") int id, ModelMap map) {
		Location location = locationService.getLocationById(id);
		locationService.deleteLocation(location);
		displayAllLocations(map);
		// List<Location> locations = locationService.getALl();
		// map.addAttribute("locations", locations);
		return "DisplayLocations";
	}

	@RequestMapping("/EditLocation")
	public String ShowEditLocation(@RequestParam("id") int id, ModelMap map) {
		Location location = locationService.getLocationById(id);
		map.addAttribute("location", location);
		// locationService.updateLocation(location);
		// displayAllLocations(map);
		// List<Location> locations = locationService.getALl();
		// map.addAttribute("locations", locations);
		return "EditLocation";
	}

	@RequestMapping("/updateLoc")
	public String updateEditLocation(@ModelAttribute("location") Location location, ModelMap map) {
		locationService.updateLocation(location);
		List<Location> loc = locationService.getALl();
		map.addAttribute("locations", loc);
		return "DisplayLocations";
	}

}
