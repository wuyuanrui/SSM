package com.wyr.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
	void add(String name);
}
