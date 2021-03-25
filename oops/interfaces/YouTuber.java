package oops.interfaces;

public abstract interface YouTuber extends VideoEditor {   // one interface can extend multiple interfaces
	                                                       // but one class can extend only one class
	                                                       // but one class can implement multiple interfaces
//	public static final int x = 6;
//	void makeVideo();
	int x = 6;   // by default any attribute of interface is public, static and final (so blank variables like x must be initialized)
	
	abstract void makeVideo();
	
	default void uploadVideo() {               //have to use default to make a concrete method which has body otherwise we can't bcz interfaces have abstract functionality by default
		System.out.println("Uploading the video");// ex:to have a new feature
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
