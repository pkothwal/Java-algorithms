/**
 * 
 */
package com.prahalad.annote;

import java.lang.annotation.Documented;

/**
 * @author kothwal
 *
 */
@Documented
public @interface ClassPreamble {
	
	String author();
	String date();
	int currentRevision() default 1;
	String lastModified() default "N/A";
	String lastModifiedBy() default "N/A";
	String[] reviewers();
	
	
	

}
