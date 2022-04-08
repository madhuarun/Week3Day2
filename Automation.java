package Week3Day3;

public class Automation extends MultipleLanguage implements TestTool,Language {

	
	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}
	
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
	}
	

public static void main(String[] args) {
	
	// TODO Auto-generated method stub
	Automation auto=new Automation();
	auto.java();
	auto.selenium();
	auto.ruby();
	auto.python();
	
	
}


}


