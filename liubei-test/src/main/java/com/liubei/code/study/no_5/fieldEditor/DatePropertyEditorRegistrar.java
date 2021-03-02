package com.liubei.code.study.no_5.fieldEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.util.Date;

/**
 * TODO
 *
 * @Author: ltb
 * @Date: 2021/3/2 15:11
 * @Version: 1.0
 */
public class DatePropertyEditorRegistrar implements PropertyEditorRegistrar {
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Date.class, new DatePropertyEditor());
	}
}
