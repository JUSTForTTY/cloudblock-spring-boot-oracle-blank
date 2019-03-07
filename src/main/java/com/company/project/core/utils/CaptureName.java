package com.company.project.core.utils;

/**
 * 
 * @author tty
 * @说明  字符首字母大写
 *
 */
public class CaptureName {

	public static String captureName(String name) {

		char[] cs = name.toCharArray();
		cs[0] -= 32;
		return String.valueOf(cs);

	}
}
