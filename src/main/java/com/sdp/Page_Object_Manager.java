package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Booking_Form_Page;
import com.pom.Login_Page;
import com.pom.Search_Page;
import com.pom.Search_Result_Page;

public class Page_Object_Manager {

		//private datatype variable;------------->POJO
		//private WebElement refname;------------>POM
		//private Classname objname;------------->Cls
		
		public WebDriver driver; //null
		
		public Page_Object_Manager(WebDriver driver2) {
			
			this.driver=driver2;
			
		}
		
		//All Page class Creating Object in One Class  
		
		private Login_Page lp;
		
		private Search_Page sp;
		
		private Search_Result_Page srp;
		
		private Booking_Form_Page bf;
		
		//Login Page Object Created getInstanceLogin()
		
		public Login_Page getInstanceLogin() {
			
			if(lp==null) {
			
				lp = new Login_Page(driver);
				
			}
			
			return lp;
				
		}
		
		public Search_Page getInstanceSearch() {
			
			if(sp==null) {
				
				sp = new Search_Page(driver);
				
			}
			
			return sp;
			
		}
		
		public Search_Result_Page getInstanceSearchResult() {
			
			if(srp==null) {
				
				srp = new Search_Result_Page(driver);
				
			}
			
			return srp;
		}
		
		public Booking_Form_Page getInstanceBookingForm() {
			
			if(bf==null) {
				
				bf = new Booking_Form_Page(driver);
			}
			
			return bf;
		}

}
