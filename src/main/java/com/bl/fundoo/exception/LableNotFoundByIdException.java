package com.bl.fundoo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LableNotFoundByIdException extends RuntimeException {

	private String message;
	
}
