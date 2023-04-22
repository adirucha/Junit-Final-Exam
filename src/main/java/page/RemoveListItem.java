package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveListItem {

	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement CLICK_REMOVE_BUTTON;
	@FindBy(how = How.CSS, using = "input[type='text']")
	WebElement ENTER_NEW_TODOLIST_CATEGORY;
	@FindBy(how = How.CSS, using = "input[value='Add']")
	WebElement CLICK_ADD_BUTTON;

	public void clickRemoveButton() {
		CLICK_REMOVE_BUTTON.click();

	}
	

	

}
