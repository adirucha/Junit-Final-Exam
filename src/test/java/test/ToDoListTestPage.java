package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveListItem;
import page.ToDoListPage;
import util.BrowserFactory;



public class ToDoListTestPage {
	WebDriver driver;
// method created to add the content to the TODO LIST
	String category[] = { "Orange", "lime", "peach" };
	ToDoListPage todolistpage = PageFactory.initElements(driver, ToDoListPage.class);
	RemoveListItem removelistitem = PageFactory.initElements(driver, RemoveListItem.class);

	@Test
	public void validUserAddsToDoList() throws InterruptedException {
		driver = BrowserFactory.init();

		ToDoListPage todolistpage = PageFactory.initElements(driver, ToDoListPage.class);
		RemoveListItem removelistitem = PageFactory.initElements(driver, RemoveListItem.class);
		for (int i = 0; i < 3; i++) {
			todolistpage.insertNewToDoListCategory(category[i]);
			todolistpage.clickAddButton();

			Thread.sleep(3000);

		}
		todolistpage.validateListItemAdded();
		todolistpage.newToDoListCheckBox();
		removelistitem.clickRemoveButton();
		Thread.sleep(1000);
		todolistpage.clickToggleAllCheckbox();
		removelistitem.clickRemoveButton();
		BrowserFactory.tearDown();
	}

}
