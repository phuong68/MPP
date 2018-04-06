package Lesson5_Prob1;

import java.awt.Component;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		
		CDWindow cd= (CDWindow) ob;
		checkEmptyFields(cd);
		checkPrice(cd);
		
	}

	private void checkPrice(CDWindow cd) throws RuleException{
		String val = cd.getPriceValue().trim();
		double doubleVal = 0.0;
		try {
			doubleVal = Double.parseDouble(val);
		} catch(NumberFormatException e) {
			throw new RuleException("Price must be a floating point number.");
		}
		int len = val.length();
		if(val.charAt(len-3) != '.') {
			throw new RuleException("Price must have exactly two digits after the decimal point.");
		}
		if(doubleVal <= 0.49) {
			throw new RuleException("Price must have value bigger than 0.49.");
		}
		
	}


	private void checkEmptyFields(CDWindow cd)  throws RuleException{
		if ( cd.getArtistValue().trim().isEmpty()
				||cd.getTitleValue().trim().isEmpty()
					||cd.getPriceValue().trim().isEmpty())
			
			throw new RuleException("All fields must be nonempty");
		
	}
	
}
