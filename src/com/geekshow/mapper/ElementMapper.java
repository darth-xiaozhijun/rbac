package com.geekshow.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.geekshow.pojo.Element;

public interface ElementMapper {
	@Select("select * from element where id in (select eid from role_element where rid=#{0})")
	List<Element> selByRid(int id);
}
