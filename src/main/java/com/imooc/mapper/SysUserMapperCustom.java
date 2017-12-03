package com.imooc.mapper;

import java.util.List;

import com.imooc.pojo.SysUser;

public interface SysUserMapperCustom {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}