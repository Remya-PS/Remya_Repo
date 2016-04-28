package org.capgemini.myjstl;

import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class MyDateFormat extends SimpleTagSupport{

	
	private String myformat;
	
	
	
	public String getMyformat() {
		return myformat;
	}



	public void setMyformat(String myformat) {
		this.myformat = myformat;
	}



	@Override
	public void doTag() throws JspException, IOException {
		
		String myDFormat="dd-MMM-yyyy";
		SimpleDateFormat myDatesFormat=null;
			
			
			JspWriter out=getJspContext().getOut();
			
			StringWriter str=new StringWriter();
			getJspBody().invoke(str);
			
			
			String myDate=str.toString();
			//System.out.println(myDate);
			if(!myDate.equals("") ){
				if(myDate!=null){
				
				
				if(myformat!=null){
				 myDatesFormat=new SimpleDateFormat(myformat);
				}else
					 myDatesFormat=new SimpleDateFormat(myDFormat);
				
				
				String myDate1= myDate.substring(0, 10);
				int year=Integer.parseInt(myDate1.substring(0, 4));
				int month=Integer.parseInt(myDate1.substring(5, 7));
				int date=Integer.parseInt(myDate1.substring(8,10));
				
				//System.out.println(myDate1 + "-->"+ year+"-" + month + " -"  +date);
				String myFormattedDate=myDatesFormat.format(new Date(year-1900,month-1,date));
						
				out.print(myFormattedDate);
				}
			}
		}
	}

	
