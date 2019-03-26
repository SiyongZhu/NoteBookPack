package com.notebook.demo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.notebook.demo.models.Note;
import com.notebook.demo.models.Notebook;

public interface NoteRepository extends CrudRepository<Note, UUID> {

	public List<Note> findAllByNoteBook(Notebook notebook);
}
