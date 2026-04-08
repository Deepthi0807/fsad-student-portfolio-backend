package com.portfolio.backend.controller;

import com.portfolio.backend.model.ContactMessage;
import com.portfolio.backend.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class Contactcontroller {
	private final ContactService ContactService;

    @PostMapping
    public ContactMessage submit(@RequestBody ContactMessage msg) {
        return ContactService.save(msg);
    }

    @GetMapping
    public List<ContactMessage> getAll() { return ContactService.getAll(); }

    @GetMapping("/unread")
    public List<ContactMessage> getUnread() { return ContactService.getUnread(); }

}
