package finalproject;

public class WordDef {														
	private String[] wordinput = {"HashMap", "Autoboxing", "Basketball"};
	private String[] worddef = {"A type of Collection.", "Using primitive types in objects.", "My Favorite Sport"};
	private int tracker = 0;

	public String getDefinition(String word){
		for(int ind = 0; ind < wordinput.length; ++ind) {
			if (worddef[ind].equals(word)){
				break;
			}
			++tracker;
		}
		return wordinput[tracker];
	}
	
	public static void main(String[] args) {
		WordDef diction = new WordDef();
		String learn = diction.getDefinition("HashMap");
		System.out.println("The Definition is: " + learn); 
		

	}
}

