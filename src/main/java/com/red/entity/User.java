package com.red.entity;

import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class User {
	private Integer id;
	private String name;
	private Integer password;
	private Integer age;
	private String sex;

	private Integer userType;

	private String nickName;

	private String address;

	private String idCard;

	@DateTimeFormat(pattern = "YYYY-MM-DD hh:mm:ss")
	private Date birth;
	
	private String phone;
	private String portrait;
	private String email;


	
}
