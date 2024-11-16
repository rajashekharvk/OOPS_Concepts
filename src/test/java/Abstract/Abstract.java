package Abstract;

public class Abstract {
	public static void main(String[] args) {
		vlc v=new vlc();
		v.playsong();
		v.pausecontrol();
		v.screencontrol();
		System.out.println("----------------------");
		
		Windows w=new Windows();
		w.playsong();
		w.pausecontrol();
		w.screencontrol();
	}

}
