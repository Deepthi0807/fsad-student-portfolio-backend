package com.portfolio.backend.service;

import com.portfolio.backend.model.ContactMessage;
import com.portfolio.backend.repository.ContactMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactService {
	private final ContactMessageRepository repo;

    public ContactMessage save(ContactMessage msg) { return repo.save(msg); }
    public List<ContactMessage> getAll() { return repo.findAll(); }
    public List<ContactMessage> getUnread() { return repo.findByIsReadFalse(); }
}
	

