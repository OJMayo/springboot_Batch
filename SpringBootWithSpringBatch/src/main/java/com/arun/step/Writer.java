/**
 * 
 */
package com.arun.step;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

/**
 * @author Adwiti
 *
 */
public class Writer implements ItemWriter<String>{

	/* (non-Javadoc)
	 * @see org.springframework.batch.item.ItemWriter#write(java.util.List)
	 */
	@Override
	public void write(List<? extends String> names) throws Exception {
		for(String name : names){
			System.out.println(name);
		}
	}

}
