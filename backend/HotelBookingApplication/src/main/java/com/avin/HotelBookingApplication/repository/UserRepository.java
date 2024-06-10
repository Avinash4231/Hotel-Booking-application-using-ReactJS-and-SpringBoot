package com.avin.HotelBookingApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avin.HotelBookingApplication.model.User;

import java.util.Optional;



public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    void deleteByEmail(String email);

   Optional<User> findByEmail(String email);
}
