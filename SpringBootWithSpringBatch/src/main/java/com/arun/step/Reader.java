/**
 * 
 */
package com.arun.step;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * @author Adwiti
 *
 */
public class Reader implements ItemReader<String> {

	private String[] names = { "arun", "adwiti", "pushpa" };
	private int count;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.batch.item.ItemReader#read()
	 */
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

		if (count < names.length) {
			return names[count++];
		} else {
			count = 0;
		}

		return null;
	}

}
