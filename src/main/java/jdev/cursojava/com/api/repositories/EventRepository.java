package jdev.cursojava.com.api.repositories;

import jdev.cursojava.com.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}

