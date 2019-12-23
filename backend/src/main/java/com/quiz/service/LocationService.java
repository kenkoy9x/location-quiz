package com.quiz.service;

import java.util.List;

import com.quiz.entity.Location;

public interface LocationService {
    Location create(Location location);

    Location update(String id, Location location);

    void delete(String id);

    List<Location> list();

    Location getById(String id);

    List<Location> search(String id);
}
