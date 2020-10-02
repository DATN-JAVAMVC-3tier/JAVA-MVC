package com.quangnhan.utils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.BeanUtil;

public class FormUtil {
	public static <T> T toModel(Class<T> tClass,HttpServletRequest request) {
		T object = null;
		try {
			object = tClass.newInstance();
			// create key and value thong qua BeanUtill
			// maping từ parameter sang model
			BeanUtils.populate(object, request.getParameterMap());
		} catch (InstantiationException e) {
			System.out.println(e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		} catch (InvocationTargetException e) {
			System.out.println(e.getMessage());
		}
		return object;
	}
}
