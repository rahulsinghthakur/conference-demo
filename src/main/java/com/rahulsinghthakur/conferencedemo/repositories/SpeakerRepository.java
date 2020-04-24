package com.rahulsinghthakur.conferencedemo.repositories;

import com.rahulsinghthakur.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
