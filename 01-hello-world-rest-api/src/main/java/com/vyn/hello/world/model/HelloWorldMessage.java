package com.vyn.hello.world.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class HelloWorldMessage {

	@NonNull
	private String message;
	
	@Override
	public String toString() {
		return String.format("HelloWorldMessage [message=%s]", message);
	}
}
