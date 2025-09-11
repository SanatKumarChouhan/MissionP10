package com.rays.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_role")
public class RoleDTO extends BaseDTO{
	
	private String role;
	private String description;

}
