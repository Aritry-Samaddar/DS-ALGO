package oops.singletons;

public class AppConfig {
	
	private AppConfig() {
		
	}
//	private static AppConfig obj = new AppConfig();
//	public static AppConfig getInstance() {
//		return obj;
//	}
	private static AppConfig obj = null;                    //more optimized
	public static AppConfig getInstance() {
		if(obj == null) {
			obj = new AppConfig();
		}
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
