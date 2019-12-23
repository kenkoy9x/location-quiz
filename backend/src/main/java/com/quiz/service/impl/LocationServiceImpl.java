package com.quiz.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entity.Location;
import com.quiz.repository.LocationRepository;
import com.quiz.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationRepository locationRepository;

    /**
     * @author kennguyen Creates new location.
     * 
     * @param location input.
     * @return saved location.
     */
    public Location create(Location location) {
        location.setId(UUID.randomUUID().toString());
        return locationRepository.save(location);
    }

    /**
     * @author kennguyen Update existing location.
     * 
     * @param location input.
     * @return saved location.
     */
    public Location update(String id, Location location) {
        location.setId(id);
        return locationRepository.save(location);
    }

    /**
     * @author kennguyen Delete location by location id.
     * 
     * @param id of location.
     */
    public void delete(String id) {
        Location location = locationRepository.findById(id).orElse(null);
        locationRepository.delete(location);
    }

    /**
     *
     * @author kennguyen
     * @return List all locations.
     */
    public List<Location> list() {
        return locationRepository.findAll();
    }

    /**
     * @author kennguyen Get location by location id.
     * 
     * @param location id.
     * @return location.
     */
    public Location getById(String id) {
        return locationRepository.findById(id).orElse(null);
    }

    /**
     * @author kennguyen Finds all location within name
     */
    public List<Location> search(String address) {
        return locationRepository.findByLocationNameIgnoreCaseContaining(address);
    }
}