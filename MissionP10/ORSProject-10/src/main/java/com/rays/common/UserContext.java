package com.rays.common;

import com.rays.dto.UserDTO;

public class UserContext {

	private Long userId = 0L;
	private String loginId = "root";
	private String name = null;
	private Long defaultRoleId = 0L;
	private String roleName = "root";

	private UserDTO userDto = null;

	public UserContext() {

	}

	public UserContext(UserDTO dto) {

		this.userDto = dto;
		this.userId = dto.getId();
		this.loginId = dto.getLoginId();
		this.name = dto.getName();
		this.defaultRoleId = dto.getRoleId();
		this.roleName = dto.getRoleName();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getDefaultRoleId() {
		return defaultRoleId;
	}

	public void setDefaultRoleId(Long defaultRoleId) {
		this.defaultRoleId = defaultRoleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public UserDTO getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDTO userDto) {
		this.userDto = userDto;
	}
	
	

}
