package com.felix.rpc.entity;

import java.util.Date;

import lombok.Data;

@Data
public class UserEntity {

	private Integer id;

	private String account;

	private String passwd;

	private String mobile;

	private String salt;

	private String createBy;

	private String updatedBy;

	private Date createdTime;

	private Date updatedTime;

}
