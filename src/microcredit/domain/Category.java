package microcredit.domain;

public enum Category {

	농업(1),교육(2),건강(3),한부모(4),사회적기업(5),소매업(6),식품(7),창업(8),전체(9);
	
	private final int value;
	
	Category(int value) {
		this.value = value;
	}
	
	public static Category valueOf(int value) {
		switch(value) {
		case 1: return Category.농업;
		case 2: return Category.교육;
		case 3: return Category.건강;
		case 4: return Category.한부모;
		case 5: return Category.사회적기업;
		case 6: return Category.소매업;
		case 7: return Category.식품;
		case 8: return Category.창업;
		case 9: return Category.전체;
		default: throw new AssertionError("Unknown Category: " + value);
		}
	}
}
