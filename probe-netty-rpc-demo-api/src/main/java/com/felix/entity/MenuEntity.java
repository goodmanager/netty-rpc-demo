package com.felix.entity;

import java.util.Date;

import lombok.Data;

@Data
public class MenuEntity {

	private Integer id;

	private Integer pid;

	private String title;

	private String path;

	private String createdBy;

	private String updatedBy;

	private Date createdTime;

	private Date updatedTime;

}
