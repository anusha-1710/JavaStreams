package com.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateApi {

	/*
	 * public static void main(String[] args) { int count = 0;
	 * 
	 * // TODO Auto-generated method stub try { method1(); }
	 * 
	 * catch (CustomException e) { System.err.println("CustomException occurred: " +
	 * e.getMessage()); }
	 * 
	 * } private static LocalDate method1() throws CustomException {
	 * 
	 * LocalDate curDate = LocalDate.now(); LocalDate nxtmonthdate =
	 * curDate.plusMonths(1).withDayOfMonth(1); LocalDate firstSat = nxtmonthdate;
	 * while(firstSat.getDayOfWeek()!= DayOfWeek.SATURDAY) { firstSat =
	 * firstSat.plusDays(1); } System.out.println(firstSat); return firstSat; }
	 */
	
	  public static void main(String[] args) {
	        try {
	            validateAge(15);
	        } catch (CustomException e) {
	            System.err.println("CustomException occurred: " + e.getMessage());
	        }
	    }

	    public static void validateAge(int age) throws CustomException {
	        if (age < 18) {
	            throw new CustomException("Age must be at least 18 years.");
	        } else {
	            System.out.println("Age validated successfully.");
	        }
	    }
		
	}

