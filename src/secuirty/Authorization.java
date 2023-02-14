package secuirty;

public interface Authorization {
	
	void checkPassword(String password);
	
	void checkDuplicateName(String name);
	
	String addNumberOfAuthentications();
}
