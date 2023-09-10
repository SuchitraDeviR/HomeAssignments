package homeassignment.week3.day1.abstraction;

public class Automation extends MultipleLangauge implements TestTool,Language{

	

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java method from Language Interface");
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium method from TestTool Interface");
	}

	@Override
	public void python() {
		// TODO Auto-generated method stub
		System.out.println("python method from MultipleLangauge Abstraction");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby method from MultipleLangauge Abstraction");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation au=new Automation();
		au.java();
		au.selenium();
		au.python();
		au.ruby();
	}

}
