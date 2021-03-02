package com.liubei.code.study.no_5.fieldEditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TODO
 *
 * @Author: ltb
 * @Date: 2021/3/2 15:30
 * @Version: 1.0
 */
public class DatePropertyEditor  extends PropertyEditorSupport {

	private String format = "yyyy-MM-dd";

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println("text:" + text);
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			Date d = sdf.parse(text);
			this.setValue(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
