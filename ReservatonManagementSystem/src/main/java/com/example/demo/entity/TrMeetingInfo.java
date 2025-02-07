package com.example.demo.entity;

import java.io.Serial;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TrMeetingInfo {
	
	@Id
	private int memberCode;
	
	private LocalDate reservationDate;
	
	private LocalTime startTime;
	
	private String meetingResult;
	
	private int deleteFlag;
	
	private LocalDateTime registrationDate;
	
	private LocalDateTime updateDate;
	
	

}
