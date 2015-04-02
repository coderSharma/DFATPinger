package com.DFATTests.Firefox;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.DFATPageObjects.Careers.Roles_VacanciesPageObjects;
import com.DFAT_Australia.BaseClass;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AsisSitePingerTest {
	@Rule public TestName name = new TestName();
	static String TestResults;
	static String ResultReport;
	static String reportContent="";
	boolean answer ;
	protected static WebDriver driver;
	static List<Boolean> Results = new ArrayList<Boolean>();
	static List<String> TcaseName = new ArrayList<String>();
	static String path="src/com/DFATReports/";
	static String CurrentPath;
	static String colour="B6B6B4";
	//public Class<?> enclosingClass = getClass().getEnclosingClass();

	@BeforeClass
	public static void Setup() throws IOException, InterruptedException
	{
		Roles_VacanciesPageObjects RolesAndVacanciesPage = PageFactory.initElements(driver,Roles_VacanciesPageObjects.class);
		CurrentPath=BaseClass.createDateFolder(path);
		ResultReport=CurrentPath+"Screenshot.html";
		BaseClass.SOHTMLGENERAL(ResultReport);
		driver = RolesAndVacanciesPage.browserStackRandomSetup();

	}


	@Test
	public void A_NavigateToIntelligenceOfficerApplicationTest() throws InterruptedException
	{
		System.out.println("Pinged");
	}


	@AfterClass
	public static void teardown() throws IOException
	{
		BaseClass.tearDown(driver,Results,TcaseName,ResultReport);
		File htmlFile = new File(ResultReport);
		Desktop.getDesktop().browse(htmlFile.toURI());
	}


}
