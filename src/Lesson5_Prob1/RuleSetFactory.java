package Lesson5_Prob1;

import java.awt.Component;
import java.util.HashMap;


final public class RuleSetFactory {
	
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	
	static {
		map.put(CDWindow.class, new CDRuleSet());
		map.put(BookWindow.class, new BookRuleSet());
	}
	
	private RuleSetFactory(){}
	
	public static RuleSet getRuleSet(Component class1) {
		Class<? extends Component> cl = class1.getClass();
		if(!map.containsKey(cl)) {
			throw new IllegalArgumentException("No RuleSet found for this Component");
		}
		return map.get(cl);
	}
	
	
	
	
	
}
