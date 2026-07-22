package com.sist.vo;

import org.apache.ibatis.annotations.Select;

import lombok.Data;
@Data
public class FoodVO {
	private int no;
	private String name, poster, address;
}
