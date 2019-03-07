package com.company.project.core.utils;

import java.util.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author xuah
 * 
 *         2012-12-21-
 */
public class DateUtils {

	private static Log log = LogFactory.getLog(DateUtils.class);

	/**
	 * @return 获取当前时间：年月日
	 */
	public static java.sql.Date newDate() {
		return new java.sql.Date(new Date().getTime());
	}

	/**
	 * @return 获取当前时间：时分秒
	 */
	public static java.sql.Time newTime() {
		return new java.sql.Time(new Date().getTime());
	}

	/**
	 * @return 获取当前时间：年月日 时分秒
	 */
	public static String newDateTime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		return df.format(new Date());//
	}

	/**
	 * @return 获取当前时间：年月日 时分秒
	 * @throws Exception
	 */
	public static Date dateTime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		try {
			return df.parse(newDateTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @return 获取当前时间：年月日 时分秒
	 */
	public static String newSimpleDateTime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmssSSS");// 设置日期格式
		return df.format(new Date());//
	}

	/**
	 * @return 获取当前时间：年月日 时分秒
	 */
	public static String newSimpleDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");// 设置日期格式
		return df.format(new Date());//
	}

	/**
	 * @return 获取当前时间：年月日 时分秒
	 */
	public static String getToday() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");// 设置日期格式
		return df.format(new Date());//
	}

	/**
	 * @return
	 */
	public static java.sql.Timestamp newTimestamp() {
		Timestamp time = new Timestamp(System.currentTimeMillis());// 获取系统当前时间
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeStr = df.format(time);
		time = Timestamp.valueOf(timeStr);
		return time;
	}

	public static String newTimestampStr() {
		Timestamp time = new Timestamp(System.currentTimeMillis());// 获取系统当前时间
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeStr = df.format(time);
		 
		return timeStr;
	}
	/**
	 * @param input
	 * @param format
	 * @return
	 */
	public static Date parse(String input, String format) {
		Date date = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat(format);
			date = df.parse(input);
		} catch (Exception e) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss 'GMT'Z yyyy", Locale.CHINA);
				return sdf.parse(input);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return date;
	}

	/**
	 * @param date
	 * @param field
	 * @param amount
	 * @return
	 */
	public static Date add(Date date, int field, int amount) {
		Calendar cal = date2Cal(date);
		cal.add(field, amount);
		return cal.getTime();
	}

	/**
	 * @param input
	 * @return 浠yyy-MM-dd HH:mm:ss
	 */
	public static Date parse(String input) {
		return parse(input, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * @param input
	 * @return 浠yyy-MM-dd HH:mm:ss
	 */
	public static Date parseStringToDate(String input) {
		return parse(input, "yyyy-MM-dd");
	}

	/**
	 * @param date
	 * @return
	 */
	public static String format(Date date) {
		return format(date, "yyyy-MM-dd HH:mm:ss");
	}

	public static String formatDate(Date date) {
		// TODO Auto-generated method stub
		return format(date, "yyyy-MM-dd");
	}

	/**
	 * @param input
	 * @param format
	 * @return
	 */
	public static String format(Date input, String format) {
		if (input == null)
			return null;
		String date = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat(format);
			date = df.format(input);
		} catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
		}
		return date;
	}

	/**
	 * @param input
	 * @param format
	 * @return
	 */
	public static String format(Calendar input, String format) {
		return format(input.getTime(), format);
	}

	/**
	 * @param input
	 * @return
	 */
	public static String format(Calendar input) {
		return format(input.getTime());
	}

	/**
	 * @return
	 */
	public static Calendar newCal() {
		return Calendar.getInstance(TimeZone.getTimeZone("ETC/GMT-8"));
	}

	/**
	 * @param calendar
	 * @return
	 */
	public static Date cal2Date(Calendar calendar) {
		if (calendar == null)
			return null;
		return new Date(calendar.getTimeInMillis());
	}

	/**
	 * @param date
	 * @return
	 */
	public static Calendar date2Cal(Date date) {
		if (date == null)
			return null;
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("ETC/GMT-8"));
		calendar.setTime(date);
		return calendar;
	}

	public static int getDaysBetween(java.util.Calendar d1, java.util.Calendar d2) {
		if (d1.after(d2)) { // swap dates so that d1 is start and d2 is end
			java.util.Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}
		int days = d2.get(java.util.Calendar.DAY_OF_YEAR) - d1.get(java.util.Calendar.DAY_OF_YEAR);
		int y2 = d2.get(java.util.Calendar.YEAR);
		if (d1.get(java.util.Calendar.YEAR) != y2) {
			d1 = (java.util.Calendar) d1.clone();
			do {
				days += d1.getActualMaximum(java.util.Calendar.DAY_OF_YEAR);
				d1.add(java.util.Calendar.YEAR, 1);
			} while (d1.get(java.util.Calendar.YEAR) != y2);
		}
		return days;
	}

	/**
	 * 
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static int getWorkingDay(java.util.Calendar d1, java.util.Calendar d2) {
		int result = -1;
		if (d1.after(d2)) { // swap dates so that d1 is start and d2 is end
			java.util.Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}

		int betweendays = getDaysBetween(d1, d2);

		int chargeDate = 0;
		int chargeStartDate = 0;//
		int chargeEndDate = 0;//
		//
		int stmp;
		int etmp;
		stmp = 7 - d1.get(Calendar.DAY_OF_WEEK);
		etmp = 7 - d2.get(Calendar.DAY_OF_WEEK);
		if (stmp != 0 && stmp != 6) {//
			chargeStartDate = stmp - 1;
		}
		if (etmp != 0 && etmp != 6) {//
			chargeEndDate = etmp - 1;
		}
		// }
		result = (getDaysBetween(getNextMonday(d1), getNextMonday(d2)) / 7) * 5 + chargeStartDate - chargeEndDate;
		return result;
	}

	public static String getChineseWeek(Date date) {
		return getChineseWeek(date2Cal(date));
	}

	public static String getChineseWeek(Calendar date) {
		final String dayNames[] = { "鏄熸湡鏃�", "鏄熸湡涓�", "鏄熸湡浜�", "鏄熸湡涓�", "鏄熸湡鍥�", "鏄熸湡浜�", "鏄熸湡鍏�" };

		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);

		// System.out.println(dayNames[dayOfWeek - 1]);
		return dayNames[dayOfWeek - 1];

	}

	/**
	 * 
	 * 
	 * @param date
	 * @return
	 */
	public static Calendar getNextMonday(Calendar date) {
		Calendar result = null;
		result = date;
		do {
			result = (Calendar) result.clone();
			result.add(Calendar.DATE, 1);
		} while (result.get(Calendar.DAY_OF_WEEK) != 2);
		return result;
	}

	/**
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static int getHolidays(Calendar d1, Calendar d2) {
		return getDaysBetween(d1, d2) - getWorkingDay(d1, d2);
	}

}
