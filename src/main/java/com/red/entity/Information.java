package com.red.entity;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Information {

	private Integer id;
	private String image;
	private String title;
	private String synopsis;//文章简介

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date publicationdate;//文章发表时间

	private Integer user_Id;

	private Integer infomationtype;

	private String content;
	
}
