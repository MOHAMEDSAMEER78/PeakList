package com.example.PeakList.repository;

import com.example.PeakList.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Notes, Integer> {
}