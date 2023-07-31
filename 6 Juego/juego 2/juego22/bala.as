package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	
	public class bala extends MovieClip {
	private var vel: Number=7;
		public function bala(pos_x, pos_y) {
			x= pos_x;
			y= pos_y;
			this.addEventListener(Event.ENTER_FRAME, mover)
		}
		
public function mover(e: Event){
	y-=vel;
	if(y==50){
		vel=0;
		stage.removeChild(this);
		this.removeEventListener(Event.ENTER_FRAME, mover);
		}
		if(this.hitTestObject(setup.antagonista_new)){
			vel=0;
			stage.removeChild(this);
			this.removeEventListener(Event.ENTER_FRAME, mover);
			setup.puntos+=1;
			}
		}
	}
	
}
