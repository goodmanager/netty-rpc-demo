package com.felix.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDto {

	private String account;

	private String passwd;

	private String verfiyCode;

}
