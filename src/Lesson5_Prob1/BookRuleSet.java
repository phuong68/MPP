package Lesson5_Prob1;

import java.awt.Component;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		BookWindow bkw = (BookWindow)ob;
		
//		checkEmptyFields(bkw);
//		checkISBNRule(bkw);
//		checkPrice(bkw);
		
		checkISBNRules(bkw);
		checkPriceRules(bkw);
		
	}
	
	void checkISBNRules(BookWindow bkw) {
		String val = bkw.getIsbnValue().trim();
		int len = val.length();
		
		//All fields must be nonempty
		if (len <=0 ) new RuleException("All fields must be nonempty");
		
		if (len != 10 || len !=13)  new RuleException("Isbn must be numeric and consist of either 10 or 13 characters");
		
		if (len==10 && (val.charAt(0) != '0' || val.charAt(0)!= '1')) new RuleException("Isbn has length 10, the first digit must be 0 or 1");
		
		if (len==13 && (val.substring(0, 2) != "978" || val.substring(0, 2)!= "979")) new RuleException("Isbn has length 13, the first 3 digits must be either 978 or 979");
		
	}
	
	void checkPriceRules(BookWindow bkw) {
		String val = bkw.getPriceValue().trim();
		int len = val.length();
		
		//All fields must be nonempty
		if (len <=0 ) new RuleException("All fields must be nonempty");
		
		if (val.substring(val.indexOf(".")).length() !=2) new RuleException("Price must be a floating point number with two decimal places ");
		
		if (Float.parseFloat(val) <0.49) new RuleException("Price must be a number greater than 0.49");
		
		
	}
	
	

	private void checkPrice(BookWindow bkw ) throws RuleException{
		String val = bkw.getPriceValue().trim();
		double doubleVal = 0.00;
		
		try {
			doubleVal = Double.parseDouble(val);
		} catch(NumberFormatException e) {
			throw new RuleException("Price must be a floating point number.");
		}
		int len = val.length();
		if(len < 3 || val.charAt(len-3) != '.') {
			throw new RuleException("Price must have exactly two digits after the decimal point.");
		}
		if(doubleVal <= 0.49) {
			throw new RuleException("Price must have value bigger than 0.49.");
		}
		
	}

	private void checkISBNRule(BookWindow bkw) throws RuleException{
		String val = bkw.getIsbnValue().trim();
		try {
			Long.parseLong(val);
			
		} catch(NumberFormatException e) {
			throw new RuleException("ISBN must be numeric");
		}	
		int len = val.length();
		if(len != 10 && len != 13) 
			throw new RuleException("Isbn must be numeric and consist of either 10 or 13 characters");
		if(len == 10 && !(val.charAt(0) == '0' || val.charAt(0) == '1')) {
			throw new RuleException("If Isbn has length 10, the first digit must be 0 or 1");
		}
		if(len == 13 && !(val.startsWith("978") || val.startsWith("979"))) {
			throw new RuleException("If Isbn has length 13, the first 3 digits must be either 978 or 979");
		}
		
	}

	private void checkEmptyFields(BookWindow cdwwin) throws RuleException {
		if(cdwwin.getIsbnValue().trim().isEmpty() ||
				cdwwin.getTitleValue().trim().isEmpty() ||
				cdwwin.getPriceValue().trim().isEmpty()) {
				   throw new RuleException("All fields must be nonempty");
			}
		
	}

}
