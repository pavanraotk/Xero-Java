package com.xero.api.client;

import static org.junit.Assert.assertTrue;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;

import com.xero.api.ApiClient;
import com.xero.api.client.*;
import com.xero.models.accounting.*;

import java.io.File;
import java.net.URL;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

import org.threeten.bp.*;
import java.io.IOException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import java.util.Calendar;
import java.util.Map;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class AccountingApiEmployeesTest {

	ApiClient defaultClient; 
    AccountingApi accountingApi; 
	String accessToken;
    String xeroTenantId; 
     

    private static boolean setUpIsDone = false;
	
	@Before
	public void setUp() {
		// Set Access Token and Tenant Id
        accessToken = "123";
        xeroTenantId = "xyz";
        
        // Init AccountingApi client
        // NEW Sandbox for API Mocking
		defaultClient = new ApiClient("https://25faf04a-c71e-40e7-b7ce-f1fae0149465.mock.pstmn.io/api.xro/2.0",null,null,null,null);
        accountingApi = AccountingApi.getInstance(defaultClient);   
       
        // ADDED TO MANAGE RATE LIMITS while using SwaggerHub to mock APIs
        if (setUpIsDone) {
            return;
        }

        try {
            System.out.println("Sleep for 60 seconds");
            Thread.sleep(60);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        // do the setup
        setUpIsDone = true;
	}

	public void tearDown() {
		accountingApi = null;
        defaultClient = null;
	}

    @Test
    public void createEmployeeTest() throws IOException {
        System.out.println("@Test - createEmployee");
        Employees employees = new Employees();
        Employees response = accountingApi.createEmployees(accessToken,xeroTenantId,employees, null, false);

        assertThat(response.getEmployees().get(0).getEmployeeID(), is(equalTo(UUID.fromString("e1ada26b-a10e-4065-a941-af34b53740e3"))));
        assertThat(response.getEmployees().get(0).getStatus(), is(equalTo(com.xero.models.accounting.Employee.StatusEnum.ACTIVE)));
        assertThat(response.getEmployees().get(0).getFirstName(), is(equalTo("Nick")));
        assertThat(response.getEmployees().get(0).getLastName(), is(equalTo("Fury")));
        assertThat(response.getEmployees().get(0).getExternalLink().getUrl(), is(equalTo("http://twitter.com/#!/search/Nick+Fury")));
        assertThat(response.getEmployees().get(0).getExternalLink().getDescription(), is(equalTo("Go to external link")));
        assertThat(response.getEmployees().get(0).getUpdatedDateUTCAsDate(), is(equalTo(OffsetDateTime.parse("2019-03-11T17:18:56.463Z"))));
        //System.out.println(response.getEmployees().get(0).toString());
    }

    @Test
    public void getEmployeeTest() throws IOException {
        System.out.println("@Test - getEmployee");
        UUID employeeID = UUID.fromString("8138a266-fb42-49b2-a104-014b7045753d");  
        Employees response = accountingApi.getEmployee(accessToken,xeroTenantId,employeeID);

        assertThat(response.getEmployees().get(0).getEmployeeID(), is(equalTo(UUID.fromString("972615c5-ad3d-47a0-b579-20370d374578"))));
        assertThat(response.getEmployees().get(0).getStatus(), is(equalTo(com.xero.models.accounting.Employee.StatusEnum.ACTIVE)));
        assertThat(response.getEmployees().get(0).getFirstName(), is(equalTo("Tony")));
        assertThat(response.getEmployees().get(0).getLastName(), is(equalTo("Stark")));
        assertThat(response.getEmployees().get(0).getExternalLink().getUrl(), is(equalTo("http://twitter.com/#!/search/Stark+Industries")));
        assertThat(response.getEmployees().get(0).getExternalLink().getDescription(), is(equalTo("Go to external link")));
        assertThat(response.getEmployees().get(0).getUpdatedDateUTCAsDate(), is(equalTo(OffsetDateTime.parse("2019-03-11T17:18:01.593Z"))));
        //System.out.println(response.getEmployees().get(0).toString());
    }
    

    @Test
    public void getEmployeesTest() throws IOException {
        System.out.println("@Test - getEmployees");
        OffsetDateTime ifModifiedSince = null;
        String where = null;
        String order = null;
        Employees response = accountingApi.getEmployees(accessToken,xeroTenantId,ifModifiedSince, where, order);

        assertThat(response.getEmployees().get(0).getEmployeeID(), is(equalTo(UUID.fromString("972615c5-ad3d-47a0-b579-20370d374578"))));
        assertThat(response.getEmployees().get(0).getStatus(), is(equalTo(com.xero.models.accounting.Employee.StatusEnum.ACTIVE)));
        assertThat(response.getEmployees().get(0).getFirstName(), is(equalTo("Tony")));
        assertThat(response.getEmployees().get(0).getLastName(), is(equalTo("Stark")));
        assertThat(response.getEmployees().get(0).getExternalLink().getUrl(), is(equalTo("http://twitter.com/#!/search/Stark+Industries")));
        assertThat(response.getEmployees().get(0).getExternalLink().getDescription(), is(equalTo("Go to external link")));
        assertThat(response.getEmployees().get(0).getUpdatedDateUTCAsDate(), is(equalTo(OffsetDateTime.parse("2019-03-11T17:18:01.593Z"))));
        //System.out.println(response.getEmployees().get(0).toString());
    }

}
