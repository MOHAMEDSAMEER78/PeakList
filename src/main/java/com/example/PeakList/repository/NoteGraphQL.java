package com.example.PeakList.repository;

import com.example.PeakList.model.Notes;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class NoteGraphQL {

    private final NoteRepository noteRepository;

    public NoteGraphQL(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @QueryMapping
    public List<Notes> getAllNotes() {
        return noteRepository.findAll();
    }
}