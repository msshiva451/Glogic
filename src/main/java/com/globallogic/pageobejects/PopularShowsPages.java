package com.globallogic.pageobejects;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.globallogic.utils.ConfigUtils;
import com.globallogic.utils.ExcelUtils;
import com.globallogic.utils.ObjectRepositoryUtils;
import com.globallogic.utils.seleniumUtils;

public class PopularShowsPages extends seleniumUtils {

	WebDriver driver;
	Logger log;

	public static ConfigUtils config;

	public PopularShowsPages(WebDriver driver) {

		super(driver);
		try {
			config = new ConfigUtils();
		} catch (IOException e) {
			e.printStackTrace();
		}
		log = Logger.getLogger(PopularShowsPages.class);

	}

	public void navigate_to_popular_shows() {
		log.info("======Start scroll_to_popular_shows method=======");
		try {
			// Navigate to popular show
			scroll(ObjectRepositoryUtils.getLocator("popular_label"));
			log.info("Successfully scroll to popular shows");

		} catch (Exception e) {

			e.printStackTrace();
			log.error("Error: in navigate_to_popular_shows method ");
		}
		log.info("End navigate_to_popular_shows method");
	}

	public void explore_show() {
		log.info("======Start explore_show method=======");
		try {
			// Navigate to popular show
			clickelement(ObjectRepositoryUtils.getLocator("explore_show"));
			log.info("Successfully click on explore_show");

		} catch (Exception e) {

			e.printStackTrace();
			log.error("Error: in explore_show method ");
		}
		log.info("End explore_show method");
	}

	public void press_right_arrow_until_element_is_in_visble() {
		log.info("======press_right_arrow_until_element_is_in_visble=======");
		try {

			boolean Flag = true;

			while (Flag) {

				log.info("Checking element present or not");

				if (isDisplayed(ObjectRepositoryUtils.getLocator("right_arrow"))) {

					log.info("Checking element present or not");

					clickelement(ObjectRepositoryUtils.getLocator("right_arrow"));

					log.info("clicked on element ");
				}

				else {

					Flag = false;

				}

			}

		} catch (Exception e) {

			e.printStackTrace();
			log.error("Error: press_right_arrow_until_element_is_in_visble method ");
		}
		log.info("press_right_arrow_until_element_is_in_visble");
	}

	public void load_all_shows_till_end() {
		log.info("======START load_all_shows_till_end=======");
		try {

			boolean Flag = true;

			List<WebElement> list_element;
			ArrayList<String> episode_title, episode_duration;
			scroll(ObjectRepositoryUtils.getLocator("show_more"));

			while (Flag) {

				log.info("Checking element present or not");

				if (isDisplayed(ObjectRepositoryUtils.getLocator("show_more"))) {

					log.info("Checking element present or not");

					scroll(ObjectRepositoryUtils.getLocator("show_more"));

					clickelement(ObjectRepositoryUtils.getLocator("show_more"));

					log.info("clicked on element ");
				}

				else {

					Flag = false;

				}

			}

			list_element = findElements(ObjectRepositoryUtils.getLocator("episode_title"));
			episode_title = new ArrayList<String>();

			for (WebElement element : list_element) {

				System.out.println("Episode Title : " + element.getText());

				episode_title.add(element.getText());

			}

			list_element = findElements(ObjectRepositoryUtils.getLocator("episode_duration"));
			episode_duration = new ArrayList<String>();

			for (WebElement element : list_element) {

				System.out.println("Episode Durations : " + element.getText());

				episode_duration.add(element.getText());

			}

			write_to_file(episode_title, episode_duration);

		} catch (Exception e) {

			e.printStackTrace();
			log.error("Error: press_right_arrow_until_element_is_in_visble method ");
		}
		log.info(" END load_all_shows_till_end");
	}

	public void write_to_file(ArrayList<String> episode_tile, ArrayList<String> episode_durations) {

		try {

			Date date = new Date();
			long time = date.getTime();
			String filepath = System.getProperty("user.dir") + File.separator + "Report" + File.separator + "Episode_"
					+ time + ".xlsx";

			ExcelUtils eutil = new ExcelUtils(filepath);
			File reportFile = new File(filepath);

			eutil.createExcelFileandWriteCell(filepath, episode_tile, episode_durations);

		} catch (Exception e) {

			e.printStackTrace();

			log.error("Unable to write file due to" + e.getMessage());

		}
	}
}
