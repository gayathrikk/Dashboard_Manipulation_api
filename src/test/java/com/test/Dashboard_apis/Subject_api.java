package com.test.Dashboard_apis;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Subject_api {
	
	
	@Test(priority=1)
	public void subject() {
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/dashboardSubject");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the subject failed. Status code: " + statusCode1);
        
        System.out.println("API request to the subject passed. Status code: " + statusCode1);
	}
@Test(priority=2)
    public void api_waiting()
    
       {
           Response response1 = RestAssured
                   .given()
                   .auth()
                   .basic("admin", "admin")
                   .when()
                   .get("https://apollo2.humanbrain.in/dashboard/queryManipulation/1");

           int statusCode1 = response1.getStatusCode();
           if (statusCode1 == 200) {
           	System.out.println("_________________________******_______________________");
               System.out.println("API request to the Dashboard Manipulation_waiting passed. Status code: " + statusCode1);
               System.out.println("_________________________******_______________________");
           } else {
           	System.out.println("_________________________******_______________________");
               System.out.println("API request to the Dashboard Manipulation_waiting  failed. Status code: " + statusCode1);
           }
           Assert.assertEquals(statusCode1, 200, "API request to the Dashboard Manipulation_waiting failed");
           
       }
	@Test(priority=3)
	public void api_InProgress() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryManipulation/2");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Manipulation_InProgress passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Manipulation_InProgress  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard Manipulation_InProgress failed");
         
     }
		
	@Test(priority=4)
	public void api_Rejected() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryManipulation/5");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Manipulation_Rejected passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Manipulation_Rejected  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard Manipulation_Rejected failed");
         
     }
	@Test(priority=5)
	public void api_SubjectReady() {
		 Response response1 = RestAssured
                .given()
                .auth()
                .basic("admin", "admin")
                .when()
                .get("https://apollo2.humanbrain.in/dashboard/queryManipulation/3");

        int statusCode2 = response1.getStatusCode();
        if (statusCode2 == 200) {
        	System.out.println("_________________________******_______________________");
            System.out.println("API request to the Dashboard Manipulation_Subject_Ready passed. Status code: " + statusCode2);
            System.out.println("_________________________******_______________________");
        } else {
        	System.out.println("_________________________******_______________________");
            System.out.println("API request to the Dashboard Manipulation_Subject_Ready  failed. Status code: " + statusCode2);
        }
        Assert.assertEquals(statusCode2, 200, "API request to the Dashboard Manipulation_Subject_Ready failed");
        
    }
		
	}
