package com.location.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

	Location getLocationByName(String name);

}
