package com.portfolio.backend.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "contact_messages")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ContactMessage {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String senderName;
	    private String senderEmail;
	    private String subject;
	    @Column(columnDefinition = "TEXT")
	    private String message;
	    private LocalDateTime sentAt;
	    private Boolean isRead;

	    @PrePersist
	    public void prePersist() {
	        sentAt = LocalDateTime.now();
	        if (isRead == null) isRead = false;
	    }
}
