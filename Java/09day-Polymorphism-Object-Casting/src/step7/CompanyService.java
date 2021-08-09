package step7;

import step4.Animal;
import step4.Monkey;
import step4.Person;
import step4.Tiger;

public class CompanyService {
	
	public void playAll(Animal[] ani) {
		// TODO Auto-generated method stub

		for(int i = 0;i<ani.length;i++) {
			if(ani[i] instanceof Person) {
				((Person) ani[i]).ticketing();
			}
			ani[i].play();
		}
	}


}
