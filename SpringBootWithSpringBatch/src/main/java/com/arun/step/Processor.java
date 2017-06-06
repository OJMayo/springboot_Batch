/**
 * 
 */
package com.arun.step;

import org.springframework.batch.item.ItemProcessor;

/**
 * @author Adwiti
 *
 */
public class Processor implements ItemProcessor<String, String>{

	/* (non-Javadoc)
	 * @see org.springframework.batch.item.ItemProcessor#process(java.lang.Object)
	 */
	@Override
	public String process(String names) throws Exception {
		return names.toUpperCase();
	}

}
