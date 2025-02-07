package com.example.demo.exception;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ReservationManagementExceptionHndler {

	@ExceptionHandler
	public ResponseEntity<String> handleSQLException(SQLException e){
		return ResponseEntity
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body("DB接続エラーが発生しました。瞬断を想定");
	}
	
	
	@ExceptionHandler
	public ResponseEntity<String> handleNullPointerException(NullPointerException e){
		return ResponseEntity
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body("値がnullです");
	}
}
