package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//import junit.framework.Assert;

public class ToDoListPage {
	WebDriver driver;
	
	//constructor of Todolistpage class is called 
		
	public ToDoListPage(WebDriver driver) {
		 this.driver =driver;
		 
	 }
		
	//Define elements 
	@FindBy(how=How.CSS,using="input[type='text']")WebElement ENTER_NEW_TODOLIST_CATEGORY;
	
	@FindBy(how=How.CSS,using="input[value='Add']")WebElement CLICK_ADD_BUTTON;
	@FindBy(how=How.CSS,using="input[name='todo[0]']")WebElement VALIDATE_NEW_TODO_LIST;
	@FindBy(how=How.CSS,using="input[name='allbox']")WebElement CLICK_TOGGLEALL_CHECKBOX;	
	@FindBy(how=How.CSS,using="input[name='todo[0]']")WebElement CLICK_NEWTODO_LIST_CHECKBOX;
//	@FindBy(how=How.CSS,using="input[name='todo[0]']")WebElement CLICK_NEWTODO_LIST_CHECKBOX;
	
	
	//Define Interactable Method for Add Category
	public void insertNewToDoListCategory(String category) {
		
		ENTER_NEW_TODOLIST_CATEGORY.sendKeys(category);
		
		}
	
	public void clickAddButton() {
		CLICK_ADD_BUTTON.click();
		
	}
	
	public void validateListItemAdded() {
		
		
		Assert.assertTrue("New added to Do list not available",VALIDATE_NEW_TODO_LIST.isDisplayed());
		
		
	}
	public void clickToggleAllCheckbox() {
		CLICK_TOGGLEALL_CHECKBOX.click();
		
	}
	
	public void newToDoListCheckBox() {
		
		
		CLICK_NEWTODO_LIST_CHECKBOX.click();
		
	}
	
}
