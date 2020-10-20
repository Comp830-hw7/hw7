package hw7;

public class AnimalClassTester {
	public boolean testAnimalObject(Object animal) {
		if (animal instanceof Cow) {
			Cow c = (Cow) animal;
			ExpectedCow ex = new ExpectedCow();
			if (c.getName().equals(ex.expectedName())) {
				if (c.roar().equals(ex.expectedFood())) {
					if (c.myFood().equals(ex.expectedInfo())) {
						return true;
					}
				}
			}
		} else if (animal instanceof Tyrannosaur) {
			Tyrannosaur t = (Tyrannosaur) animal;
			if (t.getName().contentEquals("Tyrannosaurus Rex")) {
				if (t.roar().equals("Roarrrr!")) {
					if (t.myFood().equals("other dinosaurs")) {
						return true;
					}
				}
			}
		} else if (animal instanceof Penguin) {
			Penguin p = (Penguin) animal;
			if (p.getName().equals("Penguin")) {
				if (p.roar().equals("aahhh")) {
					if (p.myFood().equalsIgnoreCase("Fish")) {
						return true;
					}
				}
			}
		}else if (animal instanceof TreeClimbingOctopus) {
			TreeClimbingOctopus o = (TreeClimbingOctopus) animal;
			if (o.getName().equals("Tree climbing octopus")) {
				if (o.roar().equals("Grrrrr!")) {
					if (o.myFood().equals("Small fishes")) {
						return true;
					}
				}
				
			}
		}
		return false;
	}

}
